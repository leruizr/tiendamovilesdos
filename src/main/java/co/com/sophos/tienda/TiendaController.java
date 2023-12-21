package co.com.sophos.tienda;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class TiendaController {

    @GetMapping("/hola")
    public String saludar(){

        String name = "Angela";
        return name + "," +"Hola Mundo";
    }



}
