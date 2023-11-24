package at.voyagers.pokemon.subcommands

import kotlinx.cli.Subcommand

class ReadAll : Subcommand("ls", "List all pokemon") {

    override fun execute() {
        print("execute ls")
    }
}