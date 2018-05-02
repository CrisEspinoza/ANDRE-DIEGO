/*
package Grupo6_TMingueso.Tingeso.model;
import Grupo6_TMingueso.Tingeso.controllers.PythonController;
import Grupo6_TMingueso.Tingeso.models.Python;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/*
@RunWith(SpringRunner.class)
@WebMvcTest(value = PythonController.class, secure = false)
public class PythonControllerTests {
    String exampleCodeJson = "{\"code\": \"print(5)\"}";
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void compileCodeTest() throws Exception {
        String code = "print(\"python test\")";
        Python mockCode = new Python(code);


        // Send course as body to /students/Student1/courses
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/code")
                .accept(MediaType.APPLICATION_JSON).content(exampleCodeJson)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = result.getResponse();

        assertEquals(HttpStatus.OK.value(), response.getStatus());


    }

}
*/
