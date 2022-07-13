package br.com.zup.handora.springoauth2testopenfeign.livraria;

import java.time.LocalDate;

public class DetalhesDoLivroComAutorResponse {

    private final Long id;
    private final String nome;
    private final String descricao;
    private final String isbn;
    private final AutorParaLivroResponse autor;
    private final LocalDate publicadoEm;

    public DetalhesDoLivroComAutorResponse(DetalhesDoLivroResponse detalhesDoLivroResponse,
                                           DetalhesDoAutorResponse detalhesDoAutorResponse) {
        this.id = detalhesDoLivroResponse.getId();
        this.nome = detalhesDoLivroResponse.getNome();
        this.descricao = detalhesDoLivroResponse.getDescricao();
        this.isbn = detalhesDoLivroResponse.getIsbn();
        this.autor = new AutorParaLivroResponse(detalhesDoAutorResponse);
        this.publicadoEm = detalhesDoLivroResponse.getPublicadoEm();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public AutorParaLivroResponse getAutor() {
        return autor;
    }

    public LocalDate getPublicadoEm() {
        return publicadoEm;
    }

}
