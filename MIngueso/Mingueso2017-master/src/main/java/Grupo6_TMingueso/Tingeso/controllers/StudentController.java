package Grupo6_TMingueso.Tingeso.controllers;


import Grupo6_TMingueso.Tingeso.models.Student;
import Grupo6_TMingueso.Tingeso.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/student")

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;



    //metodo que retorna un estudiante de acuerdo a su id

    @GetMapping(path = "/{id}")
    public @ResponseBody Student getStudent(@PathVariable("id") Integer id){
        long lid = id.longValue();
        return studentRepository.findOne(lid);
    }

    //method get that extracts students from database

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping(path = "/coordination/{id}")
    public @ResponseBody Iterable<Student> getByCoordination(@PathVariable("id") Integer id){
        long lid = id.longValue();
        return studentRepository.findStudentsByCoordination2(lid);
    }

    //method post that add student
    // url of method is localhost:1919/new , in case that port is 1919, if not change in aplication.properties

    @RequestMapping(path ="/new",method = RequestMethod.POST)
    public Integer CreateStudent(@RequestBody Student student){
        student.setPassword("1");
        //System.out.println(student.getName());
        studentRepository.save(student);
        return 1;
    }

    //metodo put que permite actualizar a un alumno o estudiante
    //localhost:1919/student/11
    //PUT para actualizar al estudiante 11, con el siguiente json
    //{ "email": "nuevo@usach.cl", "password": "nuevaPass" }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Student update(@RequestBody Student resource, @PathVariable("id") long id){
        Student viejoUser = studentRepository.findOne(id);
        //viejoUser.setName(resource.getName());
        viejoUser.setEmail(resource.getEmail());
        viejoUser.setPassword(resource.getPassword());
        return studentRepository.save(viejoUser);
    }

    //metodo delete, que permite eliminar un usuario del tipo student, con solo su id
    //localhost:1919/student/11
    //la url de arriba borra el student con id 11

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable("id") long id){
        studentRepository.delete(id);
    }


    //metodo get que extrae las estadisticas de un alumno de acuerdo a su correo
    @GetMapping(path = "/get/{mail:.+}")
    public @ResponseBody Iterable<Student> getStatisticForMail(@PathVariable("mail") String mail){
        return studentRepository.findStudentByEmail(mail);

    }
}
