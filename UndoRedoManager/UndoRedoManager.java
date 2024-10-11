import java.util.Stack;

public class UndoRedoManager {
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // a new action and clear the redo stack
    public void performAction(Action action) {
        undoStack.push(action);
        redoStack.clear(); 
        action.execute();  
        System.out.println("Performed: " + action.getName());
    }

    // Undo the last performed action
    public void undo() {
        if (!undoStack.isEmpty()) {
            Action action = undoStack.pop();
            redoStack.push(action);   
            action.undo();            
            System.out.println("Undone: " + action.getName());
        } else {
            System.out.println("No action to undo.");
        }
    }

    // Redo the last undone action
    public void redo() {
        if (!redoStack.isEmpty()) {
            Action action = redoStack.pop();
            undoStack.push(action);   
            action.execute();         
            System.out.println("Redone: " + action.getName());
        } else {
            System.out.println("No action to redo.");
        }
    }
}