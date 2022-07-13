package br.com.zup.handora.springoauth2testopenfeign.livraria;

public class AutorParaLivroResponse {

    private final String nome;
    private final String email;

    public AutorParaLivroResponse(DetalhesDoAutorResponse detalhesDoAutorResponse) {
        this.nome = detalhesDoAutorResponse.getNome();
        this.email = detalhesDoAutorResponse.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
