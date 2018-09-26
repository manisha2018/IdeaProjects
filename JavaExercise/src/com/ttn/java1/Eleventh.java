/*Create 3 sub class of bank SBI,BOI,ICICI all 4 should
 have method called getDetails which provide there specific details like
  rateofinterest etc,print details of every banks
  */
package com.ttn.java1;

abstract class Bank {
    abstract double prinicpalValue();

    abstract float rateValue();

    abstract int timeValue();

    abstract String getDetails();

    abstract double simpleInterstCalculation();

}

class SBI extends Bank {

    @Override
    double prinicpalValue() {
        double principle = 12200;
        return principle;
    }

    @Override
    float rateValue() {
        float rate = 3.02f;
        return rate;
    }

    @Override
    int timeValue() {
        int time = 3;
        return time;
    }

    @Override
    String getDetails() {

        String sbiDetails = "Principle Amount :" + prinicpalValue() + "-" + "Rate Given :"
                + rateValue() + "-" + "Time in years:" + timeValue();
        return sbiDetails;
    }

    @Override
    double simpleInterstCalculation() {

        double simpleInterest = (prinicpalValue() * rateValue() * timeValue()) / 100;

        return simpleInterest;
    }
}

class BOI extends Bank {

    @Override
    double prinicpalValue() {

        double principle = 16000;
        return principle;
    }

    @Override
    float rateValue() {

        float rate = 10.02f;
        return rate;
    }

    @Override
    int timeValue() {

        int time = 9;
        return time;
    }

    @Override
    String getDetails() {

        String sbiDetails = "Principle Amount :" + prinicpalValue() + "-" + "Rate Given :" + rateValue() + "-" + "Time in years:" + timeValue();
        return sbiDetails;
    }

    @Override
    double simpleInterstCalculation() {

        double simpleInterest = (prinicpalValue() * rateValue() * timeValue()) / 100;

        return simpleInterest;
    }

}

class ICICI extends Bank {

    @Override
    double prinicpalValue() {

        double principle = 1000;
        return principle;
    }

    @Override
    float rateValue() {

        float rate = 6.02f;
        return rate;
    }

    @Override
    int timeValue() {

        int time = 6;
        return time;
    }

    @Override
    String getDetails() {

        String sbiDetails = "Principle Amount :" + prinicpalValue() + "-" + "Rate Given :" + rateValue() + "-" + "Time in years:" + timeValue();
        return sbiDetails;
    }

    @Override
    double simpleInterstCalculation() {

        double simpleInterest = (prinicpalValue() * rateValue() * timeValue()) / 100;

        return simpleInterest;
    }

}

public class Eleventh {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        System.out.println("-----SBI Bank Details-----");
        System.out.println("Details are:" + sbi.getDetails());
        System.out.println("Rate of Interest :" + sbi.simpleInterstCalculation());

        BOI boi = new BOI();
        System.out.println("-----BOI Bank Details-----");
        System.out.println("Details are:" + boi.getDetails());
        System.out.println("Rate of Interest :" + boi.simpleInterstCalculation());

        ICICI icici = new ICICI();
        System.out.println("-----ICICI Bank Details-----");
        System.out.println("Details are:" + icici.getDetails());
        System.out.println("Rate of Interest :" + icici.simpleInterstCalculation());

    }
}
