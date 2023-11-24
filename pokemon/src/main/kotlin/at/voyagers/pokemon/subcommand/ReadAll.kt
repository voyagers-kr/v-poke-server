package at.voyagers.pokemon.subcommand

class ReadAll(
    val numberKrNames: NumberKrNames,
) {

    fun execute() {
        numberKrNames.map.forEach { (number, krName) ->
            println("${number}. ${krName}")
        }
    }
}

