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

import io.tonapi.models.AccountStorageInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param address 
 * @param balance 
 * @param lastTransactionLt 
 * @param status 
 * @param storage 
 * @param extraBalance 
 * @param code 
 * @param `data` 
 */


data class BlockchainRawAccount (

    @Json(name = "address")
    val address: kotlin.String,

    @Json(name = "balance")
    val balance: kotlin.Long,

    @Json(name = "last_transaction_lt")
    val lastTransactionLt: kotlin.Long,

    @Json(name = "status")
    val status: kotlin.String,

    @Json(name = "storage")
    val storage: AccountStorageInfo,

    @Json(name = "extra_balance")
    val extraBalance: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Json(name = "code")
    val code: kotlin.String? = null,

    @Json(name = "data")
    val `data`: kotlin.String? = null

)

