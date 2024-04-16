package Lista3ex05;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    
    private List<Contact> contacts;
    
    public ContactBook() {
        this.contacts = new ArrayList<>();
    }
    
    public void incluirContato(Contact contact) {
        contacts.add(contact);
        System.out.println("Contato adicionado com sucesso!");
    }
    
    public void visualizarContatos() {
        if (contacts.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
    
    public void excluirContato(Contact contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            System.out.println("Contato excluído com sucesso!");
        } else {
            System.out.println("Contato não encontrado na agenda.");
        }
    }
}