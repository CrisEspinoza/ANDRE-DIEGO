package Grupo6_TMingueso.Tingeso.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="administrator")


//clase que tiene la entidad o tabla de administradot
//esta representa el administrador del sistema que tiene la capacidad de hacer todos los cambios
//es decir tiene el permiso de ocupar todas las funcionalidades
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_administrator")
    private long id_administrator;

    @NotNull
    private String name;

    @NotNull
    private String email;

    public long getId_administrator() {
        return id_administrator;
    }

    public void setId_administrator(long id_administrator) {
        this.id_administrator = id_administrator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
