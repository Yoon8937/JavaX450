package day0110;

import util.ScannerUtil;

import java.util.Scanner;


//전역변수(global variable)
public class Ex05GlobalVar {

    public static final Scanner sc = new Scanner(System.in);
    public static final int SUBJECT_SIZE = 3;
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static Student s = null;


    public static void main(String[] args) {
        while(true) {
            String msg = "1.입력 2.출력 3.종료";
            int userChoice = ScannerUtil.nextInt(sc, msg);
            if(userChoice==1){
                s = new Student();
                insertInfo();
            } else if(userChoice==2) {
                if(s !=null){
                    printInfo();
                } else {
                    System.out.println("아직 입력된 학생의 정보가 존재하지 않음.");
                }
            } else if(userChoice==3) {
                System.out.println("종료합니다.");
                break;
            }

        }

        sc.close();
    }

    public static void insertInfo(){//파라메타 안줌. 왜냐 public static Student s = null;으로 상수 전역변수로 선언해 주어서
        Student s = new Student();
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
    public static void printInfo(){
        System.out.printf("번호: %d번 이름: %s\n", s.id, s.name);
        System.out.printf("국어: %d점 영어: %d점 수학: %d점\n", s.kor, s.eng, s.math);
        System.out.printf("총점: %d점 평균: %.2f점\n", calculateSum(), calculateAvg());



    }

    static int calculateSum() {
        return s.math + s.kor + s.eng;
    }

    static double calculateAvg(){
        return (double) calculateSum() / SUBJECT_SIZE;
    }

}


