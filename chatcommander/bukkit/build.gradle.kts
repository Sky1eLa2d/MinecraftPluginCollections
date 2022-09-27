plugins{
    kotlin("jvm") apply true
}

repositories{
    maven("https://jitpack.io")
}

dependencies{
    compileOnly("org.spigotmc:spigot-api:1.19.2-R0.1-SNAPSHOT")
    compileOnly("com.github.MilkBowl:VaultAPI:1.7")
}