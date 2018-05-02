package Grupo6_TMingueso.Tingeso.repository.repo;

import Grupo6_TMingueso.Tingeso.models.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by mario on 25-10-17.
 */
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    public Student findByName(String name);

}
