import Deps.coroutinesCore
import Deps.coroutinesReactive
import Deps.coroutinesReactor
import Deps.jackStompClient
import Deps.jackson
import Deps.kotlinReflect
import Deps.kotlinStdlib
import Deps.reactiveSpring
import Deps.reactorKotlin
import Deps.reactorTest
import Deps.springDevTools
import Deps.springStarterTest
import Deps.stompWebsocket
import Deps.validations
import Deps.webJarsLocator
import Deps.websocketStarter
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.4.5"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.4.32"
    kotlin("plugin.spring") version "1.4.32"
}

group = "com.thelumiereguy.notesapp"
version = "1.0"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation(reactiveSpring)
    //    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    implementation(validations)
    implementation(jackson)
    implementation(reactorKotlin)
    implementation(kotlinReflect)
    implementation(kotlinStdlib)
    implementation(coroutinesCore)
    implementation(coroutinesReactive)
    implementation(coroutinesReactor)
    developmentOnly(springDevTools)
//    runtimeOnly("io.r2dbc:r2dbc-postgresql")
//    runtimeOnly("org.postgresql:postgresql")
    testImplementation(springStarterTest)
    testImplementation(reactorTest)


    //Websocket
    implementation(websocketStarter)
    implementation(webJarsLocator)
    implementation(stompWebsocket)
    testImplementation(jackStompClient)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
