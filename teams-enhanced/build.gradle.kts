plugins{
    kotlin("jvm") apply true
    id("fr.il_totore.manadrop") apply false
}
dependencies{
    compileOnly("org.spigotmc:spigot-api:1.19.2-R0.1-SNAPSHOT")
}