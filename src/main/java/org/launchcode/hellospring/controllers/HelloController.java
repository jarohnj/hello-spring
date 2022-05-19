package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping(value="hello")
public class HelloController {

    //Responds to /hello?name=LaunchCode
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    //Responds to /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("Lucille");
        names.add("Sherrell");
        names.add("Sharon");
        model.addAttribute("names", names);
        return "hello-list";
    }
    //Handles request at path /hello
//    @GetMapping("hello")
//    //this is the type of request this method will accept.
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    //lives in /hello/goodbye
    //@GetMapping("goodbye")
    //this is the type of request this method will accept.
    //public String goodbye() {
    //    return "Goodbye, Spring!";
   // }

    // Handles request of the form /hello?name=LaunchCode
    //lives in /hello/hello
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

    // handler that handles requests of the form /hello/LaunchCode (the variable is now a part of the path and not the query selector)

    //@GetMapping("{name}")
    //public String helloWithPathParam(@PathVariable String name) {
       // return "Hello, " + name + "!";
    //}

    //lives at /hello/form
//    @GetMapping("form")
//    public String helloForm() {
//        return "<html>" +
//                "<body>" +
//                "<form method='post'>" +
//                "<input type='text' name='name'>" + "<select name='languages'>" +
//            "<option value='english'>English</option>" +
//            "<option value='spanish'>Spanish</option>" +
//            "<option value='french'>French</option>" +
//                "<option value='portuguese'>Portuguese</option>" +
//                "<option value='german'>German</option>" +
//                "</select>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }
//
//    @PostMapping("form")
//    public static String createMessage(@RequestParam String name, @RequestParam String languages) {
//        if (languages.equals("english")) {
//            return "Hello, " + name + "! Nice to meet you.";
//        } else if (languages.equals("spanish")) {
//            return "Hola, " + name + "! Encantado de conocerte.";
//        } else if (languages.equals("french")) {
//            return "Bonjour, " + name + "! Ravi de vous rencontrer.";
//        } else if (languages.equals("portuguese")) {
//            return "olá, " + name + "! Prazer em conhecê-la.";
//        } else {
//            return "hallo " + name + "! Freut mich, Sie kennenzulernen.";
//        }
//    }
}
