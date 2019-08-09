/**
 * Created by @ilhamsuaib on 2019-08-03.
 * github.com/ilhamsuaib
 */

object Versions {
    const val GRADLE_BUILD = "3.4.2"
    const val KOTLIN = "1.3.41"
    const val ANDROIDX = "1.0.2"
}

object Config {
    const val APPLICATION_ID = "dev.ilhamsuaib.kotlindsl"
    const val SDK_VERSION = 29
    const val MIN_SDK_VERSION = 19
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
}

object BuildPlugins {
    const val GRADLE_PLUGIN = "com.android.tools.build:gradle:${Versions.GRADLE_BUILD}"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
}

object Library {
    const val KOTLIN_SDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"

    fun getAndroidXLibs() = arrayOf(
        "androidx.appcompat:appcompat:${Versions.ANDROIDX}",
        "androidx.core:core-ktx:${Versions.ANDROIDX}",
        "androidx.constraintlayout:constraintlayout:1.1.3"
    )
}
