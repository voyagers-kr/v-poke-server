package at.voyagers.pokemon.framework.retrofit.client

import at.voyagers.pokemon.framework.retrofit.model.ApiResource
import at.voyagers.pokemon.framework.retrofit.model.ApiResourceAdapter
import at.voyagers.pokemon.framework.retrofit.model.NamedApiResource
import at.voyagers.pokemon.framework.retrofit.model.NamedApiResourceAdapter
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.util.concurrent.TimeUnit
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.OkHttpClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Configuration
class ClientConfiguration {

    @Bean
    fun pokemonApiClient(): PokemonApiClient {
        val okHttpConfig: OkHttpClient.Builder.() -> OkHttpClient.Builder = {
            retryOnConnectionFailure(false)
            connectTimeout(30, TimeUnit.SECONDS)
            readTimeout(30, TimeUnit.SECONDS)
            writeTimeout(30, TimeUnit.SECONDS)
        }

        return Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/".toHttpUrlOrNull()!!)
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder().apply {
                        setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                        registerTypeAdapter(
                            TypeToken.get(ApiResource::class.java).type,
                            ApiResourceAdapter()
                        )
                        registerTypeAdapter(
                            TypeToken.get(NamedApiResource::class.java).type,
                            NamedApiResourceAdapter()
                        )
                    }.create()
                )
            )
            .client(OkHttpClient.Builder().(okHttpConfig)().build())
            .build()
            .create(PokemonApiClient::class.java)
    }
}
