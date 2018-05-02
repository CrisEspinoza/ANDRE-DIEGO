package Grupo6_TMingueso.Tingeso.repository;

import Grupo6_TMingueso.Tingeso.models.Exercise;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ExerciseRepository extends CrudRepository<Exercise,Long> {
}
