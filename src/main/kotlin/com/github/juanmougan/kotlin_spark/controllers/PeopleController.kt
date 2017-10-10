package com.github.juanmougan.kotlin_spark.controllers

import spark.Spark.*

/**
 * Created by juanma on 2/10/17.
 */
class PeopleController {
    init {
        get("/people", { req, res -> arrayOf("Lionel Messi", "Cristiano Ronaldo", "Neymar Jr.") })
    }
}