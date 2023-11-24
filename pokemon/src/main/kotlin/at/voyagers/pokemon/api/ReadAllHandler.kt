package at.voyagers.pokemon.api

import at.voyagers.pokemon.repository.PokemonKrNameRepository

class ReadAllHandler (
    val pokemonKrNameRepository: PokemonKrNameRepository,
) : InputMappingHandler {

    override fun support(input: String): Boolean {
        return input == "ls"
    }

    override fun execute(vararg args: String) {
        pokemonKrNameRepository.map.forEach { (number, krName) ->
            println("${number}. ${krName}")
        }
    }
}

