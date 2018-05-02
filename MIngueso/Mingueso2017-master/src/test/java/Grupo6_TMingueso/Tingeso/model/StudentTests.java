package Grupo6_TMingueso.Tingeso.model;

/**
 * Created by mario on 25-10-17.
 */
import Grupo6_TMingueso.Tingeso.models.Coordination;
import Grupo6_TMingueso.Tingeso.models.Solution;
import Grupo6_TMingueso.Tingeso.models.Statistic;
import Grupo6_TMingueso.Tingeso.models.Student;
import jdk.internal.dynalink.beans.StaticClass;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;


public class StudentTests {

    @Test
    public void NewStudent(){

        Set<Solution> solutions = new HashSet<>();
        Student student = new Student();
        Coordination coordinator = new Coordination();
        Statistic statistic = new Statistic();
        student.setEmail("estudiante2@gmail.com");
        student.setLastName("Estudiando el maquina");
        student.setName("huaso !! ");
        student.setPassword("12345678910");
        student.setRut("1918188970");
        student.setCoordination(coordinator);
        student.setStudent_id(1);
        student.setTotal_spend_time(3);
        student.setTotal_wordings(5);
        student.setSolutions(solutions);
        student.setStatistic(statistic);

        Assert.assertNotNull(student);
    }
}
