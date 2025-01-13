import java.util.Random;
public class RandomValues {

    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); 
        }
        
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5; 
        int[] randomNumbers = generate4DigitRandomArray(size);

        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
}
