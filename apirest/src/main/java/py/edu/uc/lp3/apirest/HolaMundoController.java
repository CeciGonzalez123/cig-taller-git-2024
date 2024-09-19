package py.edu.uc.lp3.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo!";
    }
}
