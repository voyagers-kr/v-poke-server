package at.voyagers.pokemon

import at.voyagers.pokemon.client.PokeApiClient
import at.voyagers.pokemon.subcommand.CallName
import at.voyagers.pokemon.subcommand.NumberKrNames
import at.voyagers.pokemon.subcommand.ReadAll
import at.voyagers.pokemon.subcommand.ReadOne

class PokemonApplication

fun main(args: Array<String>) {
    val pokeApiClient = PokeApiClient()
    val numberKrNames = NumberKrNames()

    while (true) {
        val input = readLine()
        if (input == "exit") {
            break
        }
        if (input == "ls") {
            val readAll = ReadAll(numberKrNames)
            readAll.execute()
        }
        if (input?.startsWith("info") == true) {
            val pokemonIdentifier = input.split(" ")[1]
            val readOne = ReadOne(pokeApiClient, pokemonIdentifier)
            readOne.execute()
        }
        if (input?.startsWith("name") == true) {
            val pokemonIdentifier = input.split(" ")[1]
            val callName = CallName(numberKrNames, pokemonIdentifier)
            callName.execute()
        }
    }
}
