package Grupo6_TMingueso.Tingeso.repository;

import Grupo6_TMingueso.Tingeso.models.Coordination;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.Set;

import javax.transaction.Transactional;

@Transactional
public interface CoordinationRepository extends CrudRepository<Coordination,Long> {
    @Query("select u from Coordination u")
    Set<Coordination> findDefoultCoordintionSet();
}
