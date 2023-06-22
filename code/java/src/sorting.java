public class sorting {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 2;
        a[1] = 5;
        a[2] = 3;
        a[3] = 7;
        a[4] = 4;
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println("Sorted -->");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
