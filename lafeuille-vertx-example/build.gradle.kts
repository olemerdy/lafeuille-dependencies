plugins {
    java
}

dependencies {
    implementation(platform(project(":lafeuille-vertx-bom")))

    implementation("io.vertx:vertx-core")
}