package br.com.zup.handora.springoauth2testopenfeign.minhasfigurinhas;

import java.util.List;
import java.util.stream.Collectors;

public class NovoAlbumOutputRequest {

    private final String titulo;
    private final String descricao;
    private final List<NovaFigurinhaOutputRequest> figurinhas;

    public NovoAlbumOutputRequest(NovoAlbumInputRequest request) {
        this.titulo = request.getTitulo();
        this.descricao = request.getDescricao();
        this.figurinhas = request.getFigurinhas()
                                 .stream()
                                 .map(NovaFigurinhaOutputRequest::new)
                                 .collect(Collectors.toList());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<NovaFigurinhaOutputRequest> getFigurinhas() {
        return figurinhas;
    }

}
