pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    }
    plugins {
        kotlin("jvm").version(extra["kotlin.version"] as String)
        kotlin("android").version(extra["kotlin.version"] as String)
        kotlin("multiplatform").version(extra["kotlin.version"] as String)
        id("com.android.application").version(extra["agp.version"] as String)
        id("com.android.library").version(extra["agp.version"] as String)
        id("org.jetbrains.compose").version(extra["compose.version"] as String)
        id("org.jetbrains.dokka").version(extra["kotlin.version"] as String)
    }
}
rootProject.name = "ComposeCodeEditor"

include(":demo:android")
include(":demo:desktop")
include(":demo:common")
include(":codeeditor")

