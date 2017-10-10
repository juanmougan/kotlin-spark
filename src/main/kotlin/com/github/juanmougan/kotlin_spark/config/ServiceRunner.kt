package com.github.juanmougan.kotlin_spark.config

import com.github.juanmougan.kotlin_spark.controllers.PeopleController
import spark.Spark.*

/**
 * Main Runner of the Kotlin-Spark-Requery demo service. It makes initialization
 * of a whole service and setup of REST API.
 * Created by juanmougan@gmail.com on 2/10/17.
 */
class ServiceRunner {
    fun run() {
        initControllers()
    }

    private fun initControllers() {
        PeopleController()
    }
}