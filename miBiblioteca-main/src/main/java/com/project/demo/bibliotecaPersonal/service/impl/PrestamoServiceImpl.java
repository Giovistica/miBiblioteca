package com.project.demo.bibliotecaPersonal.service.impl;

import com.project.demo.bibliotecaPersonal.dto.PrestamoDto;
import com.project.demo.bibliotecaPersonal.entity.LibroEntity;
import com.project.demo.bibliotecaPersonal.entity.PrestamoEntity;
import com.project.demo.bibliotecaPersonal.mapper.PrestamoMapper;
import com.project.demo.bibliotecaPersonal.repository.PrestamoRepository;
import com.project.demo.bibliotecaPersonal.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PrestamoServiceImpl implements PrestamoService {




   @Autowired
   PrestamoRepository prestamoRepository;

    @Autowired
    PrestamoMapper prestamoMapper;
    @Override
    public PrestamoDto savePrestamo(PrestamoDto dto) {
       PrestamoEntity entity = new PrestamoEntity();
       prestamoRepository.save(prestamoMapper.prestamoDto2Entity(dto));
           return dto;
    }

    @Override
    public PrestamoDto getPrestamoById(String id) {

        Optional<PrestamoEntity> opt = prestamoRepository.findById(id);
        try{
            opt.isPresent();
            PrestamoEntity result = opt.get();
            return prestamoMapper.prestamoEntity2Dto(result);
        }
        catch (Exception e){
            return null;
        }

    }

    @Override
    public PrestamoDto updatePrestamoById(String prestamoId) {
        return null;
    }

    @Override
    public PrestamoDto deletePrestamoById(String id) {

        PrestamoEntity prestamoBorrado = new PrestamoEntity();
        Optional<PrestamoEntity> opt = prestamoRepository.findById(id);
        try{
            opt.isPresent();
            PrestamoEntity result = opt.get();
            prestamoRepository.deleteById(id);
            return prestamoMapper.prestamoEntity2Dto(result);

        }
        catch (Exception e){
            return null;
        }

    }

    @Override
    public List<PrestamoDto> getAllPrestamos() {

        List<PrestamoEntity> list = prestamoRepository.findAll();
        return prestamoMapper.prestamoEntity2DtoList(list);
    }
}
