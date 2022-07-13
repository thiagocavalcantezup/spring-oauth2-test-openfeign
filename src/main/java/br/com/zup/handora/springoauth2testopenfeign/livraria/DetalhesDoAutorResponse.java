package br.com.zup.handora.springoauth2testopenfeign.livraria;

public class DetalhesDoAutorResponse {

    private String nome;
    private String email;

    public DetalhesDoAutorResponse() {}

    public DetalhesDoAutorResponse(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
