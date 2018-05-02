package Grupo6_TMingueso.Tingeso.model;

import Grupo6_TMingueso.Tingeso.controllers.ExerciseController;
import Grupo6_TMingueso.Tingeso.models.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

/**
 * Created by mario on 25-10-17.
 */
@DataJpaTest
public class AdministratorTest {

    @Test
    public void CreateAdministratorTest(){

        Administrator admin = new Administrator();
        admin.setEmail("administrador@gmail.com");
        admin.setId_administrator(1);
        admin.setName("Administrador1");

        Assert.assertNotNull(admin);
    }

}
