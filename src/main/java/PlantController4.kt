/*package com.codecademy.plants.controllers

import com.codecademy.plants.entities.Plant
import com.codecademy.plants.repositories.PlantRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class PlantController(plantRepository: PlantRepository) {
    private val plantRepository: PlantRepository

    init {
        this.plantRepository = plantRepository
    }

    @get:GetMapping("/plants")
    val allPlants: Iterable<Any>
        get() = plantRepository.findAll()

    @GetMapping("/plants/{id}")
    fun getPlantById(@PathVariable("id") id: Int?): Optional<Plant> {
        return plantRepository.findById(id)
    }

    @PostMapping("/plants")
    fun createNewPlant(@RequestBody plant: Plant?): Plant {
        return plantRepository.save(plant)
    }
}
*/