plugins {
    id("java")
    id("xyz.jpenilla.run-velocity") version "2.2.0"
}

group = "com.kyubumq"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("com.velocitypowered:velocity-api:3.2.0-SNAPSHOT")
    annotationProcessor("com.velocitypowered:velocity-api:3.2.0-SNAPSHOT")
}

tasks.runVelocity {
    velocityVersion("3.2.0-SNAPSHOT")
}