/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.tonapi.models

import io.tonapi.models.AccountAddress

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param subscriber 
 * @param subscription 
 * @param beneficiary 
 */


data class UnSubscriptionAction (

    @Json(name = "subscriber")
    val subscriber: AccountAddress,

    @Json(name = "subscription")
    val subscription: kotlin.String,

    @Json(name = "beneficiary")
    val beneficiary: AccountAddress

)
