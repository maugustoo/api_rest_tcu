package hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class PesquisaController {

    @CrossOrigin
    @RequestMapping(value = "/pesquisa/{texto}", method = RequestMethod.GET)
    public Resposta pesquisa(@PathVariable String texto) {

        Resposta resp =  new Resposta(texto);

        return resp;

    }
}
