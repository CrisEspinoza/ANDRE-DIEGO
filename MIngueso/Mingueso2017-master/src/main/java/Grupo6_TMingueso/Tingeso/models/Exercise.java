package Grupo6_TMingueso.Tingeso.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
//import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="exercise")

public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_exercise")
    private long id_exercise;

    @NotNull
    private String text;

    @NotNull
    private String title;

    @NotNull
    private String answer;

    private String type;

    private String parametro1;

    private String respuesta1;

    private String parametro2;

    private String respuesta2;

    private String parametro3;

    private String respuesta3;

    private String functionName;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_teacher")
    //@JsonBackReference
    //@JsonManagedReference(value="teacher-exercise")
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setParametro1(String parametro1) {
        this.parametro1 = parametro1;
    }

    public String getParametro1() {
        return this.parametro1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta1() {
        return this.respuesta1;
    }

    public void setParametro2(String parametro2) {
        this.parametro2 = parametro2;
    }

    public String getParametro2() {
        return this.parametro2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta2() {
        return this.respuesta2;
    }

    public void setParametro3(String parametro3) {
        this.parametro3 = parametro3;
    }

    public String getParametro3() {
        return this.parametro3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3= respuesta3;
    }

    public String getRespuesta3() {
        return this.respuesta3;
    }

    public void setFunctionName(String functionName) {
        this.functionName= functionName;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public long getId_exercise() {
        return id_exercise;
    }

    public void setId_exercise(long id_exercise) {
        this.id_exercise = id_exercise;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public Exercise(){

    }

}
