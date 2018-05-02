package Grupo6_TMingueso.Tingeso.model;

import Grupo6_TMingueso.Tingeso.controllers.ExerciseController;
import Grupo6_TMingueso.Tingeso.models.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import Grupo6_TMingueso.Tingeso.models.Exercise;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mario on 25-10-17.
 */
@DataJpaTest
public class ExerciseControllerTests {

    public Student ProofStudent (){

        Set<Solution> solutions = new HashSet<>();
        Student student = new Student();
        Statistic statistic = new Statistic();
        Coordination coordinator = new Coordination();
        student.setEmail("estudiante1@gmail.com");
        student.setLastName("Estudiante");
        student.setName("Hola");
        student.setRut("123456789");
        student.setPassword("lalallaa");
        student.setCoordination(coordinator);
        student.setSolutions(solutions);
        student.setTotal_wordings(5);
        student.setStudent_id(1);
        student.setTotal_spend_time(5);
        student.setStatistic(statistic);

        return student;
    }

    public Exercise ProofExercises (){

        Teacher teacher = new Teacher();
        Exercise test = new Exercise();
        test.setTitle("New Exercise");
        test.setText("Try and solve this very hard problem");
        test.setAnswer("one");
        test.setId_exercise(1);
        test.setTeacher(teacher);
        test.setParametro1("1");
        test.setRespuesta1("3");
        test.setParametro2("3");
        test.setRespuesta2("4");
        test.setParametro3("3");
        test.setRespuesta3("3");
        test.setFunctionName("sumar");
        test.setType("recursion");

        return test;
    }

    @Test
    public void CreateExerciseTest(){

        Exercise test = ProofExercises();

        Assert.assertNotNull(test);
    }

    @Test
    public void NewStudent(){

        Student student = ProofStudent();

        Assert.assertNotNull(student);
    }

}
