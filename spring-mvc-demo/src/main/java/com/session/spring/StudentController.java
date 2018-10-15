package com.session.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
//@RequestMapping("/student")
public class StudentController {


    /*TODO:
    Use @ModelAttribute annotation to add Heading "Spring MVC Demo" in every model.
    * */
    @ModelAttribute
    void addingObject(Model model) {
        model.addAttribute("heading", "Spring MVC Demo");
    }

    /*TODO:
    Use annotation in StudentController to define a
    default action index which renders a jsp page.
    */
    @RequestMapping(value = "/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/dummy")
    public ModelAndView dummy(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "Message from backend.");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/response")
    public void anotherHello(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html");
        response.getWriter().println("<b>HELLO From Another World</b>");
    }

    /*TODO:
    Create one more annotation based action hello inside the StudentController
    which and use @ResponseBody annotation from it to display Hello world.
    */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    /*TODO:
     Create one more action which sends Model HelloWorld to the jsp file.*/
    @RequestMapping("/helloWorld")
    public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "Hello World.");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /*TODO:
     * Use @PathVariable annotation to access firstname and lastname in
     * an action inside StudentController place both the parameters in different arguments
     * and access them.
     */
    @ResponseBody
    @RequestMapping("/dname/{firstName}/{lastName}")
    public String dname(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        return firstName + lastName;
    }

    /*TODO:
     * Now place both the arguments inside a Map and access the Map instead.*/
    @RequestMapping("/name/{firstName}/{lastName}")
    @ResponseBody
    public String returnName(@PathVariable Map<String, String> requestMap) {
        return requestMap.get("firstName") + " " + requestMap.get("lastName");
    }

    /*TODO:
    Use @RequestParam annotation to access the firstname and lastname
    in formData action of StudentController.
    */
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView form() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("form");
        return modelAndView;
    }

    @RequestMapping(value = "/submit")
    @ResponseBody
    public String submit(@RequestParam("firstName") String firstname,
                         @RequestParam("lastName") String lastName) {
        return "FirstName" + firstname + "LastName" + lastName;
    }

    /*TODO:
    Create a StudentCO and bind firstname and lastname with instance
    variable of StudentCO.*/
    @RequestMapping(value = "/submitform",method = RequestMethod.POST)
    @ResponseBody
    public String  submit(StudentCO studentCO) {

//        StudentCO studentCO1 = new StudentCO();

        return "FirstName:" + studentCO.getFirstName() + " " +
                "LastName:" + studentCO.getLastName();

    }
}