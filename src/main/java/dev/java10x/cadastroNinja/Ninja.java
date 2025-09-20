package dev.java10x.cadastroNinja;

import java.util.List;

//A ninja entity with attributes such as name, class, rank and techniques.
//P.S word class is reserved by Java
public class Ninja {
    private String name;
    private NinjaClass clas;
    private NinjaRank rank;
    private List<String> techniques;

    public Ninja(String name, NinjaClass clas, NinjaRank rank, List<String> techniques) {
        this.name = name;
        this.clas = clas;
        this.rank = rank;
        this.techniques = techniques;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NinjaClass getClas() {
        return clas;
    }

    public void setClass(NinjaClass clas) {
        this.clas = clas;
    }

    public NinjaRank getRank() {
        return rank;
    }

    public void setRank(NinjaRank rank) {
        this.rank = rank;
    }

    public List<String> getTechniques() {
        return techniques;
    }

    public void setTechniques(List<String> techniques) {
        this.techniques = techniques;
    }

    @Override
    public String toString() {
        return "Ninja {" +
                "name='" + name + '\'' +
                ", clas=" + clas +
                ", rank=" + rank +
                ", techniques=" + techniques +
                '}';
    }
}
