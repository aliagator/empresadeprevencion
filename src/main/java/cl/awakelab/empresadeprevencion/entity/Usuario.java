package cl.awakelab.empresadeprevencion.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "run", nullable = false, length = 10)
    private int run;

    @Column(name = "nombres", nullable = false, length = 75)
    private String nombres;

    @Column(name = "apellido1", nullable = false, length = 30)
    private String apellido1;

    @Column(name = "apellido2", nullable = false, length = 30)
    private String apellido2;

    @Column(name = "correo_electronico", nullable = false, length = 75)
    private String correoElectronico;

    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Column(name = "direccion", nullable = false, length = 70)
    private String direccion;

    @Column(name = "id_tipo_usuario", nullable = false, length = 1)
    private int idTipoUsuario;

    @Column(name = "login_usuario", nullable = false, length = 30)
    private String loginUsuario;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    @Column(name = "id_cliente", nullable = false)
    private int idCliente;

    @Column(name = "estado_activo", nullable = false)
    private Boolean estadoActivo;

}
