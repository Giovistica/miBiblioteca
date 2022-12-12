package com.project.demo.bibliotecaPersonal.service;

import com.project.demo.bibliotecaPersonal.dto.PrestamoDto;

import java.util.List;

public interface PrestamoService {

    PrestamoDto savePrestamo(PrestamoDto prestamo);

    PrestamoDto getPrestamoById(String prestamoId);

    PrestamoDto updatePrestamoById(String prestamoId);

    PrestamoDto deletePrestamoById(String prestamoId);

    List<PrestamoDto> getAllPrestamos();

}
