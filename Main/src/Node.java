import java.time.LocalDateTime;

public class Node {
    int id;
    String description;
    LocalDateTime dateTime;
    Node next;

    public Node(int id, String description, LocalDateTime dateTime) {
        this.id = id;
        this.description = description;
        this.dateTime = dateTime;
        this.next = null;
    }
}
