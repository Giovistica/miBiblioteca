package com.project.demo.bibliotecaPersonal.controller;

import com.project.demo.bibliotecaPersonal.dto.PrestamoDto;
import com.project.demo.bibliotecaPersonal.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("prestamo")
public class PrestamoController {

    @Autowired
    PrestamoService prestamoService;

    @PostMapping()
    public ResponseEntity<PrestamoDto> save(@RequestBody PrestamoDto prestamo) {
        PrestamoDto prestamoGuardado = prestamoService.savePrestamo(prestamo);
        return ResponseEntity.status(HttpStatus.CREATED).body(prestamoGuardado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrestamoDto> get(@PathVariable("id") String id) {

        PrestamoDto prestamoDto = prestamoService.getPrestamoById(id);
        return ResponseEntity.status(HttpStatus.OK).body(prestamoDto);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<PrestamoDto>> getAll() {

        List<PrestamoDto> list = prestamoService.getAllPrestamos();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }


    @DeleteMapping("/{is}")
    public ResponseEntity<String> delete(@PathVariable("id") String id){

        prestamoService.deletePrestamoById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Usuario Eliminado correctamente");
    }
}