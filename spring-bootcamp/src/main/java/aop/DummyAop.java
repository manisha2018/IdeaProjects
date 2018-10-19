package aop;

public class DummyAop {
    private Integer number;

    public Integer getNumber() {
        System.out.println("This is dummy aop class");
        return 6;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    void display(){
        System.out.println("This is AOP");
    }
}
