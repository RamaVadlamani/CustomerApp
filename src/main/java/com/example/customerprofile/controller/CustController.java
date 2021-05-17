package com.example.customerprofile.controller;


import com.example.customerprofile.dao.CustomerRepository;
import com.example.customerprofile.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
public class CustController {

    @Autowired
    private CustomerRepository custRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String errorPage() {
        return "Welcome to Sample CustomerApp on Openshift cluster";
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Iterable<Customer> getAllUsers() {
        System.out.println("Inside path get customers");
        return custRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody String addNewUser (@RequestParam String name) {
        System.out.println("Inside path add");

        Customer cst = new Customer();
        cst.setName(name);
        custRepository.save(cst);
        return "Saved Customer: " + name + " into table customer" ;
    }



}
