plugins {
    id 'java'
}

group 'ru.netology'
version '1.0-SNAPSHOT'

sourceCompatibility = 11

// кодировка файлов (если используете русский язык в файлах)
compileJava.options.encoding = "UTF-8"
compileTestJava.options.encoding = "UTF-8"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.9.2'
    testImplementation 'com.codeborne:selenide:6.13.1'
}

test {
    useJUnitPlatform()
    // в тестах, вызывая `gradlew test -Dselenide.headless=true` будем передавать этот параметр в JVM (где его подтянет Selenide)
    systemProperty 'selenide.headless', System.getProperty('selenide.headless')
}