package com.example.demo.bateponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends People{
    @Id
    @NonNull
    private Long id;
    private ArrayList<StitchSheet> stitchSheet = new ArrayList<StitchSheet>();

    private int time_course;

    public void hitPoint(LocalDate now){

    }


}
