package ch.fhnw.acrm.Cart;

import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.orders.Orders;
import ch.fhnw.acrm.orders.OrdersRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Orders, Long> {

public List<Orders> findByAgent(Agent agent);

}
