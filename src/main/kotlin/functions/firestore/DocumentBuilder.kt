package functions.firestore

/**
 * An object allowing the creation of handlers tied to specific events
 * @see <a href="https://firebase.google.com/docs/reference/functions/functions.firestore.DocumentBuilder">DocumentBuilder</a>
 */
external interface DocumentBuilder {
    fun <T> onWrite(handler: (event: Event<DeltaDocumentSnapshot<T>>) -> dynamic) : CloudFunction<DeltaDocumentSnapshot<T>>
    fun <T> onCreate(handler: (event: Event<DeltaDocumentSnapshot<T>>) -> dynamic) : CloudFunction<DeltaDocumentSnapshot<T>>
    fun <T> onUpdate(handler: (event: Event<DeltaDocumentSnapshot<T>>) -> dynamic) : CloudFunction<DeltaDocumentSnapshot<T>>
    fun <T> onDelete(handler: (event: Event<DeltaDocumentSnapshot<T>>) -> dynamic) : CloudFunction<DeltaDocumentSnapshot<T>>
}