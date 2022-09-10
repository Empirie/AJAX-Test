package ch.fhnw.acrm.orders;

import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.products.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository
        extends JpaRepository<Orders,Long> {

        public List<Orders> findByAgent(Agent agent);
        public Orders findByAgentAndProducts(Agent agent, Products products);

}
