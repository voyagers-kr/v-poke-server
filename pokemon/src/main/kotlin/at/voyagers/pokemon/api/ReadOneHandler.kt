package at.voyagers.pokemon.api

import at.voyagers.pokemon.client.PokeApiClient
import at.voyagers.pokemon.client.dto.Pokemon
import at.voyagers.pokemon.client.dto.PokemonSpecies
import at.voyagers.pokemon.api.dto.ReadOneResponse
import com.github.ajalt.mordant.rendering.BorderType.Companion.SQUARE_DOUBLE_SECTION_SEPARATOR
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors
import com.github.ajalt.mordant.rendering.TextColors.Companion.rgb
import com.github.ajalt.mordant.rendering.TextStyle
import com.github.ajalt.mordant.rendering.TextStyles
import com.github.ajalt.mordant.table.Borders
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

class ReadOneHandler(
    val pokeApiClient: PokeApiClient,
) : InputMappingHandler {
    override fun support(input: String): Boolean {
        return input.startsWith("name")
    }

    override fun execute(vararg args: String) {
        val arg = args[0]
        if (arg.isBlank()) {
            println("please input pokemon name or number")
        }
        var pokemon = requestPokemon(arg)
        var pokemonSpecies = requestPokemonSpecies(arg)
        val pokemonViewModel = ReadOneResponse.of(pokemon, pokemonSpecies)

        val t = Terminal()
        val table = table {
            borderType = SQUARE_DOUBLE_SECTION_SEPARATOR
            borderStyle = rgb("#4b25b9")
            align = TextAlign.RIGHT
            tableBorders = Borders.NONE
            header {
                style = TextColors.brightRed + TextStyles.bold
                row {
                    cellBorders = Borders.NONE
                    cell("포켓몬 상세 정보") {
                        columnSpan = 2
                        align = TextAlign.CENTER
                    }
                }
            }
            body {
                style = TextColors.green
                column(0) {
                    align = TextAlign.LEFT
                    cellBorders = Borders.ALL
                    style = TextColors.brightBlue
                }
                column(1) {
                    align = TextAlign.CENTER
                    cellBorders = Borders.ALL
                    style = TextColors.green
                }
                rowStyles(TextStyle(), TextStyles.dim.style)
                cellBorders = Borders.TOP_BOTTOM
                row("number", pokemonViewModel.number)
                row("name", pokemonViewModel.name)
                row("description", pokemonViewModel.description)
                row("moves", pokemonViewModel.moves)
                row("attributes", pokemonViewModel.attributes)
                row("happinessPoint", "${pokemonViewModel.happinessPoint}%")
                row("tier", pokemonViewModel.tier.krDisplayName)
            }
            footer {
                style(italic = true)
                row {}
            }
        }

        t.println(table)
    }

    private fun requestPokemon(arg: String): Pokemon {
        try {
            return pokeApiClient.getPokemon(arg.toInt())
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return pokeApiClient.getPokemon(arg)
    }

    private fun requestPokemonSpecies(arg: String): PokemonSpecies {
        try {
            return pokeApiClient.getPokemonSpecies(arg.toInt())
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return pokeApiClient.getPokemonSpecies(arg)
    }
}