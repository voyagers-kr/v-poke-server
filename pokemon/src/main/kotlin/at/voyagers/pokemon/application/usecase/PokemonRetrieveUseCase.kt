package at.voyagers.pokemon.application.usecase

import at.voyagers.pokemon.domain.Pokemon

interface PokemonRetrieveUseCase {
    fun retrievePokemon(number: String): Pokemon
    fun retrieveAllPokemon(): List<Pokemon>
}