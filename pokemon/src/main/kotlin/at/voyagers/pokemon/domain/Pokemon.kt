package at.voyagers.pokemon.domain

interface Pokemon {
    val id: Long
    val type: String
    val name: String
    val height: Int
    val weight: Int
    val gender: String
    val classification: String
    val specificity: String
    val image: String
}
