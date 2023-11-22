package at.voyagers.pokemon.framework.jpa.entity

import at.voyagers.pokemon.domain.Pokemon
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "pokemon")
@Entity
class PokemonEntity(
    override val type: String,
    override val name: String,
    override val height: Int,
    override val weight: Int,
    override val gender: String,
    override val classification: String,
    override val specificity: String,
    override val image: String
) : Pokemon {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    override val id: Long = 0

}