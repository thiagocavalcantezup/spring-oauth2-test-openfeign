package br.com.zup.handora.springoauth2testopenfeign.minhasfigurinhas;

public class DetalheDaFigurinhaOutputResponse {

    private final Long id;
    private final String descricao;
    private final String enderecoDaImagem;

    public DetalheDaFigurinhaOutputResponse(DetalheDaFigurinhaInputResponse response) {
        this.id = response.getId();
        this.descricao = response.getDescricao();
        this.enderecoDaImagem = response.getEnderecoDaImagem();
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEnderecoDaImagem() {
        return enderecoDaImagem;
    }

}
