package at.voyagers.pokemon.framework.retrofit.adapter

import at.voyagers.pokemon.application.output.PokemonApiOutputPort
import at.voyagers.pokemon.domain.Pokemon
import at.voyagers.pokemon.framework.retrofit.client.ErrorResponse
import at.voyagers.pokemon.framework.retrofit.client.PokemonApiClient
import at.voyagers.pokemon.framework.retrofit.model.NamedApiResourceList
import org.springframework.stereotype.Component

@Component
class PokemonApiAdapter(
    private val pokemonApiClient: PokemonApiClient,
) : PokemonApiOutputPort {

    override fun getPokemonSpecies(): List<Pokemon> {
        val let = pokemonApiClient.getPokemonSpeciesList(0, 10).execute().let {
            if (it.isSuccessful) it.body()!! else throw ErrorResponse(it.code(), it.message())
        }
        return emptyList()
    }

}