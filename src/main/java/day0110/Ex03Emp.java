package day0110;

import util.ScannerUtil;

import java.util.Scanner;

public class Ex03Emp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
//        e.num = inputNum(sc);
//        e.name = inputName(sc);
//        e.job = inputjob(sc);
//        e.dept = inputdept(sc);
//        e.salary = inputSal(sc);
//        print(e.id, e.name, e.job, e.dept, e.salary);
//        sc.close();

        insertInfo(sc, e);
        sc.close();


    }

//    static void print(int id, String name, String job, String dept, int sal) {
//        System.out.printf("사원 번호 : %d%n사원 이름 : %s%n사원 직급 : %s%n사원 부서 : %s%n사원 연봉 : %d%n",
//                id, name, job, dept, sal);
//    }

    public static void  insertInfo(Scanner sc, Employee e) {
        String msg;

        msg = "사원 번호를 입력해주세요.";
        e.id = ScannerUtil.nextInt(sc, msg);

        msg = "사원 이름을 입력해주세요.";
        e.name = ScannerUtil.nextLine(sc, msg);

        msg = "사원 직급 입력해주세요.";
        e.job = ScannerUtil.nextLine(sc, msg);

        msg = "사원 부서를 입력해주세요.";
        e.dept = ScannerUtil.nextLine(sc, msg);

        msg = "사원 연봉을 입력해주세요.";
        e.salary = ScannerUtil.nextInt(sc, msg);

        printInfo(e);

    }

    public static void printInfo(Employee e){

        System.out.printf("사원 번호 : %d%n사원 이름 : %s%n사원 직급 : %s%n사원 부서 : %s%n사원 연봉 : %d%n",
                e.id, e.name, e.job, e.dept, e.salary);
    }


}


