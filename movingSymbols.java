public class movingSymbols{
    public static void main(String[] args) throws Exception {
        int width = 120;
        int lines = 60;

        int[] left = new int[lines];
        int[] right = new int[lines];

        // Start the animation loop forever
        int counter = 0;
        while (true) {
            moveIn(left, right, width, lines, counter);   // stars move toward center
            moveOut(left, right, width, lines, counter);  // stars move back outward
            counter++;
        }
    }

    // Method 1: move stars inward
    public static void moveIn(int[] left, int[] right, int width, int lines, int counter) throws InterruptedException {
        for (int i = 0; i < lines; i++) {
            left[i] = i;
            right[i] = width - 1 - i;
            printLine2(width, left[i], right[i], counter);
            Thread.sleep(8); 
        }
    }

    // Method 2: move stars outward
    public static void moveOut(int[] left, int[] right, int width, int lines, int counter) throws InterruptedException {
        for (int i = lines - 1; i >= 0; i--) {
            left[i] = i;
            right[i] = width - 1 - i;
            printLine2(width, left[i], right[i], counter);
            Thread.sleep(8);
        }
    }

    // Method 3: print one line of stars
    /*public static void printLine(int width, int left, int right, int counter) {
        char[] line = new char[width];
        for (int j = 0; j < width; j++) line[j] = ' ';
        line[left] = '*';
        line[right] = '*';
        System.out.println(new String(line));
    }*/
    //method 4 - adding to pattern
    public static void printLine2(int width, int left, int right, int counter) {
        char[] line = new char[width];
        for (int j = 0; j < width; j++) line[j] = ' ';
        if (counter%13 <=7){//get larger
        for (int step_increase = 0; step_increase <= counter%13; step_increase++){
            line [left + step_increase] = '*';
            line[right - step_increase] = '*';
        }}else{//get smaller
        for (int step_increase = 13 - counter%13; step_increase > 0; step_increase--){
            line[left + step_increase] = '*';
            line[right - step_increase] = '*';
        }}
        System.out.println(new String(line));
    }
}

