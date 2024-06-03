plugins {
    alias(libs.plugins.android.application.plugin)
    alias(libs.plugins.kotlin.android.plugin)
    alias(libs.plugins.kotlix.serialization.plugin)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kapt)
}

android {
    namespace = "com.appsrui.forecaster"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.appsrui.forecaster"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_7
        targetCompatibility = JavaVersion.VERSION_1_7
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies {

    implementation(platform(libs.compose.bom))

    implementation(libs.bundles.androidx)
    implementation(libs.bundles.compose)
    implementation(libs.bundles.networking)
    implementation(libs.hilt.android)

    debugImplementation(libs.bundles.compose.debug)

    kapt(libs.hilt.kapt)

    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.bundles.ui.testing)

    testImplementation(libs.bundles.testing)
    testRuntimeOnly(libs.test.jupiter.engine)
}