package at.voyagers.pokemon.api

class ReadAll(
    val numberKrNames: NumberKrNames,
) {

    fun execute() {
        numberKrNames.map.forEach { (number, krName) ->
            println("${number}. ${krName}")
        }
    }
}

