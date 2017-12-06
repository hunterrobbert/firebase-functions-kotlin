package functions.firestore

external interface DeltaDocumentSnapshot<T> {
    val exists: Boolean
    val ref: dynamic
    val id: String
    val createdTime: String
    val updateTime: String
    val readTime: String
    val previous: Previous<T>?
    fun data(): T
    val get: (key: String) -> Any
}