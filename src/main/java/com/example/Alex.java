package com.example;

import java.util.List;

public class Alex extends Lion {

    Predator predator;

    public Alex(Predator predator) throws Exception {
        super(predator, "Самец");
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глории", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
