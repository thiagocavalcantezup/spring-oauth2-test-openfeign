package br.com.zup.handora.springoauth2testopenfeign.meuscontatos;

public class ContatoResponse {

    private Long id;
    private String nome;
    private String empresa;

    public ContatoResponse() {}

    public ContatoResponse(Long id, String nome, String empresa) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmpresa() {
        return empresa;
    }

}
