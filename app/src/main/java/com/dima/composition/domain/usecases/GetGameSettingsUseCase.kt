package com.dima.composition.domain.usecases

import com.dima.composition.domain.entity.GameSettings
import com.dima.composition.domain.entity.Level
import com.dima.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}