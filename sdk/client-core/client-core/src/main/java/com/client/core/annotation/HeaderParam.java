// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Replaces the header with the value of its target. The value specified here replaces headers specified statically in
 * the {@link Headers}. If the parameter this annotation is attached to is a Map type, then this will be treated as a
 * header collection. In that case each of the entries in the argument's map will be individual header values that use
 * the value of this annotation as a prefix to their key/header name.
 *
 * <p><strong>Example 1:</strong></p>
 *
 * <!-- src_embed com.client.core.annotation.HeaderParam.class1 -->
 * <pre>
 * &#64;Put&#40;&quot;&#123;functionId&#125;&quot;&#41;
 * Mono&lt;ResponseBase&lt;ResponseHeaders, ResponseBody&gt;&gt; createOrReplace&#40;
 *     &#64;PathParam&#40;value = &quot;functionId&quot;, encoded = true&#41; String functionId,
 *     &#64;BodyParam&#40;&quot;application&#47;json&quot;&#41; RequestBody function,
 *     &#64;HeaderParam&#40;&quot;If-Match&quot;&#41; String ifMatch&#41;;
 *
 * &#47;&#47; &quot;If-Match: user passed value&quot; will show up as one of the headers.
 * </pre>
 * <!-- end com.client.core.annotation.HeaderParam.class1 -->
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <!-- src_embed com.client.core.annotation.HeaderParam.class2 -->
 * <pre>
 * &#64;Get&#40;&quot;subscriptions&#47;&#123;subscriptionId&#125;&#47;providers&#47;Microsoft.ServiceBus&#47;namespaces&quot;&#41;
 * Mono&lt;ResponseBase&lt;ResponseHeaders, ResponseBody&gt;&gt; list&#40;&#64;PathParam&#40;&quot;subscriptionId&quot;&#41; String subscriptionId,
 *     &#64;HeaderParam&#40;&quot;accept-language&quot;&#41; String acceptLanguage,
 *     &#64;HeaderParam&#40;&quot;User-Agent&quot;&#41; String userAgent&#41;;
 *
 * &#47;&#47; &quot;accept-language&quot; generated by the HTTP client will be overwritten by the user passed value.
 * </pre>
 * <!-- end com.client.core.annotation.HeaderParam.class2 -->
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <!-- src_embed com.client.core.annotation.HeaderParam.class3 -->
 * <pre>
 * &#64;Get&#40;&quot;subscriptions&#47;&#123;subscriptionId&#125;&#47;providers&#47;Microsoft.ServiceBus&#47;namespaces&quot;&#41;
 * Mono&lt;ResponseBase&lt;ResponseHeaders, ResponseBody&gt;&gt; list&#40;&#64;PathParam&#40;&quot;subscriptionId&quot;&#41; String subscriptionId,
 *     &#64;HeaderParam&#40;&quot;Authorization&quot;&#41; String token&#41;;
 *
 * &#47;&#47; The token parameter will replace the effect of any credentials in the HttpPipeline.
 * </pre>
 * <!-- end com.client.core.annotation.HeaderParam.class3 -->
 *
 * <p><strong>Example 4:</strong></p>
 *
 * <!-- src_embed com.client.core.annotation.HeaderParam.class4 -->
 * <pre>
 * &#64;Put&#40;&quot;&#123;containerName&#125;&#47;&#123;blob&#125;&quot;&#41;
 * &#64;ExpectedResponses&#40;&#123;200&#125;&#41;
 * Mono&lt;ResponseBase&lt;ResponseHeaders, Void&gt;&gt; setMetadata&#40;&#64;PathParam&#40;&quot;containerName&quot;&#41; String containerName,
 *     &#64;PathParam&#40;&quot;blob&quot;&#41; String blob,
 *     &#64;HeaderParam&#40;&quot;x-ms-meta-&quot;&#41; Map&lt;String, String&gt; metadata&#41;;
 *
 * &#47;&#47; The metadata parameter will be expanded out so that each entry becomes
 * &#47;&#47; &quot;x-ms-meta-&#123;&#64;literal &lt;entryKey&gt;&#125;: &#123;&#64;literal &lt;entryValue&gt;&#125;&quot;.
 * </pre>
 * <!-- end com.client.core.annotation.HeaderParam.class4 -->
 */
@Retention(RUNTIME)
@Target(PARAMETER)
public @interface HeaderParam {
    /**
     * The name of the variable in the endpoint uri template which will be replaced with the value of the parameter
     * annotated with this annotation.
     *
     * @return The name of the variable in the endpoint uri template which will be replaced with the value of the
     * parameter annotated with this annotation.
     */
    String value();
}
