package PatternProgramming;

import java.util.*;

public class PatternA2K {
    public static void main(String[] args) {
        int n = 8;
//        **************** PROGRAM For letter A ***********************
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) || j == 0 && i > 0 || j == (n - 1) && i > 0 || i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter B ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) || j == 0 || j == (n - 1) && i > 0 && i < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) || j == (n - 1) && i > (n - 1) / 2 && i < n - 1 || i == (n - 1) && j < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter C ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 || j == 0 && i > 0 && i < (n - 1) || i == (n - 1) && j > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter D ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) || i == (n - 1) && j < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter E ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n - 1) || i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter F ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter G ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == (n - 1) || j == (n - 1) && i > (n - 1) / 2 || i == (n - 1) / 2 && j > (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter H ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == (n - 1) / 2 || j == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter I ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter J ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == ((n - 1) / 2) + 3 || i == (n - 1) && j < (n - 1) - 1 || j == 0 && i > (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //        **************** PROGRAM For letter K ***********************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("  * ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

//        ******************** Patten for Letter L

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
//           *********************** Pattern for Letter M **********************************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j - i == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < n; j++) {
                if (j == n - 1 || i + j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
//            **************** Pattern For N Letter *****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j || j == (n - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            //            **************** Pattern For O Letter *****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            //            **************** Pattern For P Letter *****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || i == (n - 1) / 2 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            //            **************** Pattern For Q Letter *****************

            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 && i < (n - 1) || i == 0 && j > 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1)
                        || i == (n - 1) / 2 && j < (n - 1) / 2 || j - i == (n - 1) / 2 && i > (n - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
//            ************************* Pattern for letter R ****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) || j == 0 || j == (n - 1) && i < (n - 1) / 2 && i > 0 || i == (n - 1) / 2 && j < (n - 1) || j == (n - 1) && i > (n - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
//            ***************** Pattern for S letter ****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 && i <= (n - 1) / 2 || i == (n - 1) / 2 || j == (n - 1) && i >= (n - 1) / 2 || i == (n - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            //            ***************** Pattern for T letter ****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            //            ***************** Pattern for U letter ****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == (n - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            //            ***************** Pattern for V letter ****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //            ***************** Pattern for W letter ****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i + j == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //            ***************** Pattern for X letter ****************
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //            ***************** Pattern for Y letter ****************
            System.out.print("   ");
            for (float j = 0; j < n; j++) {
                if ((i / 2) == (j / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //            ***************** Pattern for Z letter ****************
            System.out.print("   ");
            for (float j = 0; j < n; j++) {
                if (i == 0 || i + j == (n - 1) || i == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
