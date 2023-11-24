package at.voyagers.pokemon.application.input

import at.voyagers.pokemon.application.output.PokemonImageOutputPort
import at.voyagers.pokemon.application.output.PokemonManagementOutputPort
import at.voyagers.pokemon.application.usecase.PokemonRetrieveUseCase
import at.voyagers.pokemon.domain.Pokemon
import org.springframework.stereotype.Service

@Service
class PokemonRetrieveInputPort(
    private val pokemonManagementOutputPort: PokemonManagementOutputPort,
    private val pokemonImageOutputPort: PokemonImageOutputPort,
) : PokemonRetrieveUseCase {

    override fun retrievePokemon(number: String): Pokemon {
        val pokemon = pokemonManagementOutputPort.getPokemon(number)
        pokemon.updateImage(pokemonImageOutputPort.getPokemonImage(pokemon.number))
        return pokemon
    }

    override fun retrieveAllPokemon(): List<Pokemon> {
        return pokemonManagementOutputPort.getAllPokemon()
    }

}