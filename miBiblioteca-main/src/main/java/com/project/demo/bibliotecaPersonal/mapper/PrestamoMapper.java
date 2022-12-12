package com.project.demo.bibliotecaPersonal.mapper;

import com.project.demo.bibliotecaPersonal.dto.PrestamoDto;
import com.project.demo.bibliotecaPersonal.entity.PrestamoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrestamoMapper {

    public PrestamoDto prestamoEntity2Dto(PrestamoEntity entity){

        PrestamoDto dto = new PrestamoDto();

            dto.setId(entity.getId());
            dto.setLibro(entity.getLibro());
            dto.setFechaEntrega(entity.getFechaEntrega());
            dto.setFechaDevolucion(entity.getFechaDevolucion());
            dto.setPrestador(entity.getPrestador());
            dto.setRecibidor(entity.getRecibidor());

            return dto;

    }

    public PrestamoEntity prestamoDto2Entity(PrestamoDto dto) {

        PrestamoEntity entity = new PrestamoEntity();

            entity.setId(dto.getId());
            entity.setLibro(dto.getLibro());
            entity.setFechaEntrega(dto.getFechaEntrega());
            entity.setFechaDevolucion(dto.getFechaDevolucion());
            entity.setPrestador(dto.getPrestador());
            entity.setRecibidor(dto.getRecibidor());

            return entity;
    }
    public List<PrestamoDto> prestamoEntity2DtoList(List<PrestamoEntity> entities) {
        List <PrestamoDto> dtos = new ArrayList<>();
        for(PrestamoEntity entity : entities){
            dtos.add(this.prestamoEntity2Dto(entity));
        }
        return dtos;
    }

}
