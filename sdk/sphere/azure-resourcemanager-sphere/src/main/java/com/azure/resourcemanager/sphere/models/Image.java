// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sphere.fluent.models.ImageInner;

/** An immutable client-side representation of Image. */
public interface Image {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the image property: Image as a UTF-8 encoded base 64 string on image create. This field contains the image
     * URI on image reads.
     *
     * @return the image value.
     */
    String image();

    /**
     * Gets the imageId property: Image ID.
     *
     * @return the imageId value.
     */
    String imageId();

    /**
     * Gets the imageName property: Image name.
     *
     * @return the imageName value.
     */
    String imageName();

    /**
     * Gets the regionalDataBoundary property: Regional data boundary for an image.
     *
     * @return the regionalDataBoundary value.
     */
    RegionalDataBoundary regionalDataBoundary();

    /**
     * Gets the uri property: Location the image.
     *
     * @return the uri value.
     */
    String uri();

    /**
     * Gets the description property: The image description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the componentId property: The image component id.
     *
     * @return the componentId value.
     */
    String componentId();

    /**
     * Gets the imageType property: The image type.
     *
     * @return the imageType value.
     */
    ImageType imageType();

    /**
     * Gets the provisioningState property: The status of the last operation.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.sphere.fluent.models.ImageInner object.
     *
     * @return the inner object.
     */
    ImageInner innerModel();

    /** The entirety of the Image definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The Image definition stages. */
    interface DefinitionStages {
        /** The first stage of the Image definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the Image definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, catalogName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param catalogName Name of catalog.
             * @return the next definition stage.
             */
            WithCreate withExistingCatalog(String resourceGroupName, String catalogName);
        }

        /**
         * The stage of the Image definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithImage,
                DefinitionStages.WithImageId,
                DefinitionStages.WithRegionalDataBoundary {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Image create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Image create(Context context);
        }

        /** The stage of the Image definition allowing to specify image. */
        interface WithImage {
            /**
             * Specifies the image property: Image as a UTF-8 encoded base 64 string on image create. This field
             * contains the image URI on image reads..
             *
             * @param image Image as a UTF-8 encoded base 64 string on image create. This field contains the image URI
             *     on image reads.
             * @return the next definition stage.
             */
            WithCreate withImage(String image);
        }

        /** The stage of the Image definition allowing to specify imageId. */
        interface WithImageId {
            /**
             * Specifies the imageId property: Image ID.
             *
             * @param imageId Image ID.
             * @return the next definition stage.
             */
            WithCreate withImageId(String imageId);
        }

        /** The stage of the Image definition allowing to specify regionalDataBoundary. */
        interface WithRegionalDataBoundary {
            /**
             * Specifies the regionalDataBoundary property: Regional data boundary for an image.
             *
             * @param regionalDataBoundary Regional data boundary for an image.
             * @return the next definition stage.
             */
            WithCreate withRegionalDataBoundary(RegionalDataBoundary regionalDataBoundary);
        }
    }

    /**
     * Begins update for the Image resource.
     *
     * @return the stage of resource update.
     */
    Image.Update update();

    /** The template for Image update. */
    interface Update {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Image apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Image apply(Context context);
    }

    /** The Image update stages. */
    interface UpdateStages {
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Image refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Image refresh(Context context);
}
