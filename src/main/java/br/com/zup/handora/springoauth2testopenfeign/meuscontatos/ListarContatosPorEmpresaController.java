package br.com.zup.handora.springoauth2testopenfeign.meuscontatos;

import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ListarContatosPorEmpresaController.BASE_URI)
public class ListarContatosPorEmpresaController {

    public final static String BASE_URI = "/meus-contatos";

    private final MeusContatosClient meusContatosClient;

    public ListarContatosPorEmpresaController(MeusContatosClient meusContatosClient) {
        this.meusContatosClient = meusContatosClient;
    }

    @GetMapping
    public ResponseEntity<?> listarPorEmpresa(@RequestParam(required = true) String empresa) {
        return ResponseEntity.ok(
            meusContatosClient.listar()
                              .stream()
                              .filter(c -> c.getEmpresa().equals(empresa))
                              .map(ContatoPorEmpresaResponse::new)
                              .collect(Collectors.toList())
        );
    }

}
