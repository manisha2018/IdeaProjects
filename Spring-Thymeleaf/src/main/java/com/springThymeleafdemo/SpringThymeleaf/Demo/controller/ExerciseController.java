package com.springThymeleafdemo.SpringThymeleaf.Demo.controller;

import com.springThymeleafdemo.SpringThymeleaf.Demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExerciseController {

    @Autowired
    private Employee employee;

    @GetMapping("/question1")
    public String alertThrowing() {
        return "exercise";
    }

    @GetMapping("/employeeregister")
    public String employeeRegister(Employee employee) {
        return "register";
    }

    /*@GetMapping("/employeesubmit")
    @ResponseBody
    public String getEmployeedetails(@ModelAttribute("register") Employee employee) {
        return "redirect:/employee";
    }*/

    @GetMapping("/employeedetail")
    public String getEmployeeDetails(Model model) {
        model.addAttribute("employee", employee);
        return "employeedetail/list";
    }

}
