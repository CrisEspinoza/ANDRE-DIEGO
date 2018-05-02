package Grupo6_TMingueso.Tingeso.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="coordination")

public class Coordination implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_coordination")
    private long id_coordination;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_teacher")
    //@JsonBackReference
    //@JsonManagedReference(value="teacher-coordination")
    private Teacher teacher;

    @NotNull
    private String name_coordination;


    @OneToMany(mappedBy = "coordination", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JsonManagedReference
    @JsonBackReference(value="student-coordination")
    private Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public long getId_coordination() {
        return id_coordination;
    }

    public void setId_coordination(long id_coordination) {
        this.id_coordination = id_coordination;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName_coordination() {
        return name_coordination;
    }
    public void setName_coordination(String name_coordination){
        this.name_coordination=name_coordination;
    }

    public Coordination(){

    }
}
