package Grupo6_TMingueso.Tingeso.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="solution")

public class Solution {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_solution")
    private long id_solution;

    @NotNull
    private Timestamp start_date;

    @NotNull
    private long id_wordind_doc;

    @NotNull
    private String answer;

    private int attempts;

    private String status;

    @NotNull
    private Timestamp end_date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    //@JsonBackReference
    //@JsonManagedReference(value="student-solution")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getAttempts()
    {
      return this.attempts;
    }

    public void setAttempts(int attempts)
    {
      this.attempts = attempts;
    }

    public String getStatus()
    {
      return this.status;
    }

    public void getStatus(String status)
    {
      this.status = status;
    }

    public long getId_solution() {
        return id_solution;
    }

    public void setId_solution(long id_solution) {
        this.id_solution = id_solution;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Timestamp getEnd_date() {
        return end_date;

    }

    public void setEnd_date(Timestamp end_date) {
        this.end_date = end_date;
    }

    public long getId_wordind_doc() {
        return id_wordind_doc;
    }

    public void setId_wordind_doc(long id_wordind_doc) {
        this.id_wordind_doc = id_wordind_doc;
    }
}
