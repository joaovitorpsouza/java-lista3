package Lista3ex05;

public class Main {
    public static void main(String[] args) {
        ContactBook agenda = new ContactBook();

        // Criando alguns contatos para testar
        Contact contato1 = new Contact("João", "Rua São José, 123", "Masculino", "123456789", "987654321", "joao@gmail.com");
        Contact contato2 = new Contact("Ana", "Rua São João, 456", "Feminino", "987654321", "123456789", "ana@gmail.com");

        agenda.incluirContato(contato1);
        agenda.incluirContato(contato2);

        System.out.println("Contatos na agenda:");
        agenda.visualizarContatos();

        agenda.excluirContato(contato2);

        System.out.println("Contatos após exclusão:");
        agenda.visualizarContatos();
    }
}