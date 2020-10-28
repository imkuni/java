import java.util.Random;

class commonUse {
    static int[] generateRandom(int count, int lowerbound, int upperbound){
        int[] numbers = new int[count];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            numbers[i] = rand.nextInt(upperbound-lowerbound)+lowerbound;
        }
        return numbers;
    }
}
