package at.voyagers.pokemon.framework.retrofit.client

import at.voyagers.pokemon.framework.retrofit.model.NamedApiResourceList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApiClient {

    @GET("pokemon/")
    fun getPokemonList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Call<NamedApiResourceList>

    @GET("pokemon-species/")
    fun getPokemonSpeciesList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Call<NamedApiResourceList>

}
