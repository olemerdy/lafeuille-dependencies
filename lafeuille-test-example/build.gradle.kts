plugins {
    java
}

dependencies {
    implementation(platform(project(":lafeuille-test-bom")))

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.withType<Test> {
    useJUnitPlatform()
}