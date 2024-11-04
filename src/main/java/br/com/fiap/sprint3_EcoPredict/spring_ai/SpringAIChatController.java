package br.com.fiap.sprint3_EcoPredict.spring_ai;

import br.com.fiap.sprint3_EcoPredict.response.ProdutoResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/springai")
@Tag(name = "Basic - Spring AI")
public class SpringAIChatController {

    private final SpringAIChatService chatService;

    public SpringAIChatController(SpringAIChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/generate")
    public ResponseEntity<ProdutoResponse> generate(@RequestParam(value = "message") String message) {
        String respostaIA = chatService.run("Descreva o produto: " + message);

        ProdutoResponse produtoResponseDTO = new ProdutoResponse();
        produtoResponseDTO.setDescricaoDaIA(respostaIA);

        return new ResponseEntity<>(produtoResponseDTO, HttpStatus.OK);
    }
}
















