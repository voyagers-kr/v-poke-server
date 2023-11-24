package at.voyagers.pokemon.api

interface InputMappingHandler {
    fun support(input: String): Boolean
    fun execute(vararg args: String)
}