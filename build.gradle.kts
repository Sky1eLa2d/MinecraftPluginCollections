plugins{
    kotlin("jvm") apply false
}

allprojects{
    group = "io.github.zxcvbnmasdfghjk7"
    version = "dev-SNAPSHOT"

}

subprojects{
    repositories{
        mavenCentral()
        maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        maven("https://repo.papermc.io/repository/maven-public/")
    }

    apply(plugin="java")
    apply(plugin="idea")
}