plugins {
    `java-platform`
    `maven-publish`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform(libs.assertj.bom))
    api(platform(libs.junit.bom))
    api(platform(libs.testcontainers.bom))
}