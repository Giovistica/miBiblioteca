package com.project.demo.bibliotecaPersonal.entity;

import javax.persistence.*;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "libros")
public class LibroEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String titulo;


    @Column(columnDefinition = "varchar(17)", nullable = false)
    private String isbn;

    @Column(columnDefinition = "varchar(25)", nullable = false)
    private String genero;

    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String editorial;

    private boolean enPrestamo = false;

    @OneToMany(mappedBy = "libro")
    List<PrestamoEntity> prestamos;

}
