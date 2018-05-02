package Grupo6_TMingueso.Tingeso.controllers;

import Grupo6_TMingueso.Tingeso.models.Administrator;
import Grupo6_TMingueso.Tingeso.models.Student;
import Grupo6_TMingueso.Tingeso.models.User;
import Grupo6_TMingueso.Tingeso.repository.AdministratorRepository;
import Grupo6_TMingueso.Tingeso.repository.StudentRepository;
import Grupo6_TMingueso.Tingeso.repository.TeacherRepository;
import com.google.common.collect.Iterables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mario on 13-11-17.
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AdministratorRepository administratorRepository;

    @GetMapping(path = "/{mail:.+}")
    public @ResponseBody
    User getRole(@PathVariable("mail") String mail){
        System.out.println(mail);
        User u = new User();
        if(Iterables.size(administratorRepository.findAdministratorByEmail(mail))>0){
            u.setRole("administrator");
            return u;
        }
        else if(Iterables.size(teacherRepository.findCoordinatorByEmail(mail))>0){
            u.setRole("coordinator");
            return u;
        }
        else if(Iterables.size(teacherRepository.findTeacherByEmail(mail))>0){
            u.setRole("teacher");
            return u;
        }
        else if(Iterables.size(studentRepository.findStudentByEmail(mail))>0){
            u.setRole("student");
            return u;
        }
        u.setRole("norole");
        return u;
    }

}
