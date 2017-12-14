package it.gixlg.kata;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<DivideByNumberReturnString> list = new ArrayList<DivideByNumberReturnString>();

    private DivideByNumberReturnString defaultDivideByNumberReturnString = new DivideByOneReturnNumber();

    public Game defaultDivideByNumberReturnString(DivideByNumberReturnString divideByNumberReturnString){
        this.defaultDivideByNumberReturnString = divideByNumberReturnString;
        return this;
    }

    public Game append(DivideByNumberReturnString divideByNumberReturnString){
        list.add(divideByNumberReturnString);
        return this;
    }

    public String say(int number) {
        StringBuilder sb = new StringBuilder();
        for (DivideByNumberReturnString divideByNumberReturnString : list){
            sb.append(divideByNumberReturnString.say(number));
        }
        if (sb.toString().equals("")) return defaultDivideByNumberReturnString.say(number);
        else return sb.toString();

    }
}
