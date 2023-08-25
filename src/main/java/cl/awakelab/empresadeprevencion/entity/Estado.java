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
@Table(name = "estados")
public class Estado {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "estado")
    private List<Tarea> estado;
}
