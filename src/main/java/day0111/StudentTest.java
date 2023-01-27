//package day0111;
//
//import util.ScannerUtil;
//
//import java.util.Scanner;
//
//public class StudentTest {
//    public static Scanner sc = new Scanner(System.in);
//        public static Student[] arr = new Student[0];
//
//    public static void main(String[] args) {
//
//
//        while(true) {
//            String message = "1. 입력 2. 출력 3. 종료";
//            int userChoice = ScannerUtil.nextInt(sc, message);
//
//            if(userChoice == 1) {
//                insertInfo();
//
//            } else if(userChoice == 2) {
//
//            } else if(userChoice == 3){
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//        }
//    }//main
//
//    public static void insertInfo(){
//        day0111.Student s = new day0111.Student();
//         arr = add(arr,s);
//    }
//
////    public static day0111.Student[] add(day0111.Student[] array, day0111.Student element) {
//    public static day0111.Student[] add(day0111.Student[] array, day0111.Student element) {
//        day0111.Student[] temp = new day0111.Student[size(array) + 1];
//        for (int i = 0; i < size(array); i++) {
//            temp[i] = get(array, i);
//        }
//        temp[size(array)] = element;
//
//        insertStudent();
//
//
//        return temp;
//    }
//
//
//    public static void insertStudent(){
////        int index = findNextIndex();
////        if (index == -1) {
////            moveElement();
////            index = 4;
////        }
//        day0110.Student s = new day0110.Student();
//        String message;
//
//        message = "학생의 번호를 입력해주세요.";
////        s.id = ScannerUtil.nextInt(sc, message);
//
//        message = "학생의 이름을 입력해주세요.";
//        s.name = ScannerUtil.nextLine(sc, message);
//
//        message = "학생의 국어 점수를 입력해주세요.";
//        s.kor = ScannerUtil.nextInt(sc, message, 0, SCORE_MAX);
//
//        message = "학생의 영어 점수를 입력해주세요.";
//        s.eng = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);
//
//        message = "학생의 수학 점수를 입력해주세요.";
//        s.math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);
//
//        studentArray[index] = s;
//
//    }
//
//    public static int size(day0111.Student[] array) {return array.length;}
//
//    public static day0111.Student get(day0111.Student[] array, int index) {return array[index];}
//
//
//
//}
