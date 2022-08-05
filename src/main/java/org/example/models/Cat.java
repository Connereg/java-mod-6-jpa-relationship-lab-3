package org.example.models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Table(name = "CATS_TABLE")
@Entity
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    private String name;
    private int age;
    private String breed;

    @ManyToMany(mappedBy = "catsList")
    private List<Owner> ownersList = new ArrayList<>();

    public void addOwner(Owner owner) {
        ownersList.add(owner);
    }
}
