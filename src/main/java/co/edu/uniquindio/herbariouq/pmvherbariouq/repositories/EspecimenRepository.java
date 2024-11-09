package co.edu.uniquindio.herbariouq.pmvherbariouq.repositories;

import co.edu.uniquindio.herbariouq.pmvherbariouq.entities.Especimen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecimenRepository extends JpaRepository<Especimen, Long> {
}
