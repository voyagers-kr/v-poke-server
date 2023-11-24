package at.voyagers.pokemon.framework.retrofit.adapter

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PokemonApiAdapterTest {

    @Autowired
    lateinit var pokemonApiAdapter: PokemonApiAdapter

    @Test
    fun name() {
        val pokemonSpecies = pokemonApiAdapter.getPokemonSpecies()
        println("test")
    }
}