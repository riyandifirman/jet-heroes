package com.riyandifirman.jetheroes.data

import com.riyandifirman.jetheroes.model.Hero
import com.riyandifirman.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}