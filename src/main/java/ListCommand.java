public class ListCommand extends Command{
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DookException{
        ui.separate();
        if (taskList.numOfTasks() == 0) {
            throw new DookException("No tasks");
        } else {
            for (int i = 0; i < taskList.numOfTasks(); i++) {
                ui.showMessage((i + 1) + ". " + taskList.getTask(i));
            }
        }
        ui.separate();
    }
}
