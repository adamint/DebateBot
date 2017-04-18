package execution;

import lombok.Getter;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.User;

public abstract class Command {
    @Getter private String[] aliases;

    public Command(String... aliases) {
        this.aliases = aliases;
    }

    abstract void onUsage(Guild guild, Message message, User user, String[] args);
}
