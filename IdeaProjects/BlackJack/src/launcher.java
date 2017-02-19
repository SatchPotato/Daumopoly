import javax.swing.*;

/**
 * Created by Ethan Stancliffe on 2/19/2017.
 */
public class launcher {
    public static void main(String[] args){
        GUI blackjack = new GUI("BlackJack!");
        blackjack.setVisible(true);
        blackjack.setSize(400,400);
        blackjack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
