package Grupo6_TMingueso.Tingeso.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="statistic")


public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="statistic_id")
    private long statistic_id;

    private int done_completes;
    private int totals;
    private int done_conditional;
    private int totals_condi;
    private int done_recursive;
    private int totals_recursive;
    private int done_iterative;
    private int totals_iterative;
    private int done_list;
    private int totals_list;
    private int done_function;
    private int totals_function;





    @OneToOne(mappedBy = "statistic", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonBackReference(value="statistic-student")

    public Student student;

    public int getDone_completes() {
        return done_completes;
    }

    public void setDone_completes(int done_completes) {
        this.done_completes = done_completes;
    }

    public int getTotals() {
        return totals;
    }

    public void setTotals(int totals) {
        this.totals = totals;
    }

    public int getDone_conditional() {
        return done_conditional;
    }

    public void setDone_conditional(int done_conditional) {
        this.done_conditional = done_conditional;
    }

    public int getTotals_condi() {
        return totals_condi;
    }

    public void setTotals_condi(int totals_condi) {
        this.totals_condi = totals_condi;
    }

    public int getDone_recursive() {
        return done_recursive;
    }

    public void setDone_recursive(int done_recursive) {
        this.done_recursive = done_recursive;
    }

    public int getTotals_recursive() {
        return totals_recursive;
    }

    public void setTotals_recursive(int totals_recursive) {
        this.totals_recursive = totals_recursive;
    }

    public int getDone_iterative() {
        return done_iterative;
    }

    public void setDone_iterative(int done_iterative) {
        this.done_iterative = done_iterative;
    }

    public int getTotals_iterative() {
        return totals_iterative;
    }

    public void setTotals_iterative(int totals_iterative) {
        this.totals_iterative = totals_iterative;
    }

    public int getDone_list() {
        return done_list;
    }

    public void setDone_list(int done_list) {
        this.done_list = done_list;
    }

    public int getTotals_list() {
        return totals_list;
    }

    public void setTotals_list(int totals_list) {
        this.totals_list = totals_list;
    }

    public int getDone_function() {
        return done_function;
    }

    public void setDone_function(int done_function) {
        this.done_function = done_function;
    }

    public int getTotals_function() {
        return totals_function;
    }

    public void setTotals_function(int totals_function) {
        this.totals_function = totals_function;
    }
}
