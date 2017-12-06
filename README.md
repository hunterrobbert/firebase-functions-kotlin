# Firebase Functions - Kotlin

A very bare-bones, in-progress set of type definitions for firebase-functions with current, limited support for the modules:

* Firestore

## Usage
```gradle
allprojects {
  repositories {
	  ...
	  maven { url 'https://jitpack.io' }
	}
}
```
```gradle
dependencies {
  compile 'com.github.hunterrobbert:firebase-functions-kotlin:master-SNAPSHOT'
  compile 'com.github.hunterrobbert:firebase-admin-kotlin:master-SNAPSHOT'
}
```
For information on including github repos as gradle dependencies, see the <a href="https://jitpack.io/docs/">JitPack docs</a>.
