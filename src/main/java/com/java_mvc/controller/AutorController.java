package com.java_mvc.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java_mvc.model.Autor;

@Controller
@RequestMapping("/autores")
public class AutorController {

    @GetMapping
    public String inicio() {
        return "autores/inicio";
    }

    @GetMapping("/autor")
    public String exibirAutor(Model model) {
        Autor autor = new Autor();
        autor.setNome("Sergey Strugatsky");
        autor.setNacionalidade("Rússia");
        
        ArrayList<String> obras = new ArrayList<>();
        obras.add("Roadside Picnic");
        autor.setObrasPublicadas(obras);

        model.addAttribute("autor", autor);

        return "autor";
    }
}