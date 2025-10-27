import java.util.Random;
public class myAsciiArt{

    public static void main(String[] args) throws InterruptedException{
        AsciiArt[] images = {new AsciiArt(makeSpider()), new AsciiArt(getBoat()), new AsciiArt(getElephant()), new AsciiArt(getCloud()), new AsciiArt(getButterfly()), new AsciiArt(getBunny())}; 
    while (true){
        Random r = new Random();
        int x = r.nextInt(0,6);
       //char[][] img = images[0].getImg();       
        printRowOfSpiders(images[x]);   // print 4 spiders side by side

        }     
    }

    // builds and returns one spider shape
    public static char[][] makeSpider() {
        char[][] spider = new char[13][28];

        // fill with spaces
        for (int amountRows = 0; amountRows < 13; amountRows++) {
            for (int amountColumns = 0; amountColumns < 28; amountColumns++) {
                spider[amountRows][amountColumns] = ' ';
            }
        }

        // spider shape
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
    static char[][] getBoat() {
        char[][] img = new char[10][34];
        // fill with empty space
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 34; x++) {
                img[y][x] = ' ';
            }
        }
        // then fill individual characters
        img[0][15] = '|';
        img[0][16] = '_';
        img[0][17] = '_';
        img[0][18] = '_';
        img[0][19] = '|';

        img[1][4] = '*';
        img[1][15] = '|';
        img[1][16] = '_';
        img[1][17] = '_';
        img[1][18] = '_';
        img[1][19] = '|';
        img[1][21] = '|';
        img[1][22] = '\\';
        img[1][26] = '*';
        img[1][28] = '*';

        img[2][3] = '*';
        img[2][9] = '_';
        img[2][10] = '_';
        img[2][11] = '|';
        img[2][12] = '_';
        img[2][13] = '_';
        img[2][15] = '|';
        img[2][16] = '_';
        img[2][17] = '_';
        img[2][18] = '_';
        img[2][19] = '|';
        img[2][21] = '|';
        img[2][23] = '\\';
        img[2][27] = '*';

        img[3][5] = '*';
        img[3][9] = '|';
        img[3][10] = 'o';
        img[3][11] = '_';
        img[3][12] = '_';
        img[3][13] = '|';
        img[3][15] = '|';
        img[3][16] = '_';
        img[3][17] = '_';
        img[3][18] = '_';
        img[3][19] = '|';
        img[3][21] = '|';
        img[3][22] = 'o';
        img[3][24] = '\\';

        img[4][9] = '|';
        img[4][10] = '_';
        img[4][11] = '_';
        img[4][12] = '_';
        img[4][13] = '|';
        img[4][15] = '|';
        img[4][16] = '_';
        img[4][17] = '_';
        img[4][18] = '_';
        img[4][19] = '|';
        img[4][21] = '|';
        img[4][22] = '_';
        img[4][23] = '_';
        img[4][24] = 'o';
        img[4][25] = '\\';

        img[5][1] = '^';
        img[5][2] = '^';
        img[5][8] = '_';
        img[5][9] = '|';
        img[5][10] = '_';
        img[5][11] = '_';
        img[5][12] = '_';
        img[5][13] = '|';
        img[5][17] = '|';
        img[5][21] = '|';
        img[5][30] = '^';
        img[5][31] = '^';
        img[5][32] = '^';
        
        img[6][2] = '^';
        img[6][3] = '^';
        img[6][4] = '^';
        img[6][7] = '/';
        img[6][8] = '.';
        img[6][9] = '.';
        img[6][10] = '.';
        img[6][11] = '\\';
        img[6][12] = '_';
        img[6][13] = '_';
        img[6][14] = '_';
        img[6][15] = '|';
        img[6][16] = '_';
        img[6][17] = '|';
        img[6][18] = '_';
        img[6][19] = '_';
        img[6][20] = '_';
        img[6][21] = '|';
        img[6][22] = '_';
        img[6][23] = '_';
        img[6][24] = '_';
        img[6][25] = '_';
        img[6][26] = '\\';
        img[6][27] = '_';
        img[6][28] = '/';
        img[6][32] = '^';
        img[6][33] = '^';

        img[7][0] = '~';
        img[7][1] = '~';
        img[7][2] = '~';
        img[7][3] = '~';
        img[7][4] = '~';
        img[7][5] = '~';
        img[7][6] = '~';
        img[7][7] = '\\';
        img[7][11] = 'o';
        img[7][13] = '*';
        img[7][15] = 'o';
        img[7][17] = '*';
        img[7][19] = '*';
        img[7][21] = 'o';
        img[7][23] = 'o';
        img[7][26] = '/';
        img[7][27] = '~';
        img[7][28] = '~';
        img[7][29] = '~';
        img[7][30] = '~';
        img[7][31] = '~';
        img[7][32] = '~';
        img[7][33] = '~';

        img[8][17] = '^';
        img[8][18] = '^';
        img[8][19] = '^';
        img[8][20] = '^';
        img[8][21] = '^';
        img[8][22] = '^';
        img[8][23] = '^';

        img[9][3] = '^';
        img[9][4] = '^';
        img[9][5] = '^';
        img[9][11] = '^';
        img[9][12] = '^';
        img[9][13] = '^';
        img[9][27] = '^';
        img[9][28] = '^';
        img[9][29] = '^';

        return img;
    }
    static char[][] getElephant() {
        char[][] img = new char[9][20];
        // fill with empty space
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 20; x++) {
                img[y][x] = ' ';
            }
        }
        // then fill individual characters
        img[0][14] = '_';
        img[1][5] = '(';
        img[1][6] = ')';
        img[1][13] = '|';
        img[1][14] = '~';
        img[1][15] = '|';
        img[2][4] = '/';
        img[2][5] = '|';
        img[2][6] = '|';
        img[2][7] = '\\';
        img[2][13] = '|';
        img[2][14] = '~';
        img[2][15] = '|';
        img[2][10] = '_';
        img[2][11] = '_';
        img[3][5] = '/';
        img[3][6] = '\\';
        img[3][9] = '/';
        img[3][12] = '\\';
        img[3][13] = '~';
        img[3][14] = '~';
        img[3][15] = '~';
        img[3][16] = '\\';
        img[2][17] = '_';
        img[2][18] = '_';
        img[3][19] = '\\';
        img[4][3] = ',';
        img[4][4] = '-';
        img[4][5] = '-';
        img[4][6] = '-';
        img[4][7] = '-';
        img[4][8] = '(';
        img[4][13] = '-';
        img[4][15] = '-';
        img[4][19] = ')';
        img[5][2] = '/';
        img[5][18] = '/';
        img[6][1] = '/';
        img[6][3] = '|';
        img[6][12] = '(';
        img[6][13] = '\\';
        img[6][16] = '|';
        img[6][17] = '(';
        img[7][0] = '^';
        img[7][3] = '\\';
        img[7][0] = '^';
        img[7][7] = '/';
        img[7][8] = '_';
        img[7][9] = '_';
        img[7][10] = '\\';
        img[7][13] = '/';
        img[7][14] = '\\';
        img[7][16] = '|';
        img[8][4] = '|';
        img[8][5] = '_';
        img[8][6] = '_';
        img[8][7] = '|';
        img[8][10] = '|';
        img[8][11] = '_';
        img[8][12] = '_';
        img[8][13] = '|';
        img[8][14] = '-';
        img[8][15] = '"';

        return img;
    }
    public static char[][] getCloud() {

        int cloudheight = 9;
        int cloudwidth = 10;

        char[][] cloudimg = new char[cloudheight+1][cloudwidth+1];
        for (int y = 0; y <= cloudheight; y++) {
            for (int x = 0; x <= cloudwidth; x++) {
                cloudimg[y][x] = ' ';
            }
        }

        for (int i = 2; i <= 9; i++) {
            cloudimg[i][1] = ':';
        }
        cloudimg[1][2] = '_';
        cloudimg[2][3] = ':';
        cloudimg[2][4] = '.';
        cloudimg[3][5] = ':';
        cloudimg[4][4] = '*';
        cloudimg[5][5] = ':';
        cloudimg[6][6] = '*';
        cloudimg[7][6] = ';';
        cloudimg[8][4] = '.';
        cloudimg[8][5] = '*';
        cloudimg[9][2] = ':';
        cloudimg[9][3] = '*';

        return cloudimg;

    }
    static char[][] getButterfly() {
        char[][]img=new char [15][15];
        for(int y=0; y<15; y++ ){
            for(int x=0;x<15;x++){
                img[y][x]=' ';
            }
        }
        //left wing
        img[1][5]='♥';
        img[1][6]='♥';
        img[1][10]='♥';
        img[1][11]='♥';

        img[2][4]='♥';
        img[2][7]='♥';
        img[2][9]='♥';
        img[2][12]='♥';

        img[3][4]='♥';
        img[3][6]='o';
        img [3][10]='o';
        img[3][12]='♥';
        img[3][8]='♥';

        img [4][5]='♥';
        img[4][8]='-';
        img[4][11]='♥';

        img[5][6]='♥';
        img[5][10]='♥';

        img [6][7]='♥';
        img [6][9]='♥';

        img[7][8]='♥';

        //right wing

        img[14][5]='♥';
        img[14][6]='♥';
        img[14][10]='♥';
        img[14][11]='♥';

        img[13][4]='♥';
        img[13][7]='♥';
        img[13][9]='♥';
        img[13][12]='♥';

        img[12][4]='♥';
        img[12][6]='o';
        img [12][10]='o';
        img[12][12]='♥';
        img[12][8]='♥';

        img [11][5]='♥';
        img[11][8]='-';
        img[11][11]='♥';

        img[10][6]='♥';
        img[10][10]='♥';

        img [9][7]='♥';
        img [9][9]='♥';

        img[8][8]='♥';

        return img;
    }
 static char[][] getBunny() {
        char[][] img = new char[7][15];
        // fill with empty space
        for (int y = 0; y < 7; y++) {
            for (int x = 0; x < 15; x++) {
                img[y][x] = ' ';
            }
        }
        // then fill individual characters
        img[1][7] = '*';
        img[2][3] = '*';
        img[2][5] = '^';
        img[2][6] = '_';

        img[2][7] = '_';
        img[2][8] = '_';

        img[2][9] = '^';
        img[2][10] = '!';
        img[2][12] = '*';
        img[3][1] = '*';

        img[3][3] = '=';
        img[3][4]='(';
        img[3][5] = '●';
        img [3][7]='^';
        img[3][9] = '●';
        img[3][10] = ')';
        img[3][11] = '=';
        img[3][14]='*';

        img[4][3]='o';
        img[4][4]='/';
        img[4][10]='\\';
        img[4][11]='o';
        img[4][12]='♥';

        img[5][3]='/';
        img[5][11]='\\';

        img[6][2]='(';
        img[6][4]='_';
        img[6][6]='_';
        img[6][8]='_';
        img[6][10]='_';
        img[6][12]=')';
        return img;
    }


    // prints multiple spiders side by side, each inside a box of *
    public static void printRowOfSpiders(AsciiArt spider) throws InterruptedException {
        int height = spider.height;          // number of rows in one spider
        int width = spider.width;   // number of columns in one spider    
        long spiderCount =(long) Math.floor(120/width);

        // loop through each row (plus one top and one bottom border)
        for (int rowCount = 0; rowCount < height + 2; rowCount++) {
            for (int spiderPrint = 0; spiderPrint < spiderCount; spiderPrint++) {           // repeat this row for each spider in the row
                 if (rowCount == 0 || rowCount == height + 1) {                // if we’re at the top or bottom border of the spider box
                    for (int columnCount = 0; columnCount < width + 2; columnCount++) {
                        System.out.print('*');//print stars at top/bottom of row
                    }
                } else {
                    // print left border
                    System.out.print('*');
                    // print spider contents for this row
                    for (int columnSpider = 0; columnSpider < width; columnSpider++) {
                        System.out.print(spider.img[rowCount - 1][columnSpider]);  
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
