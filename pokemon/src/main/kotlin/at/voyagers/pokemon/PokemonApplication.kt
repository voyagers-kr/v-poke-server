package at.voyagers.pokemon

import at.voyagers.pokemon.subcommands.Quiz
import at.voyagers.pokemon.subcommands.ReadAll
import at.voyagers.pokemon.subcommands.ReadOne
import kotlinx.cli.*

class PokemonApplication

fun main(args: Array<String>) {
    println("Hello World")

    val parser = ArgParser("example")
    val output by parser.option(ArgType.String, "output", "o", "Output file")
//    class Summary: Subcommand("summary", "Calculate summary") {
//        val invert by option(ArgType.Boolean, "invert", "i", "Invert results").default(false)
//        val addendums by argument(ArgType.Int, "addendums", description = "Addendums").vararg()
//        var result: Int = 0
//        override fun execute() {
//            result = addendums.sum()
//            result = if (invert!!) -1 * result else result
//        }
//    }
//    class Multiply: Subcommand("mul", "Multiply") {
//        val numbers by argument(ArgType.Int, description = "Addendums").vararg()
//        var result: Int = 0
//        override fun execute() {
//            result = numbers.reduce{ acc, it -> acc * it }
//        }
//    }

    parser.subcommands(
        ReadAll(),
        ReadOne(),
        Quiz()
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
