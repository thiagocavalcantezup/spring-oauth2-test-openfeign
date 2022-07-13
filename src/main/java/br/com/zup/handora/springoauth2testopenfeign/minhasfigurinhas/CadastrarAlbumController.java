package br.com.zup.handora.springoauth2testopenfeign.minhasfigurinhas;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CadastrarAlbumController.BASE_URI)
public class CadastrarAlbumController {

    public final static String BASE_URI = "/minhas-figurinhas";

    private final MinhasFigurinhasClient minhasFigurinhasClient;

    public CadastrarAlbumController(MinhasFigurinhasClient minhasFigurinhasClient) {
        this.minhasFigurinhasClient = minhasFigurinhasClient;
    }

    @PostMapping("/albuns")
    public ResponseEntity<?> cadastrarAlbum(@RequestBody @Valid NovoAlbumInputRequest request) {
        ResponseEntity<Void> responseEntity = minhasFigurinhasClient.cadastrarAlbum(
            new NovoAlbumOutputRequest(request)
        );
        String albumLocation = responseEntity.getHeaders().getLocation().toString();
        Integer albumIdIndex = albumLocation.lastIndexOf("/") + 1;
        Long albumId = Long.valueOf(albumLocation.substring(albumIdIndex));

        DetalhesDoAlbumInputResponse response = minhasFigurinhasClient.detalharAlbum(albumId);

        return ResponseEntity.status(HttpStatus.CREATED)
                             .body(new DetalhesDoAlbumOutputResponse(response));
    }

}
