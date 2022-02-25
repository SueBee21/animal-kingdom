import java.util.Random;

public class River {

    static void River() {
        Random rand = new Random();
            String[] animalArray = new String[30];
        int fishCount = 0;
        int bearCount = 0;

    while (fishCount < 10) {
        int x = rand.nextInt(30);
        if (animalArray[x] == null) {
            animalArray[x] = "fish";
                        fishCount++;
        }
        System.out.println("counting fish " + fishCount + " is index of" + x);  
        }
        System.out.println("exiting fishcount");
    
    while (bearCount < 10) {
        int x = rand.nextInt(30);
        if (animalArray[x] == null) {
            animalArray[x] = "fish";
                        bearCount++;
        }
        System.out.println("counting bear " + bearCount + " is index of" + x);  
        }
        System.out.println("exiting bearcount");
     }

    public static void main(String[] args) {   
        River();
    }
}