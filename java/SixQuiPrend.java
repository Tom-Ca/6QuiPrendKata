public class SixQuiPrend {

    public static int cardValue;
    public static int multiple5 = 5;
    public static int multiple10 = 10;
    public static int multiple11= 11;
    public static int nbbeef;


    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        nbbeef = 0;
        if (cardValue % multiple5 == 0) {
            nbbeef = 2;
        }
        if (cardValue % multiple10 == 0) {
            nbbeef = 3;
        }
        if (cardValue %  multiple11 == 0 && cardValue != 100){
            nbbeef = 5;
        }
        if (cardValue == 55 ){
            nbbeef += 2;
        }
        if (nbbeef ==0){
            nbbeef=1;
        }

        return nbbeef;
    }

    public static void gameLoop() {
        for (cardValue =1; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }

    }
}
