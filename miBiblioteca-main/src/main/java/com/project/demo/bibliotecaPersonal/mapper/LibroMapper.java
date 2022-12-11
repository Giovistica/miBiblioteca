package com.project.demo.bibliotecaPersonal.mapper;

import com.project.demo.bibliotecaPersonal.dto.LibroDto;
import com.project.demo.bibliotecaPersonal.entity.LibroEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class LibroMapper {
    public LibroDto libroEntity2Dto(LibroEntity entity) {

        LibroDto libroDto = new LibroDto();

        libroDto.setId(entity.getId());
        libroDto.setTitulo(entity.getTitulo());
        libroDto.setISBN(entity.getIsbn());
        libroDto.setGenero(entity.getGenero());
        libroDto.setEditorial(entity.getEditorial());
        libroDto.setEnPrestamo(entity.isEnPrestamo());
        libroDto.setPrestamos(entity.getPrestamos());

        return libroDto;
    }

    public LibroEntity libroDto2Entity(LibroDto dto) {

        LibroEntity libroEntity = new LibroEntity();

        libroEntity.setTitulo(dto.getTitulo());
        libroEntity.setIsbn(dto.getISBN());
        libroEntity.setGenero(dto.getGenero());
        libroEntity.setEditorial(dto.getEditorial());
        libroEntity.setEnPrestamo(dto.isEnPrestamo());
        //libroEntity.setPrestamos(dto.getPrestamos());

        return libroEntity;
    }

    public List<LibroDto> libroEntity2DtoList(List<LibroEntity> entities) {
        List <LibroDto> dtos = new ArrayList<>();
        for(LibroEntity entity : entities){
            dtos.add(this.libroEntity2Dto(entity));
        }
        return dtos;
    }

}

