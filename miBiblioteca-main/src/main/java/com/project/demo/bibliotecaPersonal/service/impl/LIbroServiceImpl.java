package com.project.demo.bibliotecaPersonal.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import com.project.demo.bibliotecaPersonal.dto.LibroDto;
import com.project.demo.bibliotecaPersonal.entity.LibroEntity;
import com.project.demo.bibliotecaPersonal.mapper.LibroMapper;
import com.project.demo.bibliotecaPersonal.repository.LibroRepository;
import com.project.demo.bibliotecaPersonal.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LIbroServiceImpl implements LibroService {

    @Autowired
    LibroMapper libroMapper;

    @Autowired
    LibroRepository libroRepository;

    @Override
    public LibroDto libroSave(LibroDto dto) {

        LibroEntity entity = new LibroEntity();
        libroRepository.save(libroMapper.libroDto2Entity(dto));

        return dto;
    }

    @Override
    public LibroDto libroGet(String id) {

        Optional<LibroEntity> opt = libroRepository.findById(id);
        try{
            opt.isPresent();
            LibroEntity result = opt.get();
            return libroMapper.libroEntity2Dto(result);
        }
        catch (Exception e){
        }
        return null;
    }

    @Override
    public void libroDelete(String id) {

        libroRepository.deleteById(id);

    }

    public List<LibroDto> getAllLibros(){

        List<LibroEntity> entities = libroRepository.findAll();

        return libroMapper.libroEntity2DtoList(entities);

    }


}

