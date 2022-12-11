package com.project.demo.bibliotecaPersonal.controller;

import com.project.demo.bibliotecaPersonal.dto.LibroDto;
import com.project.demo.bibliotecaPersonal.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("libro")
public class LibroController {

    @Autowired
    LibroService libroService;

    @PostMapping
    public ResponseEntity<LibroDto> save(@RequestBody LibroDto libro){
        LibroDto libroGuardado = libroService.libroSave(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(libroGuardado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibroDto> get(@PathVariable("id") String id){

        LibroDto libroDto = libroService.libroGet(id);
        return ResponseEntity.status(HttpStatus.OK).body(libroDto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") String id){

        libroService.libroDelete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Usuario Eliminado correctamente");
    }

    @GetMapping("/lista")
    public ResponseEntity<List<LibroDto>> getAll(){
        List<LibroDto> list = libroService.getAllLibros();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

}
