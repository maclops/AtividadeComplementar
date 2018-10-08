package br.com.wellington.atividadeComplementar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.wellington.atividadeComplementar.service.AtividadeService;

@RestController
@RequestMapping(value="/atividades")
public class AtividadeResource {
    private AtividadeService service;
    
    @Autowired
    public AtividadeResource(AtividadeService service) {
        this.service = service;
    }
    
    @RequestMapping(value="/{name}",method=RequestMethod.GET)
    public ResponseEntity<?> findByName(@PathVariable String name) {
        return ResponseEntity.ok().body(service.findByName(name));
    }
    
}