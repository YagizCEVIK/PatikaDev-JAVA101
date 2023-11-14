/*package MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class MineSweeper {
    int columnnumber;
    int rownumber;
    int minenumber = 0;
    int row;
    int column;
    String yazi = "-";
    int count = 0;
    String[][] list,duplicate;
    boolean isLose = false;


    public MineSweeper(int rownumber, int columnnumber){
        this.columnnumber = columnnumber;
        this.rownumber = rownumber;
        this.minenumber = rownumber*columnnumber/4;
        this.list = new String[this.columnnumber][this.rownumber];
        this.duplicate = new String[this.columnnumber][this.rownumber];

    }


    void run(){
        Random rand = new Random();
        for (String[] row: list)
            Arrays.fill(row, yazi);
        int count = 0;
        while (count < minenumber) {
            int randomRow = rand.nextInt(rownumber);
            int randomColumn = rand.nextInt(columnnumber);
            if (!list[randomRow][randomColumn].equals("*")) {
                list[randomRow][randomColumn] = "*";
                count++;
            }
        }

            System.out.println("Mayınların Konumu");
            for (String[] row : list) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
            for (String[] row : duplicate) {
                System.out.println(Arrays.toString(row));
            }
        while(isLose == false){
            System.out.println("Satır Giriniz : ");
            Scanner inp = new Scanner(System.in);
            row = inp.nextInt();
            System.out.println("Sütun giriniz : ");
            column = inp.nextInt();
            if (duplicate[column][row] == "*") {
                isLose = true;
            }else if(duplicate[column][row] == "-"){
                if (list[column +1][row] == "*") {
                    count++;
                }
                if (list[column][row+1] == "*") {
                    count++;
                }
                if (list[column +1][row+1] == "*") {
                    count++;
                }
                if (list[column -1][row] == "*") {
                    count++;
                }
                if (list[column ][row-1] == "*") {
                    count++;
                }
                if (list[column -1][row-1] == "*") {
                    count++;
                }
                if (list[column +1][row-1] == "*") {
                    count++;
                }
                if (list[column -1][row+1] == "*") {
                    count++;
                }
                String number = Integer.toString(count);
                duplicate[column][row] = number;
                for (String[] row : duplicate) {
                    System.out.println(Arrays.toString(row));
                }
            }else{
                System.out.println("Bu zaten seçili. ");
                for (String[] row : duplicate) {
                    System.out.println(Arrays.toString(row));
                }
            }
        }
    }
}*/
package MineSweeper;

/*import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int columnnumber;
    int rownumber;
    int minenumber = 0;
    String yazi = "-";
    String[][] list,duplicate;
    boolean isLose = false;

    public MineSweeper(int rownumber, int columnnumber){
        this.columnnumber = columnnumber;
        this.rownumber = rownumber;
        this.minenumber = rownumber*columnnumber/4;
        this.list = new String[this.columnnumber][this.rownumber];
        this.duplicate = new String[this.columnnumber][this.rownumber];
        for (String[] row: list)
            Arrays.fill(row, yazi);
        for (String[] row: duplicate)
            Arrays.fill(row, yazi);
    }

    void run(){
        placeMines();
        printBoard(list);
        while(!isLose){
            takeUserInput();
        }
    }

    void placeMines(){
        Random rand = new Random();
        int count = 0;
        while (count < minenumber) {
            int randomRow = rand.nextInt(rownumber);
            int randomColumn = rand.nextInt(columnnumber);
            if (!list[randomRow][randomColumn].equals("*")) {
                list[randomRow][randomColumn] = "*";
                count++;
            }
        }
    }

    void printBoard(String[][] board){
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    void takeUserInput(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Satır Giriniz : ");
        int row = inp.nextInt();
        System.out.println("Sütun giriniz : ");
        int column = inp.nextInt();
        if (row >= 0 && row < rownumber && column >= 0 && column < columnnumber) {
            if (list[column][row] == "*") {
                isLose = true;
            } else {
                int count = countAdjacentMines(row, column);
                duplicate[column][row] = Integer.toString(count);
                printBoard(duplicate);
            }
        } else {
            System.out.println("Invalid input. Please enter numbers between 0 and " + (rownumber - 1) + " for rows and between 0 and " + (columnnumber - 1) + " for columns.");
        }
    }

    int countAdjacentMines(int row, int column){
        int count = 0;
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(row + i >= 0 && row + i < rownumber && column + j >= 0 && column + j < columnnumber){
                    if(list[row + i][column + j] == "*"){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class MineSweeper {
    int columnnumber;
    int rownumber;
    int minenumber = 0;
    String yazi = "-";
    String[][] list,duplicate;
    boolean isLose = false;

    public MineSweeper(int rownumber1, int columnnumber1){
        columnnumber = columnnumber1;
        rownumber = rownumber1;
        minenumber = rownumber*columnnumber/4;
        list = new String[columnnumber][rownumber];
        duplicate = new String[columnnumber][rownumber];
        for (String[] row: list)
            Arrays.fill(row, yazi);
        for (String[] row: duplicate)
            Arrays.fill(row, yazi);
    }

    void run(){
        System.out.println("Mayınların Konumu");
        placeMines();
        printBoard(list);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        printBoard(duplicate);
        while(!isLose){
            takeUserInput();
        }

    }

    void placeMines(){
        Random rand = new Random();
        int count;
        count = 0;
        while (count < minenumber) {
            int randomRow = rand.nextInt(rownumber);
            int randomColumn = rand.nextInt(columnnumber);
            if (!list[randomColumn][randomRow].equals("*")) {
                list[randomColumn][randomRow] = "*";
                count++;
            }
        }
    }

    void printBoard(String[][] board){
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
    void takeUserInput(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Satır Giriniz : ");
        int row = inp.nextInt();
        System.out.print("Sütun giriniz : ");
        int column = inp.nextInt();
        System.out.println("===========================");
        if (row >= 0 && row < rownumber && column >= 0 && column < columnnumber) {
            if (list[column][row] == "*") {
                isLose = true;
                System.out.println("Oyunu Kaybettiniz.");
            } else{
                int count;
                count = countAdjacentMines(row, column);
                duplicate[column][row] = Integer.toString(count);
                printBoard(duplicate);
                int count2 = 0;
                char karakter = '-';
                for(int k = 0 ; k<columnnumber; k++){
                    for(int i = 0; i<rownumber; i++){
                        if(duplicate[k][i].charAt(0) == karakter){
                            count2++;
                        }
                    }
                }
                System.out.println("COUNT2 : "+ count2);
                if(count2 == this.minenumber){
                    isLose = true;
                    System.out.println("Oyunu Kazandınız.");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter numbers between 0 and " + (rownumber - 1) + " for rows and between 0 and " + (columnnumber - 1) + " for columns.");
        }
    }

    int countAdjacentMines(int row, int column){
        int count;
        count = 0;
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(row + i >= 0 && row + i < rownumber && column + j >= 0 && column + j < columnnumber){
                    if(list[column + j][row + i].equals("*")){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MineSweeper mine = new MineSweeper(5,5);
        mine.run();
    }
}



