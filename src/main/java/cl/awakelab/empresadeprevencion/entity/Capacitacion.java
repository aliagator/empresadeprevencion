package cl.awakelab.empresadeprevencion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

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

    @ManyToMany
    @JoinTable(name = "Cliente_Capacitacion",
                joinColumns = @JoinColumn(name = "FK_Capacitacion",nullable = false),
                inverseJoinColumns = @JoinColumn(name = "FK_Cliente",nullable = false))
    private List<Cliente> listaClientes;

}
