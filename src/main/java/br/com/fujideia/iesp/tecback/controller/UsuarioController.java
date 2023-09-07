package br.com.fujideia.iesp.tecback.controller;

/* - QUARTO PASSO
Primeiro vamos mapear os requeste map,
*  -metodo quer salva Post
  CONTROLLER: Orquestrador,receber chamadas e retorna dados.*/

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;


    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
        usuario = service.salvar(usuario);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping ("/{idConsulta}")
    public ResponseEntity<Usuario>consultarPorId(@PathVariable int idConsulta){
        return ResponseEntity.ok(service.consultarPorId(idConsulta));
    }

    @DeleteMapping("/{deletId}")
    public ResponseEntity excluirPorId(@PathVariable int deletId){
        service.excluirPorId(deletId);
        return ResponseEntity.ok().build();
    }



}

