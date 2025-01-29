public class StringSorting {
    public static void main(String[] args) {
        String[] cities = new String[5];
        cities[0] = "Kathmandu";
        cities[1] = "Bhaktapur";
        cities[2] = "Kgekhara";
        cities[3] = "Chitwon";
        cities[4] = "Chitwan";

        // Perform selection sort
        for (int i = 0; i < 5; i++) {
            int minIndex = i;
            for (int j = i + 1; j < 5; j++) {
                if (cities[j].compareTo(cities[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the cities
            String temp = cities[i];
            cities[i] = cities[minIndex];
            cities[minIndex] = temp;
        }
        // Print the sorted cities
        for (int i = 0; i < 5; i++) {
            System.out.println(cities[i]);
        }
    }
}
