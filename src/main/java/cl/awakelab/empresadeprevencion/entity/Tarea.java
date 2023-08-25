package cl.awakelab.empresadeprevencion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tareas")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "nombre_tarea",nullable = false, length = 50)
    private String nombreTarea;

    @Column(name = "descripcion",nullable = false, length = 100)
    private String descripcion;

    @Column(name = "entregable",nullable = false)
    private String entregable;

    @Column(name = "fecha_ejecucion",nullable = false, length = 15)
    private LocalDate fechaEjecucion;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_estado",nullable = false)
    private Estado estado;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_tipo_tarea",nullable = false)
    private Encomendado encomendado;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_asesoria",nullable = false)
    private Asesoria asesoria;
}
