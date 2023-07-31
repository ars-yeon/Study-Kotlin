package com.example.kiosk

open class Menu(name: String, description: String) {
    var id: Int
    var name: String
    var description: String

    init {
        id = idSeq++
        this.name = name
        this.description = description
    }

    companion object {
        var idSeq = 1
    }
}