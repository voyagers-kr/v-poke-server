package at.voyagers.pokemon.subcommand

import at.voyagers.pokemon.client.PokeApiClient
import at.voyagers.pokemon.client.dto.NamedApiResourceList
import kotlinx.cli.Subcommand

class ReadAll(
    val pokemonApiClient: PokeApiClient,
    val numberKrNames: NumberKrNames,
) : Subcommand("ls", "포케몬 목록") {

    override fun execute() {

        numberKrNames.map.forEach { number, krName ->
            println("${number}. ${krName}")
        }
    }
}

