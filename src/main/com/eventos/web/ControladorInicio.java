package com.eventos.web;

import com.eventos.servicio.PaisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorInicio {
    @Autowired
    
    private PaisService paisService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var paises = paisService.listar();
        log.info("Ejecuntado controlador INICIO Spring MVC");
        model.addAttribute("paises",paises);
        return "index";
    }
    
}
