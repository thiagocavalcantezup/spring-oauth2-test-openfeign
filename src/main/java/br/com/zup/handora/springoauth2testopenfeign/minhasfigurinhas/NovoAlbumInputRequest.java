package br.com.zup.handora.springoauth2testopenfeign.minhasfigurinhas;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class NovoAlbumInputRequest {

    @NotBlank
    private String titulo;

    @NotBlank
    @Size(max = 2000)
    private String descricao;

    @Valid
    @NotEmpty
    @Size(max = 3, message = "É permitido incluir no máximo 3 figurinhas no álbum.")
    private List<NovaFigurinhaInputRequest> figurinhas;

    public NovoAlbumInputRequest() {}

    public NovoAlbumInputRequest(@NotBlank String titulo,
                                 @NotBlank @Size(max = 2000) String descricao,
                                 @Valid @NotEmpty List<NovaFigurinhaInputRequest> figurinhas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.figurinhas = figurinhas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<NovaFigurinhaInputRequest> getFigurinhas() {
        return figurinhas;
    }

}
