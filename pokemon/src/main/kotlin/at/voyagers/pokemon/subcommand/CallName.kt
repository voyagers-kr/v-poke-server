package at.voyagers.pokemon.subcommand

import kotlinx.cli.ArgType
import kotlinx.cli.Subcommand

class CallName(
    val numberKrNames: NumberKrNames
) : Subcommand("name", "ID에 따른 이름 전달") {
    val number by argument(ArgType.String, description = "포켓몬 번호")

    override fun execute() {
        val findPokemon = numberKrNames.findPokemon(number)
        print("$number-$findPokemon")
    }
}