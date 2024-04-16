package Lista3ex05;

class Contact {
    private String nome;
    private String endereco;
    private String sexo;
    private String telefone;
    private String celular;
    private String email;

    public Contact(String nome, String endereco, String sexo, String telefone, String celular, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Nome: " + nome + "\nEndereço: " + endereco + "\nSexo: " + sexo + "\nTelefone: " + telefone +
                "\nCelular: " + celular + "\nE-mail: " + email + "\n";
    }
}