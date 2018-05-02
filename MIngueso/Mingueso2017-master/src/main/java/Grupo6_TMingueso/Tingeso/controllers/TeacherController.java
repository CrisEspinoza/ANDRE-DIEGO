package Grupo6_TMingueso.Tingeso.controllers;

import Grupo6_TMingueso.Tingeso.models.Teacher;
import Grupo6_TMingueso.Tingeso.models.Coordination;
import java.util.Set;
import java.util.HashSet;
import Grupo6_TMingueso.Tingeso.repository.TeacherRepository;
import Grupo6_TMingueso.Tingeso.repository.CoordinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/teacher")

public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;
    private CoordinationRepository coordinationRepository;

    //Nota: el delete y el update son los mismo para coordinador y profesor
    // pero el post y get son distintos estan especificados mas abajo, con la url respectiva

    //metodo que retorna un teacher de acuerdo a su id
    @GetMapping(path = "/{id}")
    public @ResponseBody Teacher getTeacher(@PathVariable("id") Integer id){
        long lid = id.longValue();
        return teacherRepository.findOne(lid);
        //return studentRepository.findOne(lid);
    }

    //method get that extracts teachers from database
    //metodo get que extrae todos los profesores
    @GetMapping(path = "/allTeachers")
    public @ResponseBody Iterable<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    //metodo get que extrae todos los coordinadores

    @GetMapping(path = "/allCoordinares")
    public @ResponseBody Iterable<Teacher> getAllCoordinations(){
        return teacherRepository.findAllByCustomQueryAndStream();
    }

    //metodo post que se encarga de crear coordinador

    @RequestMapping(path ="/newCoordinator",method = RequestMethod.POST)
    public Integer CreateCoordinator(@RequestBody Teacher coordinator){

        coordinator.setIs_admin(true);
        coordinator.setPassword("1");
        teacherRepository.save(coordinator);
        return 1;

    }



    //metodo post que se encarga de crear un nuevo profesores a base de datos
    @RequestMapping(path ="/newTeacher",method = RequestMethod.POST)
    public Integer CreateTeacher(@RequestBody Teacher teacher){

        teacher.setIs_admin(false);
        teacher.setPassword("2");
        teacherRepository.save(teacher);
        return 1;

    }


    //metodo put que permite actualizar profesor y coordinador
    //localhost:1919/teacher/1
    //PUT para actualizar al profesor 1, con el siguiente json
    //{ "email": "nuevo@usach.cl", "password": "nuevaPass" }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Teacher update(@RequestBody Teacher resource, @PathVariable("id") long id){

        //Teacher viejoUser = teacherRepository.findOne(id);
        //System.out.println();
        //System.out.println();
        //System.out.println();
        //System.out.println(resource.getName());
        //System.out.println();
        //System.out.println();
        //System.out.println();
        //viejoUser.setName(resource.getName());
        //viejoUser.setEmail(resource.getEmail());
        //viejoUser.setPassword(resource.getPassword());
        return teacherRepository.save(resource);
    }


    //metodo delete, que permite eliminar un usuario del tipo profesor y coordinador, con solo su id
    //localhost:1919/teacher/1
    //la url de arriba borra el profesor con id 1

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable("id") long id){
        teacherRepository.delete(id);
    }

}
