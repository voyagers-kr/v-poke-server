package at.voyagers.pokemon.application.output

interface PokemonImageOutputPort {
    fun getPokemonImage(number: String): String
}