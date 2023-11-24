package at.voyagers.pokemon.api

interface RequestMappingHandler {
    fun support(input: String): Boolean
}