package functions.firestore


/**
 * Namespace for Cloud Firestore Functions"
 * @see <a href="https://firebase.google.com/docs/reference/functions/functions.firestore">firestore</a>
 */
external interface Firestore {
    fun document(path: String): DocumentBuilder
}