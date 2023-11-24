package at.voyagers.pokemon

import at.voyagers.pokemon.client.PokeApiClient
import at.voyagers.pokemon.api.*

class PokemonApplication

fun main(args: Array<String>) {
    val pokeApiClient = PokeApiClient()
    val numberKrNames = NumberKrNames()

//    val requestMappingHandlers: List<RequestMappingHandler> = listOf(
//        ReadAll(numberKrNames),
//        ReadOneHandler(pokeApiClient, "1"),
//        CallName(numberKrNames, "1"),
//        CallNumber(numberKrNames, "1")
//    )

    while (true) {
        val input = readLine()
        if (input.isNullOrBlank()) {
//            println("")
            continue
        }
        if (input == "exit") {
            break
        }
//        for (requestMappingHandler in requestMappingHandlers) {
//            if (requestMappingHandler.support(input))
//        }

        if (input == "ls") {
            val readAll = ReadAll(numberKrNames)
            readAll.execute()
        }
        if (input?.startsWith("info") == true) {
            val pokemonIdentifier = input.split(" ")[1]
            val readOneHandler = ReadOneHandler(pokeApiClient, pokemonIdentifier)
            readOneHandler.execute()
        }
        if (input?.startsWith("name") == true) {
            val pokemonIdentifier = input.split(" ")[1]
            val callName = CallName(numberKrNames, pokemonIdentifier)
            callName.execute()
        }
        if (input?.startsWith("number") == true) {
            val pokemonIdentifier = input.split(" ")[1]
            val callNumber = CallNumber(numberKrNames, pokemonIdentifier.toInt())
            callNumber.execute()
        }
    }
}
