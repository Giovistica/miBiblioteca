package com.project.demo.bibliotecaPersonal.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter

@Entity
@Table(name = "prestamos")
public class PrestamoEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "libro")
    private LibroEntity libro;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate fechaEntrega;



    @Column(name = "fecha_devolucion")
    private LocalDate fechaDevolucion;

   @Column(columnDefinition = "varchar(50)",nullable = false)
   private String prestador;

    @Column(columnDefinition = "varchar(50)",nullable = false)
    private String recibidor;


}
