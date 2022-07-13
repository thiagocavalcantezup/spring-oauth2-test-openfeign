package br.com.zup.handora.springoauth2testopenfeign.gestaofuncionarios;

public class FuncionarioResponse {

    private Long id;
    private String nome;
    private String cpf;
    private String cargo;

    public FuncionarioResponse() {}

    public FuncionarioResponse(Long id, String nome, String cpf, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

}
