package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class AlexTest {

    private Alex alex;
    private Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
        alex = new Alex(feline);
    }

    @Test
    public void getKittensTest() {
        int expected = 0;
        int actual = alex.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFriendsTest() {
        List<String> expected = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        List<String> actual = alex.getFriends();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() {
        String expected = "Место жительства: Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        Assert.assertEquals(expected, actual);
    }
}