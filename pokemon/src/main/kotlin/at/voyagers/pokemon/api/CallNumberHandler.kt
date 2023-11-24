package at.voyagers.pokemon.api

import at.voyagers.pokemon.repository.PokemonKrNameRepository

class CallNumberHandler(
    val pokemonKrNameRepository: PokemonKrNameRepository,
) : InputMappingHandler {

    override fun support(input: String): Boolean {
        return input == "number"
    }

    override fun execute(vararg args: String) {
        val number = args[0]
        val name = pokemonKrNameRepository.findPokemon(number)
        print("$number $name")
    }

}