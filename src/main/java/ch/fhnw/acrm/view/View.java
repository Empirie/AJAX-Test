package ch.fhnw.acrm.view;


import ch.fhnw.acrm.orders.OrdersRepository;
import ch.fhnw.acrm.products.Products;
import ch.fhnw.acrm.products.ProductsRepository;

public class View {






    private Long viewid;
    private Long viewproduct_id;
    private Long viewcustomer_id;
    private int viewproduct_quantity;


    public View() {
    }

    public View(Long viewid, Long viewproduct_id, Long viewcustomer_id, int viewproduct_quantity) {
        this.viewid = viewid;
        this.viewproduct_id = viewproduct_id;
        this.viewcustomer_id = viewcustomer_id;
        this.viewproduct_quantity = viewproduct_quantity;
    }

    @Override
    public String toString() {
        return "View{" +
                "viewid=" + viewid +
                ", viewproduct_id=" + viewproduct_id +
                ", viewcustomer_id=" + viewcustomer_id +
                ", viewproduct_quantity=" + viewproduct_quantity +
                '}';
    }


}
