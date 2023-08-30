package test;

import java.util.Random;

/**
 * Main 클래스 입니다.
 */

public class Main {
    /**
     * main 메서드입니다.
     *
     * @param args input 인자
     */
    public static void main(String[] args) {

        Random r = new Random();
        int random1 = r.nextInt() * 6 + 1;
        int random2 = r.nextInt() * 6 + 1;

        Dice dice1 = new Dice(random1);
        Dice dice2 = new Dice(random2);

        System.out.println("주사위 합 = " + DiceCalculator.addDice(dice1, dice2));

        String str = "abcdefg";

        String str1 = "샬롯의 거미줄";

        int val = r.nextInt() * str.length();
        System.out.println(DiceCalculator.getIndexOf(str, val));

        int random4 = r.nextInt() * 6 + 1;
        Dice dice = new Dice(random4);
        System.out.println("주사위 눈(" + random4 + ")이 홀수: " + DiceCalculator.odd(dice));

        //도서관 생성
        //생성자 (size)
        //음수가 들어올 경우 예외 발생
        try {
            new Libary(-1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        Libary libary = new Libary(5);

        libary.add("해리포터");

        libary.add(str1);
        try {
            libary.add(str1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        libary.delete("해리포터");
        try {
            libary.delete("스파이더맨");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        libary.find(str1);
        libary.find("샬롯의 거미줄2");

        libary.findAll();

        libary.add("java7");
        libary.add("java8");
        libary.add("java9");
        libary.add("java11");
        libary.findAll();

        try {
            libary.add("java22");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
