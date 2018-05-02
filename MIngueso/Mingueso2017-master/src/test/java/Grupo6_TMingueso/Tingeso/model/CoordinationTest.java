package Grupo6_TMingueso.Tingeso.model;

import Grupo6_TMingueso.Tingeso.controllers.ExerciseController;
import Grupo6_TMingueso.Tingeso.models.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mario on 25-10-17.
 */
@DataJpaTest
public class CoordinationTest {

    @Test
    public void CreateCoordinationTest(){

        Set<Student> student = new HashSet<>();
        Teacher teacher = new Teacher();
        Coordination coordination = new Coordination();
        coordination.setId_coordination(1);
        coordination.setName_coordination("coordiacion1");
        coordination.setTeacher(teacher);
        coordination.setStudents(student);

        Assert.assertNotNull(coordination);
    }
}
