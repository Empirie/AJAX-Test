package ch.fhnw.acrm.Cart;


import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.orders.Orders;
import ch.fhnw.acrm.orders.OrdersRepository;
import org.junit.Test;
import org.springframework.stereotype.Service;

import java.util.List;


//https://github.com/syqu22/spring-boot-shop-sample/blob/master/src/main/java/com/syqu/shop/service/ShoppingCartService.java

@Service
public class CartService {

    private OrdersRepository ordersRepository;
    private AgentService agentService;
    private CartRepository cartRepository;

    public CartService(OrdersRepository ordersRepository, AgentService agentService, CartRepository cartRepository) {
        this.ordersRepository = ordersRepository;
        this.agentService = agentService;
        this.cartRepository = cartRepository;
    }


    @Test
    public void getCartItemsByAgent(){
        Agent agent = new Agent();
        agent.setId(agentService.getCurrentAgent().getId());
        List<Orders> orders = cartRepository.findByAgent(agent);
    }











}
