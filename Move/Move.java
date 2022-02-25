import java.util.Random;

public class Move {

    public static void main (String[] args) {
        // print out array
        Random rand = new Random();
        // for each animal in river
        for (int i=0; i<animalArray.length; i++)  {
            // identify movement X of -1, 0, 1
            int x = rand.nextInt(3) -1;
            System.out.println(x);
            // change index if animal[i] by X

            // if same, create new instance of animal, update fishcount

            // if different, remove fish and reduce fishcountcd ..

            // if empty, do nothing

            //print new array

    }
}
}