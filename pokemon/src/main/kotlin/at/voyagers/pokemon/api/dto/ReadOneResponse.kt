package at.voyagers.pokemon.api.dto

import at.voyagers.pokemon.client.dto.Pokemon
import at.voyagers.pokemon.client.dto.PokemonSpecies
import kotlin.math.min

data class ReadOneResponse(
    val number: Int,
    val name: String,
    val description: String,
    val moves: List<String>,
    val attributes: List<String>,
    val happinessPoint: Int,
    val tier: Tier,
) {
    companion object {
        fun of(
            pokemon: Pokemon,
            pokemonSpecies: PokemonSpecies,
        ): ReadOneResponse {
            val endIndex = min(pokemon.moves.size, 20)
            return ReadOneResponse(
                number = pokemon.id,
                name = pokemon.name,
                description = "",
                moves = pokemon.moves.subList(0, endIndex).map { it.move.name },
                attributes = pokemon.types.map { it.type.name },
                happinessPoint = pokemonSpecies.baseHappiness,
                tier = Tier.of(
                    pokemonSpecies.isBaby,
                    pokemonSpecies.isLegendary,
                    pokemonSpecies.isMythical
                )
            )
        }
    }
}