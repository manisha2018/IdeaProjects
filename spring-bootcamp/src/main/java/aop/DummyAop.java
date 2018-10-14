package aop;

public class DummyAop {
    private Integer number;

    public Integer getNumber() {
        return 6;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    void display(){
        System.out.println("This is AOP");
    }
}
