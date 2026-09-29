import ch.fhnw.prog1.exercise.todo.Task;

Task[] tasks = new Task[100];
int index = 0;

void main() {
        IO.println("""
                ---------
                 ToDoApp
                ---------
                Available commands:
                  list all           Prints all tasks
                  list to do         Prints the tasks that are not done yet
                  add <description>  Adds a new task with the given description
                  mark done <id>     Marks the task with the given id as done
                  exit               Exits the app. Warning: Tasks with be lost!
                """);

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            IO.print("todo> ");
            input = scanner.nextLine();
            if (input.equals("list all")) {
                listTasks(true);
            } else if (input.equals("list to do")) {
                listTasks(false);
            } else if (input.matches("add .+")) {
                String description = input.substring(4);
                addTask(description);
            } else if (input.matches("mark done \\d+")) {
                int id = Integer.parseInt(input.substring(10));
                markTaskDone(id);
            } else if (!input.equals("exit")) {
                IO.println("Unknown command");
            }
        } while (!input.equals("exit"));
    }

    /**
     * Gibt Tasks auf der Konsole aus. Falls der Parameter 'all' true ist,
     * werden alle Tasks ausgegeben, ansonsten nur die Tasks, die noch nicht
     * erledigt sind. Die Ausgabe eines einzelnen Tasks soll so gemacht werden:
     * <pre>
     * IO.println(task);
     * </pre>
     * Dafür muss in der Task-Klasse die toString-Methode implementiert werden.
     * Falls keine Tasks ausgegeben werden, soll dafür die Meldung "(No tasks)"
     * angezeigt werden.
     */
    public void listTasks(boolean all) {
        if (index == 0) {
            IO.println("(No tasks)");
        }

        for (int i = 0; i < index; i++) {
            if (all || !tasks[i].done) {
                IO.println(tasks[i]);
            }
        }
    }

    /**
     * Fügt einen Task hinzu. Diese Methode findet zuerst den ersten freien
     * Platz im Task-Array; dieser Index entspricht der Task-ID. Dann wird ein
     * neues Task-Objekt mit dieser ID und der gegebenen Beschreibung erstellt
     * und an diesem Platz im Array eingefügt.
     */
    public void addTask(String description) {
        this.tasks[index]= new Task(index, description);
        ++index;
    }

    /**
     * Markiert den Task mit der gegebenen ID als erledigt. Die ID entspricht
     * dem Platz im Array, dadurch kann das entsprechende Task-Objekt einfach
     * gefunden werden. Falls kein Task mit dieser ID gespeichert ist, wird die
     * Meldung "Task with ID XX not found" ausgegeben.
     */
    public void markTaskDone(int id) {
        if (tasks[id] == null) {
            IO.println("Task with ID " + id + " not found");
        }

        this.tasks[id].markDone();
    }
