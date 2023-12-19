package ru.cmtt.sdk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform