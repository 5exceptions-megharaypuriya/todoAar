package com.example.aarsample

import org.koin.dsl.module

val myLibraryModule = module {
    // Define library-specific dependencies
    single { LibraryRepository() }
    factory { LibraryService(get()) }
}

class LibraryRepository {
    fun getData(): String = "Hello from koin LibraryRepository"
}

class LibraryService(private val repository: LibraryRepository) {
    fun fetchData(): String = repository.getData()
}