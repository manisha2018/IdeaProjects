/*Implement Composite Design Pattern to maintaing the directories of
employees on the basis of departments.

 * */
package com.bootcamp.designPattern;

import java.util.ArrayList;
import java.util.List;

//TODO:Why created two toStrings?

//Component
interface EmployeeDirectory {
    void showEmployeeDetails();
}

//Leaf
class Developer implements EmployeeDirectory {
    private String name;
    private String favoriteLanguage;

    public Developer(String name, String favoriteLanguage) {
        this.name = name;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public void showEmployeeDetails() {
//        System.out.println("Developer { " +
//                "name = '" + name + '\'' +
//                ", favoriteLanguage = '" + favoriteLanguage + '\'' +
//                '}');
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Developer { " +
                "name = '" + name + '\'' +
                ", favoriteLanguage = '" + favoriteLanguage + '\'' +
                '}';
    }
}

//leaf
class Tester implements EmployeeDirectory {

    private String name;
    private String type;

    public Tester(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Tester { " +
                "name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Tester { " +
                "name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                '}';
    }
}

//Composite
class DeveloperEmployee implements EmployeeDirectory {

    List<EmployeeDirectory> developerEmployee = new ArrayList<EmployeeDirectory>();

    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer Directory");
        developerEmployee.forEach(e -> e.showEmployeeDetails());
    }
}

//Composite
class TesterEmployee implements EmployeeDirectory {

    List<EmployeeDirectory> managerEmployee = new ArrayList<EmployeeDirectory>();

    @Override
    public void showEmployeeDetails() {
        System.out.println("Tester Directory");
        managerEmployee.forEach(e -> e.showEmployeeDetails());
    }
}

//Composite

class CompanyEmployee implements EmployeeDirectory {

    List<EmployeeDirectory> companyEmployee = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        companyEmployee.forEach(e -> e.showEmployeeDetails());
    }
}


public class Composite {

    public static void main(String[] args) {

        Developer developer1 = new Developer("Manisha", "Java");
        Developer developer2 = new Developer("Amenda", "C#");

        Tester tester1 = new Tester("Kiran", "Executive");
        Tester tester2 = new Tester("Shakti", "Senior");

        DeveloperEmployee developerEmployee = new DeveloperEmployee();
        developerEmployee.developerEmployee.add(developer1);
        developerEmployee.developerEmployee.add(developer2);

        TesterEmployee managerEmployee = new TesterEmployee();
        managerEmployee.managerEmployee.add(tester1);
        managerEmployee.managerEmployee.add(tester2);

        CompanyEmployee companyEmployee = new CompanyEmployee();
        companyEmployee.companyEmployee.add(developerEmployee);
        companyEmployee.companyEmployee.add(managerEmployee);

        companyEmployee.showEmployeeDetails();
    }

}

