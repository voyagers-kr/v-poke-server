package at.voyagers.pokemon.framework.reader.util

import org.springframework.core.io.Resource
import org.springframework.core.io.ResourceLoader
import org.springframework.stereotype.Component
import java.io.IOException

@Component
class TextReader(private val resourceLoader: ResourceLoader) {

    @Throws(IOException::class)
    fun readTextFile(fileName: String): String {
        val resource: Resource = resourceLoader.getResource("classpath:image/$fileName")

        resource.inputStream.bufferedReader().use { reader ->
            val stringBuilder = StringBuilder()
            var line: String?

            while (reader.readLine().also { line = it } != null) {
                stringBuilder.append(line).append("\n")
            }

            return stringBuilder.toString()
        }
    }

}