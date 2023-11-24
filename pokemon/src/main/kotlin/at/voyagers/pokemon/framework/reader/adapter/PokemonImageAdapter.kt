package at.voyagers.pokemon.framework.reader.adapter

import at.voyagers.pokemon.application.output.PokemonImageOutputPort
import at.voyagers.pokemon.framework.reader.util.TextReader
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PokemonImageAdapter(
    private val textReader: TextReader,
) : PokemonImageOutputPort {
    override fun getPokemonImage(number: String): String {
        return textReader.readTextFile("$number.txt")
    }
}
