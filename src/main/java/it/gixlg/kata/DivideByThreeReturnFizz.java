package it.gixlg.kata;

public class DivideByThreeReturnFizz implements DivideByNumberReturnString {

    @Override
    public String say(int number) {
        if (number % 3 ==0) return "Fizz";
        return "";
    }
}
