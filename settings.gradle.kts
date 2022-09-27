rootProject.name = "MinecraftPluginCollections"
include(":economyplus",":advancedpunishment",":teams-enhanced",
    ":chatcommander","chatcommander:bungee","chatcommander:bukkit")

pluginManagement{
    val kotlinVersion: String by settings
    repositories{
        mavenCentral()
        gradlePluginPortal()
    }

    plugins{
        id("fr.il_totore.manadrop") version "0.4.2"
        kotlin("jvm") version kotlinVersion
    }
}