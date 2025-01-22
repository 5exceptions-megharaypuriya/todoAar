package com.example.aarsample

import org.koin.core.context.loadKoinModules

object LibraryInitializer {
    fun init() {
        // Load the library's Koin module into the global Koin context
        loadKoinModules(myLibraryModule)
    }
}