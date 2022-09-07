package ch.fhnw.acrm.orders;

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
    private Long product_id;
    private Long customer_id;
    private int product_quantity;

    //Constructors


    public Orders() {
    }

    public Orders(Long id, Long product_id, Long customer_id, int product_quantity) {
        this.id = id;
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.product_quantity = product_quantity;
    }

    public Orders(Long product_id, Long customer_id, int product_quantity) {
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.product_quantity = product_quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", customer_id=" + customer_id +
                ", product_quantity=" + product_quantity +
                '}';
    }
}


