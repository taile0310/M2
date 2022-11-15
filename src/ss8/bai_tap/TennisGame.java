package ss8.bai_tap;

import java.util.Scanner;

public class TennisGame {
    private static String result = " ";
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int ZERO = 0;

    public static String getScore(int score1) {

        switch (score1) {
            case ZERO:
                result = "Love-All";
                break;
            case ONE:
                result = "Fifteen-All";
                break;
            case TWO:
                result = "Thirty-All";
                break;
            case THREE:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";


        }
        return result;
    }

    public static String getScoreMoreFour(String namePlayerOne, String namePlayerTwo, int score1, int score2) {
        int minusResult = score1 - score2;
        if (minusResult == 1) {

            result = "Advantage" + namePlayerOne;
        } else if (minusResult == -1) {
            result = "Advantage " + namePlayerTwo;
        } else if (minusResult >= 2) {
            result = "Win for " + namePlayerOne;
        } else {
            result = "Win for " + namePlayerTwo;
        }
        return result;
    }

    public static String callScoreOne(int score1) {
        switch (score1) {
            case ZERO:
                result = "Love";
                break;
            case ONE:
                result = "Fifteen";
                break;
            case TWO:
                result = "Thirty";
                break;
            case THREE:
                result = "Forty";
                break;
        }
        return result;
    }

    public static String callScoreTwo(int score2) {
        switch (score2) {
            case ZERO:
                result = "Love";
                break;
            case ONE:
                result = "Fifteen";
                break;
            case TWO:
                result = "Thirty";
                break;
            case THREE:
                result = "Forty";
                break;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score first player: ");
        int scoreOne = Integer.parseInt(scanner.nextLine());
        System.out.print("Name of player1: ");
        String nameOfFirstPlayer = scanner.nextLine();
        System.out.print("Enter your score second player: ");
        int scoreSecond = Integer.parseInt(scanner.nextLine());
        System.out.print("Name of player2: ");
        String nameOfSecondPlayer = scanner.nextLine();
        if (scoreOne == scoreSecond) {
            System.out.println(getScore(scoreOne));
        } else if (scoreOne >= FOUR || scoreSecond >= FOUR) {
            System.out.print(getScoreMoreFour(nameOfFirstPlayer, nameOfSecondPlayer, scoreOne, scoreSecond));

        } else {
            System.out.println(callScoreOne(scoreOne) + " " + callScoreTwo(scoreSecond));
        }
    }
}
