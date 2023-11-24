package at.voyagers.pokemon.framework.retrofit.model

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.reflect.TypeToken
import at.voyagers.pokemon.framework.retrofit.model.Name
import java.lang.reflect.Type

internal class ApiResourceAdapter : JsonDeserializer<ApiResource> {

    data class Json(val url: String)

    override fun deserialize(
        element: JsonElement,
        type: Type,
        context: JsonDeserializationContext
    ): ApiResource {
        val temp = context.deserialize<Json>(element, TypeToken.get(Json::class.java).type)
        return ApiResource(temp.url)
    }
}

internal class NamedApiResourceAdapter : JsonDeserializer<NamedApiResource> {

    data class Json(val name: String, val url: String, val names: List<Name>)

    override fun deserialize(
        element: JsonElement,
        type: Type,
        context: JsonDeserializationContext
    ): NamedApiResource {
        val temp = context.deserialize<Json>(element, TypeToken.get(Json::class.java).type)
        return NamedApiResource(temp.name, temp.url, temp.names)
    }
}
