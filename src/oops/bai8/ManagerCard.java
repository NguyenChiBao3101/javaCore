package oops.bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCard {
    private List<Card> cards;

    public ManagerCard() {
        this.cards = new ArrayList<>();
    }

    public void addCard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of card: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0; i < n; i++) {
            System.out.println("Card " + (i +1) + " :");
            Card card = new Card();
            card.insertCardInfo();
            this.cards.add(card);
        }
    }

    public void showListCards() {
        System.out.println(" ---------- LIST OF CARDS ---------- ");
        for(Card card : cards) {
            card.showCardInfo();
            System.out.println("------------");
        }
    }

    public boolean deleteCard(String id) {
        Card card = this.cards.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        this.cards.remove(card);
        return true;
    }


}
