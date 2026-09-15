plugins {
    id("java")
    application
    id("com.diffplug.spotless") version "6.25.0"
}

spotless {
    java {
        // Сортировка импортов
        importOrder()
        // Удаление неиспользуемых импортов
        removeUnusedImports()
        // Форматирование по стандарту Google (AOSP variant - Android Open Source Project, часто используется как более строгий вариант)
        googleJavaFormat().aosp()
        // Исправление аннотаций
        formatAnnotations()
        // Замена табуляции на 4 пробела (на всякий случай, хотя google-java-format обычно сам справляется)
    }
}

application {
    mainClass.set("hexlet.code.Main")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}