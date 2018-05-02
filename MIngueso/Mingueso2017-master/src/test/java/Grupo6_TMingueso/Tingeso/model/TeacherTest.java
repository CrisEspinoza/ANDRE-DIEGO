package Grupo6_TMingueso.Tingeso.model;

import Grupo6_TMingueso.Tingeso.controllers.ExerciseController;
import Grupo6_TMingueso.Tingeso.models.Coordination;
import Grupo6_TMingueso.Tingeso.models.Exercise;
import Grupo6_TMingueso.Tingeso.models.Teacher;
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
public class TeacherTest {

    @Test
    public void CreateTeacherTest(){

        Set<Coordination> coordinations = new HashSet<>();
        Set<Exercise> exercises = new HashSet<>();
        Teacher teacher = new Teacher();
        teacher.setEmail("lalalaladsd2341231@gmail.com");
        teacher.setId_teacher(5);
        teacher.setIs_admin(false);
        teacher.setLastName("espinoza silva");
        teacher.setName("cristian eduardo");
        teacher.setPassword("1231263");
        teacher.setRut("197563980");
        teacher.setCoordinations(coordinations);
        teacher.setExercises(exercises);

        Assert.assertNotNull(teacher);
    }

}
