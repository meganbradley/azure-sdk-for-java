param (
    [hashtable] $DeploymentOutputs
)
function getVariable {
    param (
        $name
    )
    if ($null -ne $DeploymentOutputs -and $DeploymentOutputs.ContainsKey($name)) {
        return $DeploymentOutputs[$name]
    }
    if (test-path "env:\$name") {
        return (Get-Item "env:\$name").Value
    }
    Write-Error "Could not find value for $name"
    exit 1
}


$webappRoot = "$PSScriptRoot/identity-mi-server" | Resolve-Path

Write-Host "webappRoot: $webappRoot"
$webappRootPom = "$webappRoot/pom.xml" | Resolve-Path

Write-Host "webappRootPom: $webappRootPom"
# $workingFolder = $webappRoot;

$funcAppRoot = "$PSScriptRoot/live-test-apps/identity-test-function" | Resolve-Path
$funcAppPom = "$funcAppRoot/pom.xml" | Resolve-Path

# if ($null -ne $Env:AGENT_WORKFOLDER) {
#     $workingFolder = $Env:AGENT_WORKFOLDER
# }
az login --service-principal -u $(getVariable('IDENTITY_CLIENT_ID')) -p $(getVariable('IDENTITY_CLIENT_SECRET')) --tenant $(getVariable('IDENTITY_TENANT_ID'))
az account set --subscription $(getVariable('IDENTITY_SUBSCRIPTION_ID'))

mvn --version | Write-Host

mvn clean package $webappRootPom
az webapp deploy --resource-group $(getVariable('IDENTITY_RESOURCE_GROUP')) --name $(getVariable('IDENTITY_WEBAPP_NAME')) --src-path "$webappRoot/target/identity-mi-server-0.0.1-SNAPSHOT.jar" --type jar
# Remove-Item -Force -Recurse "$workingFolder/target"
# if ($null -eq $Env:AGENT_WORKFOLDER) {
#     Remove-Item -Force -Recurse "$webappRoot/%AGENT_WORKFOLDER%"
# }

if (Test-Path -Path "$webappRoot/target/identity-mi-server-0.0.1-SNAPSHOT.jar" -PathType Leaf) {
    Write-Host "The file exists!"
} else {
    Write-Host "The file does not exist."
}

Write-Host "working on function"

# build function app
mvn clean package "-DfunctionAppName=$(getVariable('IDENTITY_FUNCTION_NAME'))" "-DresourceGroup=$(getVariable('IDENTITY_RESOURCE_GROUP'))" "-DappServicePlanName=$(getVariable('IDENTITY_APPSERVICE_NAME'))" -f $funcAppPom
compress-archive  "$funcAppRoot\target\azure-functions\$(getVariable('IDENTITY_FUNCTION_NAME'))\*" -DestinationPath "$funcAppRoot\target\funcpackage.zip"
az functionapp deployment source config-zip -g $(getVariable('IDENTITY_RESOURCE_GROUP')) -n $(getVariable('IDENTITY_FUNCTION_NAME')) --src "$funcAppRoot\target\funcpackage.zip"
az logout

