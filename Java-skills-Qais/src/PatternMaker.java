public class PatternMaker {
    public static void printNumberTriangle(int rows){
        int asciiStart=49;
        for (int i=1;i<=rows;i++) { //control number of rows
            int ascii=asciiStart; //control content in rows
            for (int j=1;j<=i;j++){
                System.out.print((char) ascii + " "); //print ascii + space
                ascii++; //increment so it outputs the next number
            }
            System.out.println();
        }
    }

    public static void printMultiplicationTable(int number, int limit) {
        for (int i = 1; i <= limit; i++) {
            int result = number*i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
