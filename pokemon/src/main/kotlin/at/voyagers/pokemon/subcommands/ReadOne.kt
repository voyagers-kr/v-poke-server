package at.voyagers.pokemon.subcommands

import kotlinx.cli.ArgType
import kotlinx.cli.Subcommand

class ReadOne : Subcommand("get", "List all pokemon") {
    val number by argument(ArgType.Int, description = "Addendums")
    override fun execute() {
        println("execute get $number")
    }
}