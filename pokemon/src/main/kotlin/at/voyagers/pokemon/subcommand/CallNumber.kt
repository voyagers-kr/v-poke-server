package at.voyagers.pokemon.subcommand

class CallNumber(
    val numberKrNames: NumberKrNames,
    val number: String,
) {

    fun execute() {
        val name = numberKrNames.findPokemon(number)
        print("$number $name")
    }

}