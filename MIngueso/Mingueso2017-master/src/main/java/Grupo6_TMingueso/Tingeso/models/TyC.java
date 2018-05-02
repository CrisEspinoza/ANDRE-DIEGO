package Grupo6_TMingueso.Tingeso.models;

import java.util.List;

/**
 * Created by mario on 04-12-17.
 */
public class TyC {
    private String coordinationName;
    private List<Student> students;

    public String getCoordinationName() {
        return coordinationName;
    }

    public void setCoordinationName(String coordinationName) {
        this.coordinationName = coordinationName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
