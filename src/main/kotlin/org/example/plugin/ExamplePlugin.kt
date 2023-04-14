package org.example.plugin

import net.axay.kspigot.event.listen
import net.axay.kspigot.main.KSpigot
import net.kyori.adventure.text.Component
import org.bukkit.event.player.PlayerJoinEvent

class ExamplePlugin : KSpigot() {

    override fun startup() {
        listen<PlayerJoinEvent> { playerJoin ->
            playerJoin.player.sendMessage(Component.text("Hello, " + playerJoin.player.name + "!"))
        }
    }

}