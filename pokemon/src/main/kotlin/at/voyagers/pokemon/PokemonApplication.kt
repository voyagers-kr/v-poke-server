package at.voyagers.pokemon

import at.voyagers.pokemon.client.PokeApiClient
import at.voyagers.pokemon.subcommand.CallName
import at.voyagers.pokemon.subcommand.NumberKrNames
import at.voyagers.pokemon.subcommand.ReadAll
import at.voyagers.pokemon.subcommand.ReadOne
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType

class PokemonApplication

fun main(args: Array<String>) {
    println("Hello World")

    val parser = ArgParser("example")
    val output by parser.option(
        ArgType.String,
        "output",
        "o",
        "Output file"
    )

    val pokeApiClient = PokeApiClient()
    val numberKrNames = NumberKrNames()

    parser.subcommands(
        ReadAll(pokeApiClient, numberKrNames),
        ReadOne(pokeApiClient),
        CallName(numberKrNames)
    )

    parser.parse(args)

//    val parser = ArgParser("example")
//
//    val name by parser.option(
//        ArgType.String,
//        shortName = "n",
//        description = "User name"
//    )
//
//    parser.parse(args)
//
//    println("Hello, $name!")

}
