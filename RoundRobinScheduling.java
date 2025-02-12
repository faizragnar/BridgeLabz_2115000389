import java.util.Scanner;

class Process {
    int processID;
    int burstTime;
    int remainingTime;
    Process next;

    public Process(int processID, int burstTime) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null, tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int processID, int burstTime) {
        Process newProcess = new Process(processID, burstTime);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    public void executeProcesses() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }
        
        int currentTime = 0;
        Process temp = head;
        
        System.out.println("\nExecuting processes in Round Robin Scheduling:");
        while (head != null) {
            if (temp.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, temp.remainingTime);
                temp.remainingTime -= execTime;
                currentTime += execTime;
                System.out.println("Process " + temp.processID + " executed for " + execTime + " units. Remaining: " + temp.remainingTime);
                
                if (temp.remainingTime == 0) {
                    removeProcess(temp.processID);
                }
            }
            temp = temp.next;
        }
        
        System.out.println("All processes completed execution.");
    }

    private void removeProcess(int processID) {
        if (head == null) return;
        
        Process temp = head, prev = null;
        do {
            if (temp.processID == processID) {
                if (temp == head && temp == tail) {
                    head = null;
                    tail = null;
                } else {
                    if (temp == head) {
                        head = head.next;
                        tail.next = head;
                    } else if (temp == tail) {
                        prev.next = head;
                        tail = prev;
                    } else {
                        prev.next = temp.next;
                    }
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time quantum: ");
        int timeQuantum = scanner.nextInt();

        RoundRobinScheduler scheduler = new RoundRobinScheduler(timeQuantum);

        System.out.print("Enter number of processes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Process ID and Burst Time: ");
            int processID = scanner.nextInt();
            int burstTime = scanner.nextInt();
            scheduler.addProcess(processID, burstTime);
        }
        
        scheduler.executeProcesses();
        scanner.close();
    }
}