package ch.fhnw.acrm.deliverydata;

import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.controller.UserController;
import ch.fhnw.acrm.data.domain.Agent;

import javax.persistence.*;


@Entity
@Table
public class DeliveryData {




    @Id
    @SequenceGenerator(
            name = "delivery_sequence",
            sequenceName = "delivery_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "delivery_sequence"
    )
    private Long id;
    private Long userid;
    private String streetname;
    private int streetnumber;
    private int pobox;
    private String cityname;

//    Constructors


    public DeliveryData() {
    }

    public DeliveryData(Long id, Long userid, String streetname, int streetnumber, int pobox, String cityname) {
        this.id = id;
        this.userid = userid;
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.pobox = pobox;
        this.cityname = cityname;
    }

    public DeliveryData(Long userid, String streetname, int streetnumber, int pobox, String cityname) {
        this.userid = userid;
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.pobox = pobox;
        this.cityname = cityname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        agentService = id;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public int getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(int streetnumber) {
        this.streetnumber = streetnumber;
    }

    public int getPobox() {
        return pobox;
    }

    public void setPobox(int pobox) {
        this.pobox = pobox;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    @Override
    public String toString() {
        return "DeliveryData{" +
                "id=" + id +
                ", streetname='" + streetname + '\'' +
                ", streetnumber=" + streetnumber +
                ", pobox=" + pobox +
                ", cityname='" + cityname + '\'' +
                '}';
    }
}
