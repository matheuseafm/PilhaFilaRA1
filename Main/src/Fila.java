class Fila {
    private NodeFila front; // Aponta para o primeiro elemento da fila
    private NodeFila rear;  // Aponta para o último elemento da fila

    public Fila() {
        this.front = null;
        this.rear = null;
    }

    // Método para adicionar um cliente à fila
    public void enqueue(String name, int id, String reason) {
        NodeFila newNode = new NodeFila(name, id, reason);

        // Se a fila estiver vazia, o novo nó é tanto o início quanto o fim da fila
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            // Caso contrário, adiciona o novo nó ao fim da fila
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Cliente adicionado: " + name);
    }

    // Método para atender o próximo cliente (remover da frente da fila)
    public NodeFila dequeue() {
        if (front == null) {
            System.out.println("A fila está vazia.");
            return null;
        }

        NodeFila removedNode = front;
        front = front.next;

        // Se a frente da fila ficar vazia após a remoção, ajusta o ponteiro traseiro
        if (front == null) {
            rear = null;
        }

        System.out.println("Cliente atendido: " + removedNode.name);
        return removedNode;
    }

    // Método para exibir o estado atual da fila
    public void displayQueue() {
        if (front == null) {
            System.out.println("A fila está vazia.");
            return;
        }

        NodeFila current = front;
        while (current != null) {
            System.out.println("Nome: " + current.name + ", ID: " + current.id + ", Motivo: " + current.reason);
            current = current.next;
        }
    }
}
