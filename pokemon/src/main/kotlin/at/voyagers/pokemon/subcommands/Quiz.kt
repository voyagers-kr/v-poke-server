package at.voyagers.pokemon.subcommands

import kotlinx.cli.Subcommand

class Quiz : Subcommand("quiz", "Quiz") {
    override fun execute() {
        print("execute quiz")
    }
}