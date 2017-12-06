package functions.firestore


external interface Firestore {
    fun document(path: String): DocumentBuilder
}