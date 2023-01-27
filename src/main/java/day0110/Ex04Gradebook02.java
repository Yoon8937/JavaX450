package day0110;

import util.ScannerUtil;

import java.util.Scanner;

public class Ex04Gradebook02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s="";
//        String input="";
//
//        while(true) {
//            System.out.println("ip 또는 op을 입력하세요. 종료는 0을 입력하세요");
//            input = sc.next();
//            if(input.equals("0")){
//                System.out.println("종료합니다.");
//                break;
//            }
//
//            if (input.equals("ip")) {
//                System.out.println("학생 정보를 입력하세요 ");
//                s = sc.next();
////            } else if(input == "op"){
//            } else if(input.equals("op")){
//                System.out.println("마지막 정보는 "+ s +" 입니다.");
//            }
//        }


        Student s = new Student();
        boolean switchbool = false;
        while (true) {
            String message = "1. 입력 2. 출력 3. 종료";

            int userChoice = ScannerUtil.nextInt(sc, message);

            if (userChoice == 1) {
                insertInfo(sc, s);
                switchbool = true;
            } else if (userChoice == 2) {
                if (switchbool) {
                    printInfo(s);
                } else {
                    System.out.println("아직 아무 입력이 있지 않아용~ ");
                    continue;
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }


        sc.close();

    }

    public static void insertInfo(Scanner sc, Student s){
        String message;

        message = "학생의 번호를 입력해주세요.";
        s.id = ScannerUtil.nextInt(sc, message);

        message = "학생의 이름을 입력해주세요.";
        s.name = ScannerUtil.nextLine(sc, message);

        message = "학생의 국어 점수를 입력해주세요.";
        s.kor = ScannerUtil.nextInt(sc, message, 0, 100);

        message = "학생의 영어 점수를 입력해주세요.";
        s.eng = ScannerUtil.nextInt(sc, message, 0, 100);

        message = "학생의 수학 점수를 입력해주세요.";
        s.math = ScannerUtil.nextInt(sc, message, 0, 100);



    }

    public static void printInfo(Student s){
        System.out.printf("번호: %d번 이름: %s\n", s.id, s.name);
        System.out.printf("국어: %d점 영어: %d점 수학: %d점\n", s.kor, s.eng, s.math);
        System.out.printf("총점: %d점 평균: %.2f점\n", calculateSum(s), calculateAvg(s));
    }

    public static  int calculateSum(Student s){ return s.kor + s.eng + s.math; }
    public static  double calculateAvg(Student s){ return (double)calculateSum(s) / 3; }



}
