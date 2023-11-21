package com.eventos.web;
import javax.validation.Valid;
import com.eventos.domain.Pais;
import com.eventos.servicio.PaisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class ControladorInicio {
    @Autowired    
    private PaisService paisService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var paises = paisService.listar();
        //log.warn("Pais 1: " + paises.get(0));
        log.info("Ejecuntado controlador INICIO Spring MVC");
        model.addAttribute("paises",paises);
        return "index";
        //String connectionString = "mongodb+srv://cartafernando7:tac6SzZjNMiTYRoa@eventospoli.qbmpd3f.mongodb.net/?retryWrites=true&w=majority";
    }

    @GetMapping("/agregar")
    public String agregar(Pais pais){
        return "modificarPais";
    }
    @PostMapping("/guardar")
    public String guardar(@Valid Pais pais, Errors errores){
        if(errores.hasErrors()){
            return "modificarPais";
        }
        paisService.guardar(pais);
        return "redirect:/";
    }
    
}
