package Grupo6_TMingueso.Tingeso.controllers;


import Grupo6_TMingueso.Tingeso.models.Exercise;
import Grupo6_TMingueso.Tingeso.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/exercise")

public class ExerciseController {

    @Autowired
    private ExerciseRepository exerciseRepository;

    //method post that add exercise
    // url of method is localhost:1919/new , in case that port is 1919, if not change in aplication.properties
    @RequestMapping(path ="/new",method = RequestMethod.POST)
    public Integer CreateExercise(@RequestBody Exercise exercise){
        //exercise.setAnswer("hay que cambiar esto.");
        exerciseRepository.save(exercise);
        return 1;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Exercise> getAllExercise(){
        return exerciseRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Exercise getExerciseById(@PathVariable("id") Integer id){
        long lid = id.longValue();
        return exerciseRepository.findOne(lid);
    }
}