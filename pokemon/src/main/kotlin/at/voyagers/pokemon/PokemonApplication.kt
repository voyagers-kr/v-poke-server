package at.voyagers.pokemon

import at.voyagers.pokemon.api.*
import at.voyagers.pokemon.client.PokeApiClient
import at.voyagers.pokemon.repository.PokemonKrNameRepository

class PokemonApplication

val DELIMETER = " "
fun main(args: Array<String>) {
    val pokeApiClient = PokeApiClient()
    val pokemonKrNameRepository = PokemonKrNameRepository()

    val inputMappingHandlers: List<InputMappingHandler> = listOf(
        ReadAllHandler(pokemonKrNameRepository),
        ReadOneHandler(pokeApiClient),
        CallNameHandler(pokemonKrNameRepository),
        CallNumberHandler(pokemonKrNameRepository)
    )

    while (true) {
        val input = readlnOrNull()
        if (input.isNullOrBlank()) {
            println("please input command")
            continue
        }
        if (input == "exit") {
            break
        }

        for (inputMappingHandler in inputMappingHandlers) {
            val inputValues = input.split(DELIMETER)
            if (inputMappingHandler.support(resolveMappingKey(inputValues))) {
                inputMappingHandler.execute(*resolveArguments(inputValues))
            }
        }
    }
}

private fun resolveMappingKey(inputValues: List<String>): String {
    return inputValues[0]
}

private fun resolveArguments(inputValues: List<String>) =
    if (inputValues.size > 1) {
        inputValues.subList(1, inputValues.size).toTypedArray()
    } else {
        emptyArray()
    }

