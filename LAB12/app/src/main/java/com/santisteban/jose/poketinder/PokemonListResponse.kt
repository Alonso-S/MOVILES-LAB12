package com.santisteban.jose.poketinder

data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<PokemonResponse>
)

