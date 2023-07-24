package family_tree.ui.commands.change_item_parameter;

import family_tree.ui.ConsoleView;
import family_tree.ui.commands.Command;

public class SetItemGender extends Command {
    String description;
    ConsoleView consoleView;

    public SetItemGender(ConsoleView consoleView) {
        super(consoleView);
        description = "Пол";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void execute(String itemIndex) {
        consoleView.setGender(itemIndex);
    }
}
