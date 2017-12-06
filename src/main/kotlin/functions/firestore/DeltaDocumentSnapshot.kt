package functions.firestore

/**
 * Interface representing a Cloud Firestore document delta snapshot.
 * @see <a href="https://firebase.google.com/docs/reference/functions/functions.firestore.DeltaDocumentSnapshot">DeltaDocumentSnapshot</a>
 */
external interface DeltaDocumentSnapshot<T> {
    val exists: Boolean
    val ref: dynamic
    val id: String
    val createdTime: String
    val updateTime: String
    val readTime: String
    val previous: DeltaDocumentSnapshot<T>?
    fun data(): T
    val get: (key: String) -> Any
}