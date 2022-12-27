public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Dizinin Ortalaması :" + sum / (numbers.length));

        //Dizideki sayıların harmonik ortalamasını hesaplayan program
        double[] numbers2 = {1, 2, 3, 4, 5};
        double harmonikToplamlar = 0;
        for (double j:numbers2){
            harmonikToplamlar+=1/j;
        }
        System.out.println("Harmonik Toplamlar :"+numbers2.length/harmonikToplamlar);
    }
}