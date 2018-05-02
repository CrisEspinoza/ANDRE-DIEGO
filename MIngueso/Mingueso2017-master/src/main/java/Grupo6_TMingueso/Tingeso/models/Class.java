package Grupo6_TMingueso.Tingeso.models;

import javax.persistence.*;

@Entity
@Table(name="Class")

public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_class")

    private long id_class;
}
