package at.voyagers.pokemon.application.output

import at.voyagers.pokemon.domain.Pokemon

interface PokemonManagementOutputPort {
    fun getPokemon(number: String): Pokemon
    fun getAllPokemon(): List<Pokemon>
}