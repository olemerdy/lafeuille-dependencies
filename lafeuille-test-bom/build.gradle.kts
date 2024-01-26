plugins {
    `java-platform`
}

dependencies {
    platform(libs.assertj.bom)
    platform(libs.junit.bom)
    platform(libs.testcontainers.bom)
}