package org.oscars.models.desof.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "usuario_gen")
    @TableGenerator(
            name = "usuario_gen",
            table = "usuario_seq",
            pkColumnName = "seq_name",
            valueColumnName = "seq_value",
            pkColumnValue = "usuario",
            allocationSize = 1
    )
    private Long id;

    private String username;

    private String password;

    private String correo;

    @Column(name = "tipo_usuario")
    private Integer tipoUsuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
