package day0111;

import util.ScannerUtil;

import java.util.Scanner;

public class BulletinBoard {
    public static final int ARR_LEN = 5;
    public static Scanner sc = new Scanner(System.in);
    public static BoardList[] arr = new BoardList[ARR_LEN];

    public static void main(String[] args) {
        System.out.println("======= 게시판 프로그램 =======");

        while (true) {
            String message = "1. 게시글 작성 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(sc, message);

            if (userChoice == 1) {
                insertWriting();
            } else if (userChoice == 2) {
                printBordList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다. 게시판을 종료합니다.");
                break;
            }
        }


    }// main


    public static void printBordList(){//게시판 출력메서드
        if(findNextIndex() == 0){
            System.out.println("아직 아무 게시글이 없네영.");
        } else {
            for(int i=0;i<ARR_LEN;i++){
                if(arr[i] == null){
                    break;
                } else {
                    BoardList b = arr[i];
                    System.out.println("=======================게시판=======================");
                    System.out.println("제목 : "  + b.title);
                    System.out.println("번호 : "  + b.numofBoard);
                    System.out.println("작성자 : " + b.Writer);
                    System.out.println("내용: "   + b.contents);

                }
            }
        }

    }



    public static void insertWriting() {
        int index = findNextIndex();
        if (index == -1) {
//            moveElement();
            index = 4;
        }
        BoardList b = new BoardList();
        String message;

        message = "게시글 제목를 입력해주세요.";
        b.title = ScannerUtil.nextLine(sc, message);

        message = "글번호를 입력해주세요.";
        b.numofBoard = ScannerUtil.nextInt(sc, message);

        message = "작성자를 입력해주세요.";
        b.Writer = ScannerUtil.nextLine(sc, message);

        message = "내용을 입력해주세요.";
        b.contents = ScannerUtil.nextLine(sc, message);

        arr[index] = b;
    }

    public static int findNextIndex() {
        for (int i = 0; i < ARR_LEN; i++) {
            if (arr[i] == null) {
                return i;
            }
        }
            return -1;
    }

    public static void moveElement() {
        for(int i=0;i<ARR_LEN-1;i++){
            arr[i] = arr[i+1];
        }
    }


}
