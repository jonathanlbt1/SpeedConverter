public class Main {
    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(21);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }

}
