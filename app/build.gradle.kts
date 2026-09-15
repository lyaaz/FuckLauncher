plugins {
    id("fuck.android.application")
    id("fuck.compose")
    id("fuck.xposed.legacy")
}

android {
    namespace = "org.lyaaz.fucklauncher"
}

dependencies {
    implementation(project(":ui"))
    implementation(libs.material)
    implementation(libs.libsu.core)
}
