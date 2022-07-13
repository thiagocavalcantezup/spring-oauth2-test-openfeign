package br.com.zup.handora.springoauth2testopenfeign.gestaofuncionarios;

import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ListarFuncionariosPorCargoController.BASE_URI)
public class ListarFuncionariosPorCargoController {

    public final static String BASE_URI = "/gestao-funcionarios";

    private final GestaoFuncionariosClient gestaoFuncionariosClient;

    public ListarFuncionariosPorCargoController(GestaoFuncionariosClient gestaoFuncionariosClient) {
        this.gestaoFuncionariosClient = gestaoFuncionariosClient;
    }

    @GetMapping
    public ResponseEntity<?> listarPorEmpresa(@RequestParam(required = true) String cargo) {
        return ResponseEntity.ok(
            gestaoFuncionariosClient.listar()
                                    .stream()
                                    .filter(c -> c.getCargo().equals(cargo))
                                    .map(FuncionarioPorCargoResponse::new)
                                    .collect(Collectors.toList())
        );
    }

}
