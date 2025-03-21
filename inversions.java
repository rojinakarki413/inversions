public class Inversions {
    public int countInversion(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;  
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 1};
        Inversions inv = new Inversions();  
        int inversions = inv.countInversion(array);  
        System.out.println("Total number of inversions: " + inversions);
    }
}
