package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Aktivitat a1 = new Aktivitat("a1", 1);
	Aktivitat a2 = new Aktivitat("a2", 3);
	Aktivitat a3 = new Aktivitat("a3", 4);
	Aktivitat a4 = new Aktivitat("a4", 9);
	Aktivitat a5 = new Aktivitat("a5", 2);

	List<Aktivitat> l1 = new ArrayList<>();
	l1.add(a1);
	l1.add(a4);

	List<Aktivitat> l2 = new ArrayList<>();
	l2.add(a2);
	l2.add(a3);
	l2.add(a5);

	Sportler s1 = new Sportler("s1", l1);
	Sportler s2 = new Sportler("s2", l2);

	SportlerRepository sRep = new SportlerRepository();
	sRep.addSportler(s1);
	sRep.addSportler(s2);
	sRep.showAll();
	sRep.topActivities();
    }
}
