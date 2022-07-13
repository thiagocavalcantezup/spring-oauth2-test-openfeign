package br.com.zup.handora.springoauth2testopenfeign.minhasfigurinhas;

public class DetalheDaFigurinhaInputResponse {

    private Long id;
    private String descricao;
    private String enderecoDaImagem;

    public DetalheDaFigurinhaInputResponse() {}

    public DetalheDaFigurinhaInputResponse(Long id, String descricao, String enderecoDaImagem) {
        this.id = id;
        this.descricao = descricao;
        this.enderecoDaImagem = enderecoDaImagem;
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
