package com.project.demo.bibliotecaPersonal.dto;

import com.project.demo.bibliotecaPersonal.entity.LibroEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PrestamoDto {

    private String id;

    private LibroEntity libro;

    private LocalDate fechaEntrega;

    private LocalDate fechaDevolucion;

    private String prestador;

    private String recibidor;
}
