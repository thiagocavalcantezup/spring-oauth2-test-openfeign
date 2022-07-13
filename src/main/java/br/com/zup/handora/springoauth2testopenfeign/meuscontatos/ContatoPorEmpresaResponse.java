package br.com.zup.handora.springoauth2testopenfeign.meuscontatos;

public class ContatoPorEmpresaResponse {

    private Long id;
    private String nome;
    private String empresa;

    public ContatoPorEmpresaResponse() {}

    public ContatoPorEmpresaResponse(ContatoResponse contatoResponse) {
        this.id = contatoResponse.getId();
        this.nome = contatoResponse.getNome();
        this.empresa = contatoResponse.getEmpresa();
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
