package at.voyagers.pokemon.subcommand

class CallName(
    val numberKrNames: NumberKrNames,
    val number: Int,
) {

    fun execute() {
        val findPokemon = numberKrNames.findPokemon(number)
        print("$number-$findPokemon")
    }
}