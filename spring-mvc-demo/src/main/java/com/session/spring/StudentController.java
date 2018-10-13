/*TODO:Now remove AbstractController and use MultiActionController
for StudentController which contains 2 actions one action renders a
jsp view and another action uses HttpServletResponse to show the output on the Web browser.*/

package com.session.spring;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Controller
//@RequestMapping("/student/*")
public class StudentController extends MultiActionController {

    //@RequestMapping("/hello")
    public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hello", "Message from backend.");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    //@RequestMapping("/response")
    public void anotherHello(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html");
        response.getWriter().println("<b>HELLO From Another World</b>");
    }

}