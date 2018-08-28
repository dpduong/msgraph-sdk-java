// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRestoreRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Directory Object Restore Request Builder.
 */
public interface IBaseDirectoryObjectRestoreRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDirectoryObjectRestoreRequest
     *
     * @return the IDirectoryObjectRestoreRequest instance
     */
    IDirectoryObjectRestoreRequest buildRequest();

    /**
     * Creates the IDirectoryObjectRestoreRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDirectoryObjectRestoreRequest instance
     */
    IDirectoryObjectRestoreRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}