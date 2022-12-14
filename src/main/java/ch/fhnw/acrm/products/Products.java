package ch.fhnw.acrm.products;

import javax.persistence.*;

@Entity
@Table
public class Products {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )


    private Long id;
    private String name;
    private double price;
    private double palletSize;

    //Constructors

    //No args constructor
    public Products() {
    }

    //All
    public Products(Long id,
                    String name,
                    double price,
                    double palletSize) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.palletSize = palletSize;
    }
    //No id constructor
    public Products(String name,
                    double price,
                    double palletSize) {
        this.name = name;
        this.price = price;
        this.palletSize = palletSize;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPalletSize() {
        return palletSize;
    }

    public void setPalletSize(double palletSize) {
        this.palletSize = palletSize;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", palletSize=" + palletSize +
                '}';
    }
}
