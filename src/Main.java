public class Main {

    public static void main(String[] args) {
        int[] sales = new int[] {5, 10, 20, 50};
        SalesManager salesManager = new SalesManager(sales);

        int max = salesManager.max();

        System.out.println(max);
    }
}
