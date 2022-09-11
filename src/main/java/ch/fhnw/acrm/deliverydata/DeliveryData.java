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

    private String streetname;
    private int streetnumber;
    private int pobox;
    private String cityname;



    @OneToOne
    @JoinColumn
    private Agent agent;

//    Constructors


    public DeliveryData() {
    }

    public DeliveryData(Long id, String streetname, int streetnumber, int pobox, String cityname) {
        this.id = id;
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.pobox = pobox;
        this.cityname = cityname;

    }

    public DeliveryData(String streetname, int streetnumber, int pobox, String cityname) {
        this.streetname = streetname;
        this.streetnumber = streetnumber;
        this.pobox = pobox;
        this.cityname = cityname;
    }


    public Long getId() {
        return id;
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

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }



    @Override
    public String toString() {
        return streetname+streetnumber+","+pobox+cityname;
//        return "DeliveryData{" +
//                "id=" + id +
//                ", streetname='" + streetname + '\'' +
//                ", streetnumber=" + streetnumber +
//                ", pobox=" + pobox +
//                ", cityname='" + cityname + '\'' +
//                ", agent=" + agent +
//                '}';
    }




}
