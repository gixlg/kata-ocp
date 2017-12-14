package it.gixlg.kata;

public class GameFactory {



    public static Game createGame(){
        Game game =  new Game();
        game.append(new DivideByThreeReturnFizz()).append(new DivideByFiveReturnFizz());
        return game;
    }
}
