
package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Controlador tipo de SpringMVC
@Slf4j
public class ControladorInicio {
      
    @GetMapping("/")
    public String inicio(){ //Con Controller y GetMapping evita el uso de servlets
        log.info("Ejecutando el controlador SpringMVC");
         
        return "index"; //creara y usara archivos html en vez .jsp
        //se creara la pagina de index en Carpeta other resources
        //Carpeta static, archivos estaticos como imagenes, css o javascript
        //Carpeta Templates, paginas
    }
    
}
