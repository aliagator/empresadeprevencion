package cl.awakelab.empresadeprevencion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "capacitaciones")
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 50)
    private String nombre;

    @Column(nullable = false)
    private Double duracion;

    @Column
    private String descripcion;

    @Column
    private LocalDateTime fechaIngreso;

    @Column
    private Boolean estadoCapacitacion;

    @OneToMany()
    private Cliente cliente;
}
