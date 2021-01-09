package com.company;

import java.util.ArrayList;
import java.util.List;

public class Sportler {
    String name;
    List<Aktivitat> aktivitaten = new ArrayList<>();

    public Sportler(String name, List<Aktivitat> aktivitaten) {
        this.name = name;
        this.aktivitaten = aktivitaten;
    }

    public void addActivity(Aktivitat aktivitat){
        aktivitaten.add(aktivitat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Aktivitat> getAktivitaten() {
        return aktivitaten;
    }

    public void setAktivitaten(List<Aktivitat> aktivitaten) {
        this.aktivitaten = aktivitaten;
    }

    @Override
    public String toString() {
        return name + ":" + aktivitaten + '\n';
    }
}
