package Grupo6_TMingueso.Tingeso.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="student")


public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id")
    private long student_id;

    @Column(name="rut", unique=true, nullable=false)
    private String rut;

    @NotNull
    private String name;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String password;


    private Integer total_spend_time;


    private Integer total_wordings;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonBackReference(value="student-solution")
    private Set<Solution> solutions;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_coordination")
    private Coordination coordination;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "statistic_id")
    private Statistic statistic;

    public Statistic getStatistic()
    {
      return this.statistic;
    }

    public void setStatistic(Statistic statistic)
    {
      this.statistic = statistic;
    }

    public Coordination getCoordination() {
        return coordination;
    }

    public void setCoordination(Coordination coordination) {
        this.coordination = coordination;
    }

    public Set<Solution> getSolutions() {
        return solutions;
    }

    public void setSolutions(Set<Solution> solutions) {
        this.solutions = solutions;
    }

    public long getStudent_id(){

        return student_id;
    }
    public void setStudent_id(long student_id)
    {

        this.student_id= student_id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name= name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName= lastName;
    }

    public String getEmail(){return email;}

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTotal_spend_time() {
        return total_spend_time;
    }

    public void setTotal_spend_time(Integer total_spend_time) {
        this.total_spend_time = total_spend_time;
    }

    public Integer getTotal_wordings() {
        return total_wordings;
    }

    public void setTotal_wordings(Integer total_wordings) {
        this.total_wordings = total_wordings;
    }



    /*public Student(){


}*/


}
