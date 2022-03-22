package com.example.demo.bateponto.model;

import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Date;

public class StitchSheet {


    private ArrayList<Date> date = new ArrayList<>();

    @ManyToOne
    private Employee employee;

    public StitchSheet(Employee employee){
        this.employee = employee;
    }
}
