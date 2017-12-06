package main.kotlin.firestore

external interface DocumentBuilder {
    fun <T> onWrite(handler: (event: Event<DeltaDocumentSnapshot<T>>) -> dynamic) : CloudFunction<DeltaDocumentSnapshot<T>>
    fun <T> onCreate(handler: (event: Event<DeltaDocumentSnapshot<T>>) -> dynamic) : CloudFunction<DeltaDocumentSnapshot<T>>
    fun <T> onUpdate(handler: (event: Event<DeltaDocumentSnapshot<T>>) -> dynamic) : CloudFunction<DeltaDocumentSnapshot<T>>
    fun <T> onDelete(handler: (event: Event<DeltaDocumentSnapshot<T>>) -> dynamic) : CloudFunction<DeltaDocumentSnapshot<T>>
}