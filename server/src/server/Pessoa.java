package server;

/**
 * 
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class Pessoa {

    private String nome;
    private String id;
    private String genero;
    private String cpf;

    public Pessoa(String nome, String id, String genero, String cpf) {
        this.nome = nome;
        this.id = id;
        this.genero = genero;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
