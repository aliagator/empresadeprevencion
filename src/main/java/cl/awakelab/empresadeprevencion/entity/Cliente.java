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
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 12)
    private String rut;

    @Column(nullable = false, length = 200)
    private String razonSocial;

    @Column(nullable = false, length = 100)
    private String nombreContacto;

    @Column(nullable = false, length = 100)
    private String direccion;

    @Column(nullable = false, length = 15)
    private String telefono;

    @Column(nullable = false, length = 50)
    private String correoElectronico;

    @Column(nullable = false)
    private LocalDateTime fechaIngreso;

    @Column(nullable = false)
    private boolean estado;

    @ManyToMany(mappedBy = "listaClientes")
    private List<Capacitacion> listaCapacitaciones;


    @OneToMany(mappedBy = "Rol")
    private List<Usuario> listaUsuarios;

    @OneToMany(mappedBy = "listaClientes")
    private List<Accidente> listaAccidentes;


}
