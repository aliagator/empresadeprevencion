package cl.awakelab.empresadeprevencion.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accidentes")
public class Accidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 10)
    private int rut;

    @Column(length = 8)
    private LocalDate fechaAccidente;

    @Column(length = 10)
    private LocalTime horaAccidente;

    @Column(length = 50)
    private String lugar;

    @Column(length = 20)
    private String causaAccidente;

    @Column(length = 100)
    private String consencuencias;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_Cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_Trabajadores", nullable = false)
    private Trabajador trabajador;
}
