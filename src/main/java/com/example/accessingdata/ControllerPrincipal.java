package com.example.accessingdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path="/demo") 

public class ControllerPrincipal {
    @Autowired

   private UsuarioRepository uRepository;

     @PostMapping(path = "/add")
      public @ResponseBody String addNovoUsuario(@RequestParam String nome, @RequestParam String email) {
          Usuario u = new Usuario();
          u.setNome(nome);
          u.setEmail(email);
          uRepository.save(u);
        return "Gravado com Sucesso.";
      }

      @GetMapping(path = "/all")
      public @ResponseBody Iterable<Usuario> getAllUsuarios(){
         
        return uRepository.findAll();
      }
          
      


}
