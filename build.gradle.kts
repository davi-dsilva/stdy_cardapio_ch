plugins {
    id("java")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(26)
    }
}
group = "org.dsilva.dev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}