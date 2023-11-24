package at.voyagers.pokemon.api.web

import at.voyagers.pokemon.application.usecase.PokemonRetrieveUseCase
import at.voyagers.pokemon.domain.Pokemon
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PokemonRestController(
    private val pokemonRetrieveUseCase: PokemonRetrieveUseCase
) {
    @GetMapping("/pokemon/{number}")
    fun getPokemon(@PathVariable number: String): PokemonModel =
        pokemonRetrieveUseCase.retrievePokemon(number).toModel()

    @GetMapping("/pokemon")
    fun getPokemon(): List<PokemonModel> = pokemonRetrieveUseCase.retrieveAllPokemon().map { it.toModel() }
}

data class PokemonModel(val pokemon: Pokemon)

fun Pokemon.toModel() = PokemonModel(this)