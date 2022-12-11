package com.project.demo.bibliotecaPersonal.repository;

import com.project.demo.bibliotecaPersonal.entity.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<LibroEntity, String> {
}
