package com.java_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java_mvc.model.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public String inicio() {
        return "usuarios/inicio";
    }

    @GetMapping("/usuario")
    public String exibirUsuario(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNome("Monique Castro");
        usuario.setIdade(20);
        usuario.setMatricula("251041069

        model.addAttribute("usuario", usuario);

        return "usuario";
    }
}