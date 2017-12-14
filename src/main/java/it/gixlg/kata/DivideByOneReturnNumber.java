package it.gixlg.kata;

public class DivideByOneReturnNumber implements DivideByNumberReturnString {

    @Override
    public String say(int number) {
        return String.valueOf(number);
    }
}
