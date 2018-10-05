package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    private int[][] arr = new int[3][3];
    private Scanner scr = new Scanner(System.in);
    String playerX = "X", player0 = "0", player = "X", previousplayer = "X";
    private int x, y;

    TicTacToe() {
        initGameBoy();

        while (true) {
            drawGameBoy();

            System.out.println("Ход игрока " + gettplayer());
            System.out.println("Выбери строку: ");
            x = scr.nextInt();
            if(x>2|x<0){continue;}

            System.out.println("Выбери столбец: ");
            y = scr.nextInt();
            if(y>2|y<0){continue;}
            if ((arr[x][y]==1)|(arr[x][y]==2)){continue;}
            if((x>2|y>2)|(x<0|y<0)){continue;}
            checkDirtyPlay();




            checkwin();
            checkDrow();


        }
    }


    private void initGameBoy() {
        for (x = 0; x < arr.length; x++) {
            for (y = 0; y < arr.length; y++) {
                int massive = arr[x][y];
                arr[x][y] = 0;
            }
            System.out.println();
        }
    }

    private void drawGameBoy() {
        for (x = 0; x < arr.length; x++) {
            for (y = 0; y < arr.length; y++) {
                switch (arr[x][y]) {
                    case 0:
                        System.out.print("   ");
                        break;
                    case 1:
                        System.out.print(" X ");
                        break;
                    case 2:
                        System.out.print(" O ");
                        break;

                }
                if (y == 2) {
                    System.out.println(" ");
                } else {
                    System.out.print(" | ");
                }


            }
            System.out.println();
            if (x == 2) {
                System.out.println(" ");
            } else {
                System.out.println("----------------");
            }

        }

    }

    public String gettplayer() {
        return player;
    }

    public void setplayer() {
        this.player = player;
    }

    private void checkwinX() {
        {
            for (x = 0; x < 3; x++) {

                if ((arr[x][0] == 1) & (arr[x][1] == 1) & (arr[x][2] == 1)) {
                    System.out.println("Выйграл первый игрок");
                    initGameBoy();
                }

            }
        }
        for (y = 0; y < 3; y++) {
            if ((arr[0][y] == 1) & (arr[1][y] == 1) & (arr[2][y] == 1)) {
                System.out.println("Выйграл первый игрок");
                initGameBoy();
            }
        }
        if ((arr[0][0] == 1) & (arr[1][1] == 1) & (arr[2][2] == 1) | (arr[0][2] == 1) & (arr[2][0] == 1) & (arr[1][1] == 1)) {
            System.out.println("Выйграл первый игрок");
            initGameBoy();
        }
    }


    private void checkwinY() {
        {
            for (x = 0; x < 3; x++) {

                if ((arr[x][0] == 2) & (arr[x][1] == 2) & (arr[x][2] == 2)) {
                    System.out.println("Выйграл второй игрок");
                    initGameBoy();
                }

            }
        }
        for (y = 0; y < 3; y++) {
            if ((arr[0][y] == 2) & (arr[1][y] == 2) & (arr[2][y] == 2)) {
                System.out.println("Выйграл второй игрок");
                initGameBoy();
            }
        }
        if ((arr[0][0] == 2) & (arr[1][1] == 2) & (arr[2][2] == 2) | (arr[0][2] == 2) & (arr[2][0] == 2) & (arr[1][1] == 2)) {
            System.out.println("Выйграл второй игрок");
            initGameBoy();
        }
    }

    private void checkwin() {
        checkwinX();
        checkwinY();
    }

    private void checkDrow() {
        int sum = 0;

        for (x = 0; x < arr.length; x++) {
            for (y = 0; y < arr.length; y++) {

                if (arr[x][y] != 0) {
                    sum += 1;
                }
            }
        }
        if(sum==9){
            System.out.println("Ничья");
            initGameBoy();
        }
    }
    private void checkDirtyPlay(){
        if((arr[x][y]==1 & player.equalsIgnoreCase(player0))|( player.equalsIgnoreCase(playerX) & arr[x][y]==2))
        {
            System.out.println("Эта клетка уже выбрана");
            arr[x][y] = player.equalsIgnoreCase(playerX) ? 2 : 1;

            player = player.equals(playerX) ? playerX : player0;}
            else{arr[x][y] = player.equalsIgnoreCase(playerX) ? 1 : 2;

            player = player.equals(playerX) ? player0 : playerX;}


    }




    }












