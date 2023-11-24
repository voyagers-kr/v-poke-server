package at.voyagers.pokemon.application.input

import at.voyagers.pokemon.application.output.PokemonManagementOutputPort
import at.voyagers.pokemon.application.output.PokemonApiOutputPort
import at.voyagers.pokemon.application.usecase.PokemonSettingUseCase
import org.springframework.stereotype.Service

@Service
class PokemonSettingInputPort(
    private val pokemonApiOutputPort: PokemonApiOutputPort,
    private val pokemonManagementOutputPort: PokemonManagementOutputPort,
) : PokemonSettingUseCase {

    override fun settingPokemon() {
        TODO("Not yet implemented")
    }

}