package family_tree.ui.commands.sort;

import family_tree.ui.ConsoleView;
import family_tree.ui.commands.Command;

public class SortTree extends Command {
    String description;
    ConsoleView consoleView;

    public SortTree(ConsoleView consoleView) {
        super(consoleView);
        description = "Отсортировать дерево";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void execute(String text) {
        consoleView.sortTree();
    }
}