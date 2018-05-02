package Grupo6_TMingueso.Tingeso.controllers;


import Grupo6_TMingueso.Tingeso.models.Coordination;
import Grupo6_TMingueso.Tingeso.models.Student;
import Grupo6_TMingueso.Tingeso.models.TyC;
import Grupo6_TMingueso.Tingeso.repository.CoordinationRepository;
import Grupo6_TMingueso.Tingeso.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/coordination")

public class CoordinationController {

    @Autowired
    private CoordinationRepository coordinationRepository;
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Set<Coordination> getAllExercise(){
        return coordinationRepository.findDefoultCoordintionSet();
    }

    @GetMapping(path = "/{mail:.+}")
    public @ResponseBody List<TyC> getSingleCoordination(@PathVariable("mail") String mail){
        Set<Coordination> c = coordinationRepository.findDefoultCoordintionSet();
        List<TyC> tyc= new ArrayList<TyC>();
        for (Coordination i:c) {
            String teacherMail = i.getTeacher().getEmail();
            if(i.getTeacher().getEmail().equals(mail)){
                TyC n1 = new TyC();
                n1.setCoordinationName(i.getName_coordination());


                List<Object[]> list = studentRepository.findStudentByCoordination(i.getId_coordination());
                List<Student> students = new ArrayList<>();
                for (Object[] o:list) {
                    Student s = new Student();
                    s.setStudent_id(((BigInteger)o[0]).intValue());
                    s.setEmail((String)o[1]);
                    s.setLastName((String)o[2]);
                    s.setName((String)o[3]);
                    s.setPassword((String)o[4]);
                    s.setRut((String)o[5]);
                    s.setTotal_spend_time((Integer)o[6]);
                    s.setTotal_wordings((Integer)o[7]);
                    s.setCoordination(null);
                    s.setStatistic(null);

                    students.add(s);
                }

                n1.setStudents(students);
                tyc.add(n1);
            }
        }
        return tyc;
    }

}
