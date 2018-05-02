package Grupo6_TMingueso.Tingeso;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TingesoApplicationTest {

    @Autowired
    private TingesoApplication applicationContext;

    @Test
    public void main(){
        applicationContext = new TingesoApplication();

        Assert.assertNotNull(applicationContext);
    }

}
