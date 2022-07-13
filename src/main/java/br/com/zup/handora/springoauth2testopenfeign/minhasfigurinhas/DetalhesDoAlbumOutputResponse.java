package br.com.zup.handora.springoauth2testopenfeign.minhasfigurinhas;

import java.util.List;
import java.util.stream.Collectors;

public class DetalhesDoAlbumOutputResponse {

    private final TipoPlanoOutputResponse planoContratado;
    private final Long id;
    private final String titulo;
    private final String descricao;
    private final String dono;
    private final List<DetalheDaFigurinhaOutputResponse> figurinhas;

    public DetalhesDoAlbumOutputResponse(DetalhesDoAlbumInputResponse response) {
        this.planoContratado = TipoPlanoOutputResponse.FREEMIUM;
        this.id = response.getId();
        this.titulo = response.getTitulo();
        this.descricao = response.getDescricao();
        this.dono = response.getDono();
        this.figurinhas = response.getFigurinhas()
                                  .stream()
                                  .map(DetalheDaFigurinhaOutputResponse::new)
                                  .collect(Collectors.toList());
    }

    public TipoPlanoOutputResponse getPlanoContratado() {
        return planoContratado;
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

    public List<DetalheDaFigurinhaOutputResponse> getFigurinhas() {
        return figurinhas;
    }

}
