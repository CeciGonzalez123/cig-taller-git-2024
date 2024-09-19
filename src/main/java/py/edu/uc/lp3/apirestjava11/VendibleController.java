package py.edu.uc.lp3.apirestjava11;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VendibleController {


    @GetMapping("/vendibles")
    public ResponseEntity<List<Vendible>> mostrarVendibles() {
        List<Vendible> vendibles = new ArrayList<>();
        SkinsPersonaje latino = new SkinsPersonaje(123);
        latino.setDescripcion("Messi");
        latino.setNombre("Leo");
        Subfusil subfusil = new Subfusil(1700,
                5, "Subfusil MP7", "MP7"); // Assuming Subfusil class exists
        vendibles.add(subfusil);
        vendibles.add(latino);

        Subfusil subfusil2 = new Subfusil(5000,
                10, "Subfusil MP5", "MP5"); // Assuming Subfusil class exists
        vendibles.add(subfusil2);



        // Explicitly return 200 OK status code
        return new ResponseEntity<>(vendibles, HttpStatus.OK);
    }


}
