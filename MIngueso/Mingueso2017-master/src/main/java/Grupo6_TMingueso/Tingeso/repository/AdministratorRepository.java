package Grupo6_TMingueso.Tingeso.repository;

import Grupo6_TMingueso.Tingeso.models.Administrator;
import Grupo6_TMingueso.Tingeso.models.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by mario on 14-11-17.
 */
@Transactional
public interface AdministratorRepository extends CrudRepository<Administrator,Long> {
    @Query("select u from Administrator u where u.email=?1")
    Iterable<Administrator> findAdministratorByEmail(String mail);
}
