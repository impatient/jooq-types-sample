plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    id("org.flywaydb.flyway").version("6.1.0")
    // Apply the application plugin to add support for building a CLI application.
    application
}

flyway {
    url = "jdbc:postgresql://localhost:5432/jooq_sample"
    user= "jooq_sample"
    password = "jooq_sample"
    schemas = arrayOf("jooq_sample")
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}
tasks {
    register<org.gradle.api.tasks.JavaExec>("jooqerate") {
        main = "org.jooq.codegen.GenerationTool"
        args = listOf("jooq.xml")
        // use compileClasspath so jooq won't fail on invalid kt file
        classpath = sourceSets.main.get().compileClasspath
    }
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation("org.jooq:jooq:3.12.3")
    // ideally don't bundle these
    implementation("org.jooq:jooq-meta:3.12.3")
    implementation("org.jooq:jooq-codegen:3.12.3")

    implementation("org.postgresql:postgresql:42.2.8.jre7")

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    // Define the main class for the application
    mainClassName = "types.sample.AppKt"
}
