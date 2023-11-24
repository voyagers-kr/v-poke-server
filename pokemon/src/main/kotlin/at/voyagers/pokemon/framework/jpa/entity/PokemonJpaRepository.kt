package at.voyagers.pokemon.framework.jpa.entity

import at.voyagers.pokemon.domain.Pokemon
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
class PokemonJpaRepository(
    private val pokemonEntityRepository: PokemonEntityRepository,
) {

    fun save(pokemonEntity: PokemonEntity): Pokemon {
        return pokemonEntityRepository.save(pokemonEntity)
    }

    fun findAll(): List<Pokemon> {
        return pokemonEntityRepository.findAll()
    }

    fun findByNumber(number: String): Pokemon? {
        return pokemonEntityRepository.findByNumber(number)
    }

}

interface PokemonEntityRepository : JpaRepository<PokemonEntity, Long> {
    fun findByNumber(number: String): PokemonEntity?
}