package Grupo6_TMingueso.Tingeso.controllers;

import java.util.concurrent.atomic.AtomicLong;

import Grupo6_TMingueso.Tingeso.models.Python;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mario on 17-10-17.
 */
@RestController
public class PythonController {

    @RequestMapping(value = "/code", method = RequestMethod.POST)
    public ResponseEntity<Python> compileCode(@RequestBody Python code){
        code.compileCode();
        if(code.getError().size() == 0){
            code.setStatusCode(1);
        }
        else{
            code.setStatusCode(0);
        }
        return new ResponseEntity<Python>(code, HttpStatus.OK);
    }
}
