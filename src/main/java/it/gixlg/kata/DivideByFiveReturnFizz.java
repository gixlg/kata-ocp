package it.gixlg.kata;

public class DivideByFiveReturnFizz implements DivideByNumberReturnString {

    @Override
    public String say(int number) {
        if (number % 5 ==0) return "Buzz";
        return "";
    }
}
