package WinGuess;

public class Player {
    String name;
    int guess;

    public Player(String name) {
        this.name = name;
    }

    void makeGuess() {
        int number = (int) (Math.random()*9)+1;
        System.out.println(name+ " has guessed: " + number);
        this.guess = number;
    }



    int getGuess() {
        return guess;
    }
}
