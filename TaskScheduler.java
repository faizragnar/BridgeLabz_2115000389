class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null;
    private Task tail = null;
    private Task currentTask = null;

    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        Task current = head, prev = null;
        do {
            if (current.taskId == taskId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Task removed: " + taskId);
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
        System.out.println("Task not found: " + taskId);
    }

    public void viewCurrentTask() {
        if (currentTask == null) currentTask = head;
        if (currentTask != null) {
            System.out.println("Current Task: " + currentTask.taskName + " (Priority: " + currentTask.priority + ") Due: " + currentTask.dueDate);
        } else {
            System.out.println("No tasks available.");
        }
    }

    public void moveToNextTask() {
        if (currentTask == null) currentTask = head;
        if (currentTask != null) {
            currentTask = currentTask.next;
            viewCurrentTask();
        }
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        Task current = head;
        do {
            System.out.println("Task ID: " + current.taskId + ", Name: " + current.taskName + ", Priority: " + current.priority + ", Due: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        Task current = head;
        boolean found = false;
        do {
            if (current.priority == priority) {
                System.out.println("Task ID: " + current.taskId + ", Name: " + current.taskName + ", Due: " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) System.out.println("No tasks found with priority: " + priority);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        
        ts.addTaskAtEnd(1, "Submit report", 2, "2025-02-15");
        ts.addTaskAtEnd(2, "Prepare presentation", 1, "2025-02-20");
        ts.addTaskAtEnd(3, "Code review", 3, "2025-02-18");
        
        System.out.println("All Tasks:");
        ts.displayAllTasks();

        System.out.println("Current Task:");
        ts.viewCurrentTask();

        System.out.println("Moving to Next Task:");
        ts.moveToNextTask();

        System.out.println("Searching tasks with priority 1:");
        ts.searchByPriority(1);

        System.out.println("Removing Task ID 2...");
        ts.removeTaskById(2);

        System.out.println("Final Task List:");
        ts.displayAllTasks();
    }
}
