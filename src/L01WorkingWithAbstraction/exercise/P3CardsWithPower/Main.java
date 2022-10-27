package L01WorkingWithAbstraction.exercise.P3CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        Card card = new Card(CardSuits.valueOf(cardSuit), CardRanks.valueOf(cardRank));

        System.out.printf("Card name: %s of %s; Card power: %d",
                card.getCardRank(), card.getCardSuit(), card.getPower());
    }
}
