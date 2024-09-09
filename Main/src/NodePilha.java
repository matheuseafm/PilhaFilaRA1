import java.time.LocalDateTime;

public class NodePilha {
    int id;
    String description;
    LocalDateTime dateTime;
    NodePilha next;

    public NodePilha(int id, String description, LocalDateTime dateTime) {
        this.id = id;
        this.description = description;
        this.dateTime = dateTime;
        this.next = null;
    }
}
