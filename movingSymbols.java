public class movingSymbols{
    public static void main(String[] args) throws Exception {
        int width = 120;
        int lines = 60;

        int[] left = new int[lines];
        int[] right = new int[lines];

        // Start the animation loop forever
        while (true) {
            moveIn(left, right, width, lines);   // stars move toward center
            moveOut(left, right, width, lines);  // stars move back outward
        }
    }

    // Method 1: move stars inward
    public static void moveIn(int[] left, int[] right, int width, int lines) throws InterruptedException {
        for (int i = 0; i < lines; i++) {
            left[i] = i;
            right[i] = width - 1 - i;
            printLine(width, left[i], right[i]); 
            Thread.sleep(20);
        }
    }

    // Method 2: move stars outward
    public static void moveOut(int[] left, int[] right, int width, int lines) throws InterruptedException {
        for (int i = lines - 1; i >= 0; i--) {
            left[i] = i;
            right[i] = width - 1 - i;
            printLine(width, left[i], right[i]);
            Thread.sleep(20);
        }
    }

    // Method 3: print one line of stars
    public static void printLine(int width, int left, int right) {
        char[] line = new char[width];
        for (int j = 0; j < width; j++) line[j] = ' ';
        line[left] = '*';
        line[right] = '*';
        System.out.println(new String(line));
    }
}
