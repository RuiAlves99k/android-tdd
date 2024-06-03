// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application.plugin) apply false
    alias(libs.plugins.android.library.plugin)  apply false
    alias(libs.plugins.kotlin.android.plugin) apply false
    alias(libs.plugins.kotlix.serialization.plugin) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.kapt) apply false
}