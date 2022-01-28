package me.ibrahimsn.lib.internal.model

import me.ibrahimsn.lib.api.Country
import me.ibrahimsn.lib.internal.pattern.CountryPattern

sealed class State {

    object Ready : State()

    data class Attached(
        val country: Country,
        val pattern: String,
    ) : State()
}
