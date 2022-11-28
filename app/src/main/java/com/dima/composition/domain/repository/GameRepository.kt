package com.dima.composition.domain.repository

import com.dima.composition.domain.entity.GameSettings
import com.dima.composition.domain.entity.Level
import com.dima.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}