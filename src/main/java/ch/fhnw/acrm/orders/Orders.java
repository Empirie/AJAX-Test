package ch.fhnw.acrm.orders;

import ch.fhnw.acrm.data.domain.Agent;
import ch.fhnw.acrm.products.Products;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity
@Table
public class Orders {


    @Id
    @SequenceGenerator(
            name = "orders_sequence",
            sequenceName = "orders_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orders_sequence"
    )
    private Long id;

    public int getProduct_quantity() {
        return product_quantity;
    }

    private int product_quantity;



    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;







    //Constructors


    public Orders() {
    }

    public Orders(Long id, int product_quantity) {
        this.id = id;
        this.product_quantity = product_quantity;
    }

    public Orders(int product_quantity) {
        this.product_quantity = product_quantity;
    }


    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }






    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", product=" + products +
                ", product_quantity=" + product_quantity +
                ", agent=" + agent +
                '}';
    }
}


