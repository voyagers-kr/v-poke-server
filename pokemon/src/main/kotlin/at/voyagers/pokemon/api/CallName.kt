package at.voyagers.pokemon.api

class CallName(
    val numberKrNames: NumberKrNames,
    val name: String,
) {

    fun execute() {
        val number = numberKrNames.findPokemon(name)
        print("$number $name")
    }
}