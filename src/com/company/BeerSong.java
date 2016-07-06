package com.company;

public class BeerSong {
    static String correctWord (int n) {

        if (n > 10 && n < 20 ) {
            return "бутылок";
        }

        if (n % 10 == 1) {
            return "бутылка";
        }

        if (n % 10 == 0) {
            return "бутылок";
        }

        if (n % 10 <= 4) {
            return "бутылки";
        }

        return "бутылок";

    }
    public static void main(String[] args) {
        int beerNum = 99;
        String word = correctWord(beerNum);
        System.out.println(beerNum + " " + word + " пива на стене");

        while (beerNum > 0) {
            word = correctWord(beerNum);
            System.out.println(beerNum + " " + word + " пива");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                word = correctWord(beerNum);
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {

                System.out.println("Нет бутылок пива на стене.");
            }
        }
    }
}