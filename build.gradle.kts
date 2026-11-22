// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        // Google Maven is inaccessible from this build environment; this is its read-only mirror.
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:9.0.0")
    }
}

allprojects {
    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
