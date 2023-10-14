package Sem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выбор языка в игре 1-рус, 2-англ.");
        Scanner num = new Scanner(System.in);
        Integer num1 = num.nextInt();

        if (num1 == 1) {

            //----------------
            Game game = new NumberGame();
            game.start(5, 1);
            while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE) {
                Scanner scanner = new Scanner(System.in);
                Answer answer = game.inputValue(scanner.nextLine());

                System.out.println("быки = " + Answer.bull);
                System.out.println("коровы = " + Answer.cow);



            }
            System.out.println("Игровой статус = " + game.getGameStatus());

        }else{
            Game game = new NumberGame();
            game.start(5, 1);
            while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE) {
                Scanner scanner = new Scanner(System.in);
                Answer answer = game.inputValue(scanner.nextLine());
                System.out.println("answer = " + answer);
            }
            System.out.println("game.getGameStatus() = " + game.getGameStatus());


        }
        System.out.println("Хотите продолжить игру? Y-да, N-нет.");

    }
}