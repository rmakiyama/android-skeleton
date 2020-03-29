import dependencies.Dep
import dependencies.Versions

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(Versions.androidCompileSdkVersion)

    defaultConfig {
        applicationId = "com.rmakiyama.skeleton"
        minSdkVersion(Versions.androidMinSdkVersion)
        targetSdkVersion(Versions.androidTargetSdkVersion)
        versionCode = Versions.androidVersionCode
        versionName = Versions.androidVersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures.viewBinding = true
}

val kotlinVersion: String by rootProject.extra
dependencies {
    // kotlin
    implementation(Dep.Kotlin.stdlibJvm)
    implementation(Dep.Kotlin.coroutines)
    implementation(Dep.Kotlin.androidCoroutines)

    // androidX
    implementation(Dep.AndroidX.appCompat)
    implementation(Dep.AndroidX.coreKtx)
    implementation(Dep.AndroidX.constraint)
    implementation(Dep.AndroidX.recyclerView)
    implementation(Dep.AndroidX.activityKtx)
    implementation(Dep.AndroidX.fragmentKtx)
    implementation(Dep.AndroidX.lifecycleLiveData)
    implementation(Dep.AndroidX.liveDataCoreKtx)
    implementation(Dep.AndroidX.liveDataKtx)
    implementation(Dep.AndroidX.viewModelKtx)
    implementation(Dep.AndroidX.Navigation.runtimeKtx)
    implementation(Dep.AndroidX.Navigation.fragmentKtx)
    implementation(Dep.AndroidX.Navigation.uiKtx)

    // dagger
    implementation(Dep.Dagger.core)
    implementation(Dep.Dagger.androidSupport)
    kapt(Dep.Dagger.compiler)
    kapt(Dep.Dagger.androidProcessor)
    compileOnly(Dep.Dagger.assistedInjectAnnotations)
    kapt(Dep.Dagger.assistedInjectProcessor)

    // ui
    implementation(Dep.Ui.material)
    implementation(Dep.Ui.groupie)
    implementation(Dep.Ui.coil)
    implementation(Dep.Ui.insetter)

    // util
    implementation(Dep.Timber.timber)

    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
