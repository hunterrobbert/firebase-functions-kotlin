package main.kotlin.firestore

external interface Event<T> {
    val eventId: String?
    val timestamp: String?
    val eventType: String?
    val resource: String?
    val params: dynamic
    val data: T
}