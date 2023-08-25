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
// Tabla tipo_Tarea renombrada Encomendado.
@Table(name = "encomendados")
public class Encomendado {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "encomendado")
    private List<Tarea> tipo;


}
