package at.voyagers.pokemon.subcommand

import at.voyagers.pokemon.client.PokeApiClient

class ReadAll(
    val numberKrNames: NumberKrNames,
) {

    fun execute() {

        numberKrNames.map.forEach { number, krName ->
            println("${number}. ${krName}")
        }
    }
}

