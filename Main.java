package com.company;

import java.util.Scanner;

public class Main {

    /*
   write a program to calculate the product for two squared matrices

    |5   6   10|        |1   2   0 |       |65   180  190|
    |20  0   1 |  *     |10  20  30|  ===> |20   45   1  |
    |2   3   0 |        |0   5   1 |       |32   64   90 |

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix size ");
        int size = input.nextInt();
        int sum=0;
        int [][] x = new int[size][size];
        int [][] y = new int[size][size];
        int [][] z = new int[size][size];

        System.out.println("Enter the matrix X elements ");
        for (int row=0; row<size; row++){
            for (int col=0; col<size; col++){
                System.out.print("Enter the row number #"+(row+1)+" and the column number  #"+(col+1));
                x[row][col]= input.nextInt();
            }
        }
        System.out.println("Enter the matrix Y elements ");
        for (int row=0; row<size; row++){
            for (int col=0; col<size; col++){
                System.out.print("Enter the row number #"+(row+1)+" and the column number  #"+(col+1));
                y[row][col]= input.nextInt();
            }
        }
        /*for (int i=0; i<size; i++){
            for (int j=0; j<size; j++) {
                int sum=0;
                sum +=x[i][j]*y[j][i];
                z[i][j]=sum;
            }
        }*/

        for (int row=0; row<size; row++){
            for (int col=0; col<size; col++){
                for (int i=0; i<size; i++){
                    sum+= x[row][i]*y[i][col];
                }
                z[row][col]=sum;
                sum=0;
            }
        }
        for (int row=0; row<size; row++) {
            System.out.println("\n______________________");
            for (int col = 0; col < size; col++) {
                System.out.print(z[row][col]+"\t\t");
            }
        }

            }
}
