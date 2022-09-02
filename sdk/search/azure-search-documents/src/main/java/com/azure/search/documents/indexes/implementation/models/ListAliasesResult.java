// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.search.documents.indexes.models.SearchAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response from a List Aliases request. If successful, it includes the associated index mappings for all aliases. */
@Immutable
public final class ListAliasesResult {
    /*
     * The aliases in the Search service.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchAlias> aliases;

    /**
     * Creates an instance of ListAliasesResult class.
     *
     * @param aliases the aliases value to set.
     */
    @JsonCreator
    public ListAliasesResult(
            @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<SearchAlias> aliases) {
        this.aliases = aliases;
    }

    /**
     * Get the aliases property: The aliases in the Search service.
     *
     * @return the aliases value.
     */
    public List<SearchAlias> getAliases() {
        return this.aliases;
    }
}
