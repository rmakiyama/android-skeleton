package dependencies

object Dep {

    object Kotlin {
        val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3"
        val androidCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.3"
    }

    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:1.2.0-alpha03"
        val recyclerView = "androidx.recyclerview:recyclerview:1.2.0-alpha01"
        val constraint = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
        val coreKtx = "androidx.core:core-ktx:1.3.0-alpha02"
        val activityKtx = "androidx.activity:activity-ktx:1.2.0-alpha02"
        val fragmentKtx = "androidx.fragment:fragment-ktx:1.3.0-alpha02"

        val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:2.3.0-alpha01"
        val liveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:2.3.0-alpha01"
        val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.0-alpha01"
        val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.0-alpha01"

        object Navigation {
            val runtimeKtx = "androidx.navigation:navigation-runtime-ktx:2.3.0-alpha04"
            val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:2.3.0-alpha04"
            val uiKtx = "androidx.navigation:navigation-ui-ktx:2.3.0-alpha04"
        }
    }

    object Dagger {
        val core = "com.google.dagger:dagger:2.27"
        val compiler = "com.google.dagger:dagger-compiler:2.27"
        val androidSupport = "com.google.dagger:dagger-android-support:2.27"
        val android = "com.google.dagger:dagger-android:2.27"
        val androidProcessor = "com.google.dagger:dagger-android-processor:2.27"
        val assistedInjectAnnotations =
            "com.squareup.inject:assisted-inject-annotations-dagger2:0.5.2"
        val assistedInjectProcessor = "com.squareup.inject:assisted-inject-processor-dagger2:0.5.2"
    }

    object Ui {
        val material = "com.google.android.material:material:1.2.0-alpha05"
        val groupie = "com.xwray:groupie:2.7.2"
        val databinding = "com.xwray:groupie-databinding:2.7.2"
        val coil = "io.coil-kt:coil:0.9.5"
        val insetter = "dev.chrisbanes:insetter-ktx:0.2.0"
    }

    object Timber {
        val timber = "com.jakewharton.timber:timber:4.7.1"
    }
}
