package Grupo6_TMingueso.Tingeso.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="teacher")

public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_teacher")

    private long id_teacher;

    @Column(name="rut", unique=true, nullable=false)
    private String rut;

    @NotNull
    private String name;

    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private Boolean is_admin;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JsonManagedReference
    @JsonBackReference(value="teacher-coordination")
    private Set<Coordination> coordinations;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JsonManagedReference
    @JsonBackReference(value="teacher-exercise")
    private Set<Exercise> exercises;

    public Teacher() {
    }

    public Set<Coordination> getCoordinations() {
        return coordinations;
    }

    public void setCoordinations(Set<Coordination> coordinations) {
        this.coordinations= coordinations;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }

    public long getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(long id_teacher) {
        this.id_teacher = id_teacher;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }

    public void addCoordination(Coordination coor){
      this.coordinations.add(coor);
    }
}
