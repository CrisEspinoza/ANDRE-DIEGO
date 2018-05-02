package Grupo6_TMingueso.Tingeso.repository;

import Grupo6_TMingueso.Tingeso.models.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface TeacherRepository extends CrudRepository<Teacher,Long>{
    @Query("select u from Teacher u where u.is_admin=true")
    Iterable<Teacher> findAllByCustomQueryAndStream();

    @Query("select u from Teacher u where u.email=?1 and u.is_admin=true")
    Iterable<Teacher> findCoordinatorByEmail(String email);

    @Query("select u from Teacher u where u.email=?1 and u.is_admin=false")
    Iterable<Teacher> findTeacherByEmail(String email);

    //@Query("select u from Teacher u where 1=1")
    //Iterable<Teacher> findAllTeachers();
}
