package ves.com.villa1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ves.com.villa1.entity.Persona;
import ves.com.villa1.mapper.PersonaMapper;
import ves.com.villa1.service.PersonaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping(value = "/total")
    public ResponseEntity<?> totalPersonas() {
        return ResponseEntity.ok(service.findAll().stream().map(PersonaMapper.MAPPER::toPersonDto));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> buscarPersona(@PathVariable(name = "id", required = true) int id) {
        return ResponseEntity.ok(PersonaMapper.MAPPER.toPersonDto(service.findById(id)));
    }

    @PostMapping
    public ResponseEntity<?> guardarPersona(@RequestBody Persona persona) {
        return ResponseEntity.ok(PersonaMapper.MAPPER.toPersonDto(service.save(persona)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarPersona(@PathVariable(name = "id", required = true) int id,
            @RequestBody Persona persona) {
        return ResponseEntity.ok(PersonaMapper.MAPPER.toPersonDto(service.updateById(id, persona)));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPersona(@PathVariable(name = "id", required = true) int id) {
        return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
    }
}
