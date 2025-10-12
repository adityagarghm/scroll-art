public class asciiArt{
    public static void main(String[] args) throws InterruptedException{
    while (true){
       char[][] spider = makeSpider();       // build the spider shape
        printRowOfSpiders(spider, 4);   // print 4 spiders side by side
        }     
    }

    // 🕸️ builds and returns one spider shape
    public static char[][] makeSpider() {
        char[][] spider = new char[13][28];

        // fill with spaces
        for (int row = 0; row < 13; row++) {
            for (int col = 0; col < 28; col++) {
                spider[row][col] = ' ';
            }
        }

        // same shape as before
        spider[0][4] = '('; spider[0][5] = '('; spider[0][6] = '(';
        spider[0][20] = ')'; spider[0][21] = ')'; spider[0][22] = ')';
        spider[1][4] = '('; spider[1][5] = '('; spider[1][6] = '('; spider[1][7] = '(';
        spider[1][19] = ')'; spider[1][20] = ')'; spider[1][21] = ')'; spider[1][22] = ')';
        spider[2][4] = '('; spider[2][5] = '('; spider[2][6] = '('; spider[2][7] = '(';
        spider[2][19] = ')'; spider[2][20] = ')'; spider[2][21] = ')'; spider[2][22] = ')';
        spider[3][5] = '('; spider[3][6] = '('; spider[3][7] = '(';
        spider[3][11] = 'o'; spider[3][12] = 'o'; spider[3][13] = 'o'; spider[3][14] = 'o'; spider[3][15] = 'o';
        spider[3][19] = ')'; spider[3][20] = ')'; spider[3][21] = ')';
        spider[4][6] = '('; spider[4][7] = '(';
        spider[4][10] = 'o'; spider[4][11] = 'O'; spider[4][12] = 'O'; spider[4][13] = 'O'; spider[4][14] = 'O'; spider[4][15] = 'O'; spider[4][16] = 'o';
        spider[4][20] = ')'; spider[4][21] = ')';
        spider[5][6] = '(';
        spider[5][9] = 'o'; spider[5][10] = 'o'; spider[5][11] = 'O'; spider[5][12] = '@'; spider[5][13] = '@'; spider[5][14] = '@'; spider[5][15] = 'O'; spider[5][16] = 'o'; spider[5][17] = 'o';
        spider[5][21] = ')';
        spider[6][9] = 'o'; spider[6][10] = 'O'; spider[6][11] = '@'; spider[6][12] = '@'; spider[6][13] = '@'; spider[6][14] = '@'; spider[6][15] = '@'; spider[6][16] = 'O'; spider[6][17] = 'o';
        spider[7][6] = '(';
        spider[7][9] = 'o'; spider[7][10] = 'o'; spider[7][11] = 'O'; spider[7][12] = '@'; spider[7][13] = '@'; spider[7][14] = '@'; spider[7][15] = 'O'; spider[7][16] = 'o'; spider[7][17] = 'o';
        spider[7][21] = ')';
        spider[8][6] = '('; spider[8][7] = '(';
        spider[8][10] = 'o'; spider[8][11] = 'O'; spider[8][12] = 'O'; spider[8][13] = 'O'; spider[8][14] = 'O'; spider[8][15] = 'O'; spider[8][16] = 'o';
        spider[8][20] = ')'; spider[8][21] = ')';
        spider[9][5] = '('; spider[9][6] = '('; spider[9][7] = '(';
        spider[9][11] = 'o'; spider[9][12] = 'o'; spider[9][13] = 'o'; spider[9][14] = 'o'; spider[9][15] = 'o';
        spider[9][19] = ')'; spider[9][20] = ')'; spider[9][21] = ')';
        spider[10][4] = '('; spider[10][5] = '('; spider[10][6] = '('; spider[10][7] = '(';
        spider[10][19] = ')'; spider[10][20] = ')'; spider[10][21] = ')'; spider[10][22] = ')';
        spider[11][4] = '('; spider[11][5] = '('; spider[11][6] = '('; spider[11][7] = '(';
        spider[11][19] = ')'; spider[11][20] = ')'; spider[11][21] = ')'; spider[11][22] = ')';
        spider[12][4] = '('; spider[12][5] = '('; spider[12][6] = '(';
        spider[12][20] = ')'; spider[12][21] = ')'; spider[12][22] = ')';

        return spider;
    }

    // 🕷️ prints multiple spiders side by side, each inside a box of *
    public static void printRowOfSpiders(char[][] spider, int spiderCount) throws InterruptedException {
        int height = spider.length;          // number of rows in one spider
        int width = spider[0].length;        // number of columns in one spider

        // loop through each row (plus one top and one bottom border)
        for (int row = 0; row < height + 2; row++) {
            for (int s = 0; s < spiderCount; s++) {           // repeat this row for each spider in the row
                 if (row == 0 || row == height + 1) {                // if we’re at the top or bottom border of the spider box
                    for (int col = 0; col < width + 2; col++) {
                        System.out.print('*');//print stars at top/bottom of row
                    }
                } else {
                    // print left border
                    System.out.print('*');
                    // print spider contents for this row
                    for (int col = 0; col < width; col++) {
                        System.out.print(spider[row - 1][col]);  
                    }
                    // print right border
                    System.out.print('*');
                }
            }
        System.out.println();
        Thread.sleep(30);
        }
    }
}
