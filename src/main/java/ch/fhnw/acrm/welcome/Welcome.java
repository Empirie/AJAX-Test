package ch.fhnw.acrm.welcome;

public class Welcome {

    String fun;
    String fun2;


    public Welcome(String fun, String fun2) {
        this.fun = fun;
        this.fun2 = fun2;
    }

    public String getFun() {
        return fun;
    }

    public void setFun(String fun) {
        this.fun = fun;
    }

    @Override
    public String toString() {
        return "Welcome{" +
                "fun='" + fun + '\'' +
                ", fun2='" + fun2 + '\'' +
                '}';
    }
}
