package br.com.zup.handora.springoauth2testopenfeign.livraria;

import java.time.LocalDate;

public class DetalhesDoLivroResponse {

    private Long id;
    private String nome;
    private String descricao;
    private String isbn;
    private Long autorId;
    private LocalDate publicadoEm;

    public DetalhesDoLivroResponse() {}

    public DetalhesDoLivroResponse(Long id, String nome, String descricao, String isbn,
                                   Long autorId, LocalDate publicadoEm) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.isbn = isbn;
        this.autorId = autorId;
        this.publicadoEm = publicadoEm;
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

    public Long getAutorId() {
        return autorId;
    }

    public LocalDate getPublicadoEm() {
        return publicadoEm;
    }

}
