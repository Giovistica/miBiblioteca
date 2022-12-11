package com.project.demo.bibliotecaPersonal.repository;

import com.project.demo.bibliotecaPersonal.entity.PrestamoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<PrestamoEntity, String> {}
