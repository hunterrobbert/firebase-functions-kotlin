package functions.firestore

/**
 * The Functions event interface.
 * @see <a href="https://firebase.google.com/docs/reference/functions/functions.Event">Event</a>
 */
external interface Event<T> {
    val eventId: String?
    val timestamp: String?
    val eventType: String?
    val resource: String?
    val params: dynamic
    val data: T
}