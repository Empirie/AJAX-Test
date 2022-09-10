package ch.fhnw.acrm.orders;

import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.data.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class OrdersService {

    //inject repository in service
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository){
        this.ordersRepository = ordersRepository;
    }












    @Autowired
    private AgentService agentService;

















    public List<Orders> getOrders(){
        return ordersRepository.findAll();
    }

    public void addNewOrder(Orders orders){
        ordersRepository.save(orders);
    }


//
//    public List<Orders> findAllOrders() {
//        return ordersRepository.findByAgentId(agentService.getCurrentAgent().getId());
//    }
}
