import java.time.LocalDateTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Adicionando solicitações

        Pilha pilha = new Pilha();
        Scanner scanner = new Scanner(System.in);
        
        pilha.push(1, "Instalação de Software", LocalDateTime.now());
        pilha.push(2, "Manutenção preventiva", LocalDateTime.now());
        pilha.push(3, "Suporte técnico", LocalDateTime.now());
        pilha.push(4, "Troca de equipamentos", LocalDateTime.now());
        pilha.push(5, "Consulta de garantia", LocalDateTime.now());
        pilha.push(6, "Reparo de impressora", LocalDateTime.now());
        pilha.push(7, "Configuração de rede", LocalDateTime.now());
        pilha.push(8, "Restauração de dados", LocalDateTime.now());
        pilha.push(9, "Consulta técnica", LocalDateTime.now());


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

          // Menu para interação com o usuário
          while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar elemento na Pilha");
            System.out.println("2 - Remover elemento da Pilha");
            System.out.println("3 - Exibir estado atual da Pilha");
            System.out.println("4 - Adicionar cliente na Fila");
            System.out.println("5 - Atender (remover) cliente da Fila");
            System.out.println("6 - Exibir estado atual da Fila");
            System.out.println("7 - Sair");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o '\n'

            switch (opcao) {
                case 1:
                    // Adiciona solicitação à Pilha
                    System.out.print("Digite o ID da solicitação: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir o '\n'
                    System.out.print("Digite a descrição da solicitação: ");
                    String descricao = scanner.nextLine();
                    pilha.push(id, descricao, LocalDateTime.now());
                    System.out.println("Solicitação adicionada à Pilha.");
                    break;

                case 2:
                    // Remove o último elemento da Pilha
                    pilha.pop();
                    System.out.println("Solicitação removida da Pilha.");
                    break;

                case 3:
                    // Exibe o estado atual da Pilha
                    System.out.println("\nEstado atual da Pilha:\n");
                    pilha.displayStack();
                    break;

                case 4:
                    // Adiciona cliente à Fila
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a solicitação do cliente: ");
                    String solicitacao = scanner.nextLine();
                    fila.enqueue(nome, solicitacao);
                    System.out.println("Cliente adicionado à Fila.");
                    break;

                case 5:
                    // Remove o próximo cliente da Fila
                    fila.dequeue();
                    System.out.println("Cliente atendido.");
                    break;

                case 6:
                    // Exibe o estado atual da Fila
                    System.out.println("\nEstado atual da Fila:\n");
                    fila.displayQueue();
                    break;

                case 7:
                    // Encerra o programa
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

    }
}}
