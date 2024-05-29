package com.tonapps.tonkeeper.ui.screen.buyOrSell.utils.model.fiatModel

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Operation (
    @SerialName("assets")val assets: List<String>? = null,
    @SerialName("items")val items: List<Item>? = null,
    @SerialName("subtitle")val subtitle: String,
    @SerialName("title")val title: String,
    @SerialName("type")val type: String
)