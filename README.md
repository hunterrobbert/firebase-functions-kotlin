# Firebase Functions - Kotlin

An experimental, bare-bones and in-progress set of type definitions for firebase-functions with current, limited support for the modules:

* Firestore

If also in need of similarly experimental firebase-admin type definitions, see <a href="https://github.com/hunterrobbert/firebase-admin-kotlin/blob/master/README.md">firebase-admin-kotlin</a>

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
	...
  compile 'com.github.hunterrobbert:firebase-functions-kotlin:master-SNAPSHOT'
}
```
For information on including github repos as gradle dependencies, see the <a href="https://jitpack.io/docs/">JitPack docs</a>.
