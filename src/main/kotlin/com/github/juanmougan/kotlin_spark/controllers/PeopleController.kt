package com.github.juanmougan.kotlin_spark.controllers

import com.google.gson.Gson
import spark.Spark.*

/**
 * Created by juanma on 2/10/17.
 */
class PeopleController {

    var gson: Gson = Gson()

    init {
        get("/people", { req, res -> arrayOf("Lionel Messi", "Cristiano Ronaldo", "Neymar Jr.") }, gson::toJson)
    }
}