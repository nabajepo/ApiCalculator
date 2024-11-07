package com.example.calculator

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestController
@RequestMapping
@RestControllerAdvice
class ApiContoller {
    @GetMapping("calculator/add/{nombre1}/{nombre2}")
    fun add(@PathVariable nombre1: Double,@PathVariable nombre2: Double):String{
        val result=nombre1+nombre2
        return " $nombre1 + $nombre2 = $result";
    }
    @GetMapping("calculator/subtract/{nombre1}/{nombre2}")
    fun subtract(@PathVariable nombre1:Double,@PathVariable nombre2:Double):String{
        val result=nombre1-nombre2
        return "$nombre1 - $nombre2 = $result";
    }
    @GetMapping("calculator/multiply/{nombre1}/{nombre2}")
    fun multiply(@PathVariable nombre1:Double,@PathVariable nombre2:Double):String{
        val result=nombre1*nombre2
        return "$nombre1 X $nombre2 = $result";
    }
    @GetMapping("calculator/divide/{nombre1}/{nombre2}")
    fun divide(@PathVariable nombre1:Double,@PathVariable nombre2:Double):String{
        val result=nombre1/nombre2
        return "$nombre1 / $nombre2 = $result";
    }
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleException(ex: Exception): ResponseEntity<String> {
        return ResponseEntity.badRequest().body("Unable to process request")
    }

}