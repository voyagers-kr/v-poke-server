package at.voyagers.pokemon.application.usecase

import at.voyagers.pokemon.domain.Pokemon

interface PokemonRetrieveUseCase {
    fun retrievePokemon(id: Long): Pokemon
    fun retrieveAllPokemon(): List<Pokemon>
}