package olga.solution.tasks.task2;

public class GenerateId {

    private GenerateId() {
    }

    private static int nextId = 1;

    public static int nextId() {
        return nextId++;
    }

}

