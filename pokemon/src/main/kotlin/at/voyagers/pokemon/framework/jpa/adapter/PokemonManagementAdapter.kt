package at.voyagers.pokemon.framework.jpa.adapter

import at.voyagers.pokemon.application.output.PokemonManagementOutputPort
import at.voyagers.pokemon.domain.Pokemon
import at.voyagers.pokemon.framework.jpa.entity.PokemonJpaRepository
import org.springframework.stereotype.Component

@Component
class PokemonManagementAdapter(
    private val pokemonJpaRepository: PokemonJpaRepository,
) : PokemonManagementOutputPort {

    override fun getPokemon(number: String): Pokemon {
        return pokemonJpaRepository.findByNumber(number) ?: throw IllegalArgumentException("Pokemon with id $number not found")
    }

    override fun getAllPokemon(): List<Pokemon> {
        return pokemonJpaRepository.findAll()
    }

}