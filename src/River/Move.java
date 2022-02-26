import java.util.Random;
import java.util.Arrays;


public class Move {

    public static void main (String[] args) {
        // print out array
        Random rand = new Random();
        String[] animalArray = new String[30];
        // for each animal in river
        for (int i=0; i<animalArray.length; i++)  {
            //identify what is in array
            String myAnimal = animalArray[i];

            // identify movement X of -1, 0, 1
            int x = rand.nextInt(3) -1;
            // change index if animal[i] by X
            // if same, create new instance of animal, update fishcount
            if (myAnimal == animalArray[x]) {
                if (myAnimal == "fish") {
                    fishcount++;
                    //create new fish
                }
                else {
                    bearcount++;
                    //create new bear   
                }
            }
            // if different, remove fish and reduce fishcountcd ..
           else if (myAnimal != animalArray[x]) {
                animalArray[x] = "bear";
                fishcount--;
            }
            // if empty, do nothing
        else {
            animalArray[x] = myAnimal;
        }
            //print new array
    }
}
}