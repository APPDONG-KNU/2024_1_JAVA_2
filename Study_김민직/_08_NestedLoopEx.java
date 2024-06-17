package Study_김민직;

public class _08_NestedLoopEx {
    public static void diamondUp() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//            *
//           ***
//          *****
//         *******
//        *********
//         *******
//          *****
//           ***
//            *

        // 한 번에 만들기
        for (int i = 0; i < 9; i++) {
            if (i < 5) {
                for (int j = 0; j < 4 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i >= 5) {
                for (int j = 0; j < i - 4; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < -2 * i + 17; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        System.out.println("===================");

        // 케이스 나누기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < -2 * i + 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===================");

        // 메소드 사용해서 만들기

        // 메소드 이용, 한 번에
        diamondUp();
        for (int i = 0; i < 9; i++) {
            if (i >= 5) {
                for (int j = 0; j < i - 4; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < -2 * i + 17; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        System.out.println("===================");

        // 메소드 이용, 케이스 나누기
            diamondUp();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < -2 * i + 7; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
