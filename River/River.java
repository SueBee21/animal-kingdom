import java.util.Random;
           Random rand = new Random();
public class River {



    static  void River() {
            String[] animalArray = new String[30];
        int fishCount = 0;
        int bearCount = 0;
        int x = rand.nextInt(30);


    while (fishCount <= 10) {
        if (animalArray[x] == null) {
            animalArray[x] = "fish";
            fishCount++;
                 System.out.println(fishCount);
        }
    }

    while (bearCount <= 10) {
        if (animalArray[x] == null) {
            animalArray[x] = "bear";
            bearCount++;
                 System.out.println(bearCount);
           
        }
        }
    }

    public static void main(String[] args) {   


River();

    }
}