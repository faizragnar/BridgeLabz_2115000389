class Node {
    String text;
    Node prev, next;

    public Node(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

public class UndoRedoTextEditor {
    private Node current;
    private int historySize;
    private int count;

    public UndoRedoTextEditor(int historySize) {
        this.historySize = historySize;
        this.count = 0;
        this.current = new Node("");
    }

    public void type(String newText) {
        Node newNode = new Node(newText);
        newNode.prev = current;
        current.next = newNode;
        current = newNode;
        count++;

        if (count > historySize) {
            current.prev.prev = null;
        }
    }

    public void undo() {
        if (current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current.next != null) {
            current = current.next;
        }
    }

    public void displayCurrentState() {
        System.out.println("Current Text: " + current.text);
    }

    public static void main(String[] args) {
        UndoRedoTextEditor editor = new UndoRedoTextEditor(10);
        editor.type("Hello");
        editor.type("Hello World");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();
    }
}
