package com.project.demo.bibliotecaPersonal.dto;

import com.project.demo.bibliotecaPersonal.entity.PrestamoEntity;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter

public class LibroDto {

    private String id;

    private String titulo;

    private String ISBN;

    private String genero;

    private String editorial;

    private boolean enPrestamo = false;

   private  List<PrestamoEntity> prestamos;

}
