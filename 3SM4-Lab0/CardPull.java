import java.util.Random;

public class CardPull{
    private static final int DECKCOUNT = 1;
    private static final int RANDSIZE = 13;
    private static final int SINGLEDECKSIZE = 52;

    public final void CardPullEXT() {

    };
    
    public Card[] getRandomCard(int n){
        Card[] tempCards = new Card[n];
        Random rand = new Random();
        int index = 0, count = 0;
        while(count < n){
            index = rand.nextInt(DECKCOUNT*SINGLEDECKSIZE);
            if(bitVec[index]) continue;
            bitVec[index] = true;
            tempCards[count++] = myPool[index];

        }
        return tempCards;
    }


};