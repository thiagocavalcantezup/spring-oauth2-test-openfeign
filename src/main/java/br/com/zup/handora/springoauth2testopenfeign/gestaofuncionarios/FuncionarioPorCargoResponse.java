package br.com.zup.handora.springoauth2testopenfeign.gestaofuncionarios;

public class FuncionarioPorCargoResponse {

    private final Long id;
    private final String nome;
    private final String cpf;
    private final String cargo;

    public FuncionarioPorCargoResponse(FuncionarioResponse funcionarioResponse) {
        this.id = funcionarioResponse.getId();
        this.nome = funcionarioResponse.getNome();
        this.cpf = funcionarioResponse.getCpf();
        this.cargo = funcionarioResponse.getCargo();
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
