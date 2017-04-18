package main;

import lombok.Getter;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.hooks.AnnotatedEventManager;

public class DebateBot {
    @Getter private static JDA jda;

    public static void main(String[] args) {
        jda = new JDABuilder(AccountType.BOT)
                .setEventManager(new AnnotatedEventManager())
                .setToken(token)
                .setAutoReconnect(true)
                .setAudioEnabled(false)
                .setGame(Game.of("Debate bot v0.0.1", "https://twitch.tv/monstercat"))
                .setStatus(OnlineStatus.ONLINE)
                .setBulkDeleteSplittingEnabled(true)
                .setEnableShutdownHook(true)
                .buildBlocking();
    }
}
