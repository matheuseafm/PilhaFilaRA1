import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {

        // Adicionando solicitações

        Pilha pilha = new Pilha();
        
        pilha.push(1, "Instalação de Software", LocalDateTime.now());
        pilha.push(2, "Manutenção preventiva", LocalDateTime.now());
        pilha.push(3, "Suporte técnico", LocalDateTime.now());
        pilha.push(4, "Troca de equipamentos", LocalDateTime.now());
        pilha.push(5, "Consulta de garantia", LocalDateTime.now());
        pilha.push(6, "Reparo de impressora", LocalDateTime.now());
        pilha.push(7, "Configuração de rede", LocalDateTime.now());
        pilha.push(8, "Restauração de dados", LocalDateTime.now());
        pilha.push(9, "Consulta técnica", LocalDateTime.now());

        // Exibindo a pilha atual
        System.out.println("\nEstado atual da pilha:\n");
        pilha.displayStack();
        System.out.println("\nRemovendo elementos da Pilha:\n");

        // Removendo uma solicitação
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();

        // Exibindo a pilha após remoção
        System.out.println("\nEstado da pilha após remoção:\n");
        pilha.displayStack();
        System.out.println();

        // Adicionando elementos à fila
        Fila fila = new Fila();

        // Adicionando clientes à fila
        fila.enqueue("Maria Silva", "Dúvida sobre produto");
        fila.enqueue("João Souza", "Reclamação de serviço");
        fila.enqueue("Ana Costa", "Solicitação de reembolso");
        fila.enqueue("Pedro Alves", "Informações de entrega");
        fila.enqueue("Carla Dias", "Agendamento de visita");
        fila.enqueue("Lucas Martins", "Alteração de pedido");
        fila.enqueue("Patrícia Rocha", "Cancelamento de contrato");
        fila.enqueue("Rafael Lima", "Renovação de assinatura");
        fila.enqueue("Fernanda Gomes", "Suporte para instalação");
        fila.enqueue("Carlos Eduardo", "Pedido de orçamento");
        fila.enqueue("Bob", "Retorno de Exames");
        fila.enqueue("Carlos", "Informações de entrega");
        fila.enqueue("Joao", "Consulta");
        fila.enqueue("Kevin", "Consulta");

        // Exibindo a fila atual
        System.out.println("\nEstado atual da fila:\n");
        fila.displayQueue();
        System.out.println();

        // Atendendo o próximo cliente
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();

        // Exibindo a fila após atendimento
        System.out.println("\nEstado da fila após atendimento:\n");
        fila.displayQueue();
    }
}
