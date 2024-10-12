package com.example;

import java.util.ArrayList;
import java.util.List;

public class Alex extends Lion{

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        List<String> alexFriends = new ArrayList<>();
        return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    }

    public String getPlaceOfLiving() {
        return "Место жительства: Нью-Йоркский зоопарк";
    }
}