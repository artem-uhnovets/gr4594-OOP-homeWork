package family_tree.ui.menus;

import family_tree.ui.ConsoleView;
import family_tree.ui.commands.Command;
import family_tree.ui.commands.change_item_parameter.*;

import java.util.ArrayList;
import java.util.List;

public class GenderMenu {
    private List<Command> commandsList;

    public GenderMenu(ConsoleView consoleView) {
        commandsList = new ArrayList<>();
        commandsList.add(new SetGenderFemale(consoleView));
        commandsList.add(new SetGenderMale(consoleView));
    }

    public void show() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.getSize(); i++) {
            sb.append(i + 1).append(". ");
            sb.append(commandsList.get(i).getDescription());
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public void execute(int option, String data) {
        Command command = commandsList.get(option - 1);
        command.execute(data);
    }

    public int getSize() {
        return commandsList.size();
    }

}
