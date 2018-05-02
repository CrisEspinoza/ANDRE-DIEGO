package Grupo6_TMingueso.Tingeso.repository;

import Grupo6_TMingueso.Tingeso.models.Statistic;
import Grupo6_TMingueso.Tingeso.models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface StudentRepository extends CrudRepository<Student,Long> {
    @Query("select u from Student u where u.email=?1")
    Iterable<Student> findStudentByEmail(String mail);

    @Query(value = "SELECT * FROM grupo6.student WHERE id_coordination = ?1", nativeQuery = true)
    List<Object[]> findStudentByCoordination(long id);

    @Query("select u from Student u where u.coordination.id_coordination=?1")
    Iterable<Student> findStudentsByCoordination2(long id);



}
