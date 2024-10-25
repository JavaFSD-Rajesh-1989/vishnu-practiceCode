public class LongestPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "few"};
        if (arr.length == 0) {
            System.out.println(0);
            return;
        }

        int count = 0;
        for (int i = 0; i < arr[0].length(); i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i >= arr[j].length() || arr[0].charAt(i) != arr[j].charAt(i)) {
                    System.out.println(count);
                    return;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
