package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SportlerRepository {
    List<Sportler> sportlerList = new ArrayList<>();

    public SportlerRepository() {
    }

    public void addSportler(Sportler sportler){
        sportlerList.add(sportler);
    }

    public void deleteSportler(Sportler sportler){
        sportlerList.remove(sportler);
    }

    public void updateSportler(Sportler updatedSportler) {
        for (Sportler sportler : sportlerList) {
            if (sportler.getName().equals(updatedSportler.getName())) {
                sportler.setAktivitaten(updatedSportler.getAktivitaten());
            }
        }
    }

    public void topActivities(){
        List<Aktivitat> activities = new ArrayList<>();
        for(Sportler sportler : sportlerList){
            for(Aktivitat aktivitat : sportler.getAktivitaten()){
                if(!activities.contains(aktivitat)){
                    activities.add(aktivitat);
                }
            }
        }

        activities.sort(Comparator.comparing(Aktivitat::getKalories).reversed());
        System.out.println(activities);
    }

    public void showAll(){
        for(Sportler sportler : sportlerList){
            System.out.println(sportler.toString());
        }
    }
}
