package cl.awakelab.empresadeprevencion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "asesorias")
public class Asesoria {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "asesoria")
    private List<Tarea> nombreAsesoria;

    /*@ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_Riesgo", nullable = false)
    private Riesgo riesgo;*/

    @Column(nullable = false, length = 100)
    private String descripcionAsesoria;

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_Cliente", nullable = false)
    private Cliente cliente;

    @Column(nullable = false)
    private boolean estado;
}
