package Grupo6_TMingueso.Tingeso.model;

import Grupo6_TMingueso.Tingeso.controllers.ExerciseController;
import Grupo6_TMingueso.Tingeso.models.Solution;
import Grupo6_TMingueso.Tingeso.models.Student;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

/**
 * Created by mario on 25-10-17.
 */
@DataJpaTest
public class SolutionTest {

    @Test
    public void CreateSolutionTest(){

        Student student = new Student();
        Solution solution = new Solution();
        solution.setAnswer("upsupsups");
        solution.setId_solution(1);
        solution.setStudent(student);
        solution.setId_wordind_doc(5);
        solution.setStart_date(null);
        solution.setEnd_date(null);
        solution.setAttempts(1);

        Assert.assertNotNull(solution);
    }

}
