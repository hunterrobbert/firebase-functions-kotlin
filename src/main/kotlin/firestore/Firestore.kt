package main.kotlin.firestore

external interface Firestore {
    fun document(path: String): DocumentBuilder
}