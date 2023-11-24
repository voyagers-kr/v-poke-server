package at.voyagers.pokemon.api

class CallNumber(
    val numberKrNames: NumberKrNames,
    val number: Int,
) {
    fun execute() {
        val name = numberKrNames.findPokemon(number)
        print("$number $name")
    }

}