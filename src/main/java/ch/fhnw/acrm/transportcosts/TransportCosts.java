package ch.fhnw.acrm.transportcosts;

import javax.persistence.*;

@Entity
@Table(name = "transport")
public class TransportCosts {


    //id corresponds to converted distance calulation for ease of use

    @Id
    @SequenceGenerator(
            name = "cost_sequence",
            sequenceName = "cost_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cost_sequence"
    )
    private Long idDistanceIn30kmRounded;
    private double palletPrice1;
    private double palletPrice2;
    private double palletPrice3;
    private double palletPrice4;
    private double palletPrice5;
    private double palletPrice6;
    private double palletPrice7;
    private double palletPrice8;
    private double palletPrice9;
    private double palletPrice10;
    private double palletPrice11;
    private double palletPrice12;

    public TransportCosts() {

    }
//
//    public TransportCosts(double palletPrice1, double palletPrice2, double palletPrice3, double palletPrice4, double palletPrice5, double palletPrice6, double palletPrice7, double palletPrice8, double palletPrice9, double palletPrice10, double palletPrice11, double palletPrice12) {
//        this.palletPrice1 = palletPrice1;
//        this.palletPrice2 = palletPrice2;
//        this.palletPrice3 = palletPrice3;
//        this.palletPrice4 = palletPrice4;
//        this.palletPrice5 = palletPrice5;
//        this.palletPrice6 = palletPrice6;
//        this.palletPrice7 = palletPrice7;
//        this.palletPrice8 = palletPrice8;
//        this.palletPrice9 = palletPrice9;
//        this.palletPrice10 = palletPrice10;
//        this.palletPrice11 = palletPrice11;
//        this.palletPrice12 = palletPrice12;
//    }

    public TransportCosts(Long idDistanceIn30kmRounded, double palletPrice1, double palletPrice2, double palletPrice3, double palletPrice4, double palletPrice5, double palletPrice6, double palletPrice7, double palletPrice8, double palletPrice9, double palletPrice10, double palletPrice11, double palletPrice12) {
        this.idDistanceIn30kmRounded = idDistanceIn30kmRounded;
        this.palletPrice1 = palletPrice1;
        this.palletPrice2 = palletPrice2;
        this.palletPrice3 = palletPrice3;
        this.palletPrice4 = palletPrice4;
        this.palletPrice5 = palletPrice5;
        this.palletPrice6 = palletPrice6;
        this.palletPrice7 = palletPrice7;
        this.palletPrice8 = palletPrice8;
        this.palletPrice9 = palletPrice9;
        this.palletPrice10 = palletPrice10;
        this.palletPrice11 = palletPrice11;
        this.palletPrice12 = palletPrice12;
    }


    public Long getIdDistanceIn30kmRounded() {
        return idDistanceIn30kmRounded;
    }

    public void setIdDistanceIn30kmRounded(Long idDistanceIn30kmRounded) {
        this.idDistanceIn30kmRounded = idDistanceIn30kmRounded;
    }

    public double getPalletPrice1() {
        return palletPrice1;
    }

    public void setPalletPrice1(double palletPrice1) {
        this.palletPrice1 = palletPrice1;
    }

    public double getPalletPrice2() {
        return palletPrice2;
    }

    public void setPalletPrice2(double palletPrice2) {
        this.palletPrice2 = palletPrice2;
    }

    public double getPalletPrice3() {
        return palletPrice3;
    }

    public void setPalletPrice3(double palletPrice3) {
        this.palletPrice3 = palletPrice3;
    }

    public double getPalletPrice4() {
        return palletPrice4;
    }

    public void setPalletPrice4(double palletPrice4) {
        this.palletPrice4 = palletPrice4;
    }

    public double getPalletPrice5() {
        return palletPrice5;
    }

    public void setPalletPrice5(double palletPrice5) {
        this.palletPrice5 = palletPrice5;
    }

    public double getPalletPrice6() {
        return palletPrice6;
    }

    public void setPalletPrice6(double palletPrice6) {
        this.palletPrice6 = palletPrice6;
    }

    public double getPalletPrice7() {
        return palletPrice7;
    }

    public void setPalletPrice7(double palletPrice7) {
        this.palletPrice7 = palletPrice7;
    }

    public double getPalletPrice8() {
        return palletPrice8;
    }

    public void setPalletPrice8(double palletPrice8) {
        this.palletPrice8 = palletPrice8;
    }

    public double getPalletPrice9() {
        return palletPrice9;
    }

    public void setPalletPrice9(double palletPrice9) {
        this.palletPrice9 = palletPrice9;
    }

    public double getPalletPrice10() {
        return palletPrice10;
    }

    public void setPalletPrice10(double palletPrice10) {
        this.palletPrice10 = palletPrice10;
    }

    public double getPalletPrice11() {
        return palletPrice11;
    }

    public void setPalletPrice11(double palletPrice11) {
        this.palletPrice11 = palletPrice11;
    }

    public double getPalletPrice12() {
        return palletPrice12;
    }

    public void setPalletPrice12(double palletPrice12) {
        this.palletPrice12 = palletPrice12;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransportCosts)) return false;

        TransportCosts that = (TransportCosts) o;

        if (Double.compare(that.getPalletPrice1(), getPalletPrice1()) != 0) return false;
        if (Double.compare(that.getPalletPrice2(), getPalletPrice2()) != 0) return false;
        if (Double.compare(that.getPalletPrice3(), getPalletPrice3()) != 0) return false;
        if (Double.compare(that.getPalletPrice4(), getPalletPrice4()) != 0) return false;
        if (Double.compare(that.getPalletPrice5(), getPalletPrice5()) != 0) return false;
        if (Double.compare(that.getPalletPrice6(), getPalletPrice6()) != 0) return false;
        if (Double.compare(that.getPalletPrice7(), getPalletPrice7()) != 0) return false;
        if (Double.compare(that.getPalletPrice8(), getPalletPrice8()) != 0) return false;
        if (Double.compare(that.getPalletPrice9(), getPalletPrice9()) != 0) return false;
        if (Double.compare(that.getPalletPrice10(), getPalletPrice10()) != 0) return false;
        if (Double.compare(that.getPalletPrice11(), getPalletPrice11()) != 0) return false;
        if (Double.compare(that.getPalletPrice12(), getPalletPrice12()) != 0) return false;
        return getIdDistanceIn30kmRounded().equals(that.getIdDistanceIn30kmRounded());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getIdDistanceIn30kmRounded().hashCode();
        temp = Double.doubleToLongBits(getPalletPrice1());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice2());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice3());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice4());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice5());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice6());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice7());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice8());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice9());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice10());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice11());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPalletPrice12());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "TransportCosts{" +
                "idDistanceIn30kmRounded=" + idDistanceIn30kmRounded +
                ", palletPrice1=" + palletPrice1 +
                ", palletPrice2=" + palletPrice2 +
                ", palletPrice3=" + palletPrice3 +
                ", palletPrice4=" + palletPrice4 +
                ", palletPrice5=" + palletPrice5 +
                ", palletPrice6=" + palletPrice6 +
                ", palletPrice7=" + palletPrice7 +
                ", palletPrice8=" + palletPrice8 +
                ", palletPrice9=" + palletPrice9 +
                ", palletPrice10=" + palletPrice10 +
                ", palletPrice11=" + palletPrice11 +
                ", palletPrice12=" + palletPrice12 +
                '}';
    }












//    TransportCosts transportCosts1 = new TransportCosts(1L, 58.65, 87.00,
//            114.50,
//            137.10,
//            160.80,
//            181.65,
//            201.45,
//            220.30,
//            238.35,
//            255.35,
//            271.45,
//            286.55);
//
//    TransportCosts transportCosts2 = new TransportCosts(2L,
//            67.00, 99.40, 130.85, 156.75, 183.80, 207.55, 230.25, 251.85, 272.40, 291.90, 310.25, 327.50);
//    TransportCosts transportCosts3 = new TransportCosts(
//            3L,
//            75.40,
//            111.90,
//            147.15,
//            176.35,
//            206.65,
//           233.50,
//           259.00,
//            283.35,
//            306.45,
//           328.40,
//           348.95,
//           368.40);
//
//
//    TransportCosts transportCosts4 = new TransportCosts(4L, 83.75, 124.30, 163.50, 195.90, 229.70, 259.45, 287.70, 314.85, 340.50, 364.75, 387.80, 409.40);
}

