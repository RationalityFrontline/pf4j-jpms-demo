plugins {
    application
    id("org.javamodularity.moduleplugin") version "1.7.0"
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
//    val pf4jVersion = "3.6.0"
//    implementation("org.pf4j:pf4j:$pf4jVersion")
//    annotationProcessor("org.pf4j:pf4j:$pf4jVersion")
//    implementation("org.slf4j:slf4j-simple:1.7.25")
//    implementation("org.ow2.asm:asm:9.1")

    val pf4jVersion = "3.7.0-SNAPSHOT"
    implementation("org.pf4j:pf4j:$pf4jVersion")
    annotationProcessor("org.pf4j:pf4j:$pf4jVersion")
    implementation("org.slf4j:slf4j-simple:1.7.30")
}

application {
    mainClass.set("org.rationalityfrontline.demo.pf4j.App")
    mainModule.set("demo.pf4j")
}

modularity.disableEffectiveArgumentsAdjustment()