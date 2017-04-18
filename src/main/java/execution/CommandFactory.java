package execution;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.User;

import java.util.ArrayList;

public class CommandFactory {
    private static final ArrayList<Command> commands = new ArrayList<>();

    public CommandFactory() {
    }
    public void with(Command command) {
        commands.add(command);
    }

    public void check(Guild guild, Message message, User user, String[] args) {

    }
}
