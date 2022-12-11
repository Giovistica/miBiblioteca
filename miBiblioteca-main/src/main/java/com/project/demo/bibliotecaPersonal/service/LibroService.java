package com.project.demo.bibliotecaPersonal.service;

import com.project.demo.bibliotecaPersonal.dto.LibroDto;
import com.project.demo.bibliotecaPersonal.entity.LibroEntity;

import java.util.List;

public interface LibroService {

    LibroDto libroSave(LibroDto dto);
    LibroDto libroGet(String id);
    void libroDelete(String id);
    List<LibroDto> getAllLibros();
}
