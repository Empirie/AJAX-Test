package ch.fhnw.acrm.transportcosts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportCostsRepository extends JpaRepository<TransportCosts, Long> {
}
