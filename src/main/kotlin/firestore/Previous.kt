package main.kotlin.firestore

external interface Previous<T> {
    fun data(): T
}