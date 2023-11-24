package at.voyagers.pokemon.subcommand

class CallName(
    val numberKrNames: NumberKrNames,
    val name: String,
) {

    fun execute() {
        val number = numberKrNames.findPokemon(name)
        print("$number $name")
    }
}