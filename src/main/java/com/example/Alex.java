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
        alexFriends.add("зебра Марти");
        alexFriends.add("бегемотиха Глория");
        alexFriends.add("жираф Мелман");
        return alexFriends;
    }

    public String getPlaceOfLiving() {
        return "Место жительства: Нью-Йоркский зоопарк";
    }
}