package com.company;

public class Aktivitat {
    String name;
    int kalories;

    public Aktivitat(String name, int kalories) {
        this.name = name;
        this.kalories = kalories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKalories() {
        return kalories;
    }

    public void setKalories(int kalories) {
        this.kalories = kalories;
    }

    @Override
    public String toString() {
        return "Aktivitat{" +
                "name='" + name + '\'' +
                ", kalories=" + kalories +
                '}';
    }
}
