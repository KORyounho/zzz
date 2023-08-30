package test;

public class DiceCalculator {
    private DiceCalculator(){}
    public static int addDice(Dice dice1, Dice dice2) {
        return dice1.getNumber()+dice2.getNumber();
    }

    public static String getIndexOf(String str, int index) {
        return str.substring(0, index+1);
    }

    public static boolean odd(Dice dice) {
        return dice.getNumber() % 2 !=0;
    }
}
