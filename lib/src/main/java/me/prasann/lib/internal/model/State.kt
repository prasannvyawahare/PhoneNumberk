package me.prasann.lib.internal.model

import me.prasann.lib.api.Country

sealed class State {

    object Ready : State()

    data class Attached(
        val country: Country,
        val pattern: String,
    ) : State()
}
