package at.voyagers.pokemon.api

import at.voyagers.pokemon.repository.PokemonKrNameRepository

class CallNameHandler(
    val pokemonKrNameRepository: PokemonKrNameRepository,
) : InputMappingHandler {

    override fun support(input: String): Boolean {
        return input == "name"
    }

    override fun execute(vararg args: String) {
        val name = args[0]
        val number = pokemonKrNameRepository.findPokemon(name)
        print("$number $name")
    }
}