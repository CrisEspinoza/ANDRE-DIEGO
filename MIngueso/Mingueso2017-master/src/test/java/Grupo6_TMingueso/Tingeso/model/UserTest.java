package Grupo6_TMingueso.Tingeso.model;

import Grupo6_TMingueso.Tingeso.controllers.ExerciseController;
import Grupo6_TMingueso.Tingeso.models.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

/**
 * Created by mario on 25-10-17.
 */
@DataJpaTest
public class UserTest {

    @Test
    public void CreateUserTest(){

        User user = new User();
        user.setRole("1");

        Assert.assertNotNull(user);
    }

}
