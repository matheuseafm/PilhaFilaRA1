class NodeFila {
    String name;
    int id;
    String reason;
    NodeFila next;

    public NodeFila(String name, int id, String reason) {
        this.name = name;
        this.id = id;
        this.reason = reason;
        this.next = null;
    }
}
