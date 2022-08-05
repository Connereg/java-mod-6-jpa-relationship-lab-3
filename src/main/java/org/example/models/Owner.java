package org.example.models;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Table(name = "OWNERS_TABLE")
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    private String name;

    @ManyToMany
    private List<Cat> catsList = new ArrayList<>();

    public void addCat(Cat cat) {
        catsList.add(cat);
    }

}
