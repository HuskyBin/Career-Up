import java.util.Random;

public class EighteenTwo {
    public int[] perfectShuffle(int[] cards) {
        if (cards == null || cards.length == 0) {
            return cards;
        }

        perfectShuffleCore(cards, cards.length - 1);
        return cards;
    }

    private void perfectShuffleCore(int[] cards, int number) {
        if (number == 0) {
            return;
        }

        perfectShuffleCore(cards, number - 1);
        int randomIndex = getRandomNumber(0, number - 1);
        int temp = cards[number];
        cards[number] = cards[randomIndex];
        cards[randomIndex] = temp;
        return;
    }

    private int getRandomNumber(int start, int end) {
        int result = new Random().nextInt(end - start + 1) + start;
        // int result = (int)(new Math.random() * (end - start + 1)) + start;
        return result;
    }

    public int[] perfectShuffleLoop(int[] cards) {
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = getRandomNumber(0, i);
            int temp = cards[randomIndex];
            cards[randomIndex] = cards[i];
            cards[i] = temp;
        }
        return cards;
    }

    public static void main(String[] args) {
        EighteenTwo obj = new EighteenTwo();
        int[] cards = new int[52];
        for (int i = 1; i <= 52; i++) {
            cards[i - 1] = i;
        }
        //cards = obj.perfectShuffle(cards);
        cards = obj.perfectShuffleLoop(cards);
        for (int i : cards) {
            System.out.print(i + "  ");
        }
    }
}
