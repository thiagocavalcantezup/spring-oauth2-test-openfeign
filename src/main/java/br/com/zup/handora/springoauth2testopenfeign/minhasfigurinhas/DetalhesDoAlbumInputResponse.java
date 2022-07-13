package br.com.zup.handora.springoauth2testopenfeign.minhasfigurinhas;

import java.util.List;

public class DetalhesDoAlbumInputResponse {

    private Long id;
    private String titulo;
    private String descricao;
    private String dono;
    private List<DetalheDaFigurinhaInputResponse> figurinhas;

    public DetalhesDoAlbumInputResponse() {}

    public DetalhesDoAlbumInputResponse(Long id, String titulo, String descricao, String dono,
                                        List<DetalheDaFigurinhaInputResponse> figurinhas) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dono = dono;
        this.figurinhas = figurinhas;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDono() {
        return dono;
    }

    public List<DetalheDaFigurinhaInputResponse> getFigurinhas() {
        return figurinhas;
    }

}
