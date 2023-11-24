package at.voyagers.pokemon.application.output

import at.voyagers.pokemon.domain.Pokemon

interface PokemonApiOutputPort {
    fun getPokemonSpecies(): List<Pokemon>
}