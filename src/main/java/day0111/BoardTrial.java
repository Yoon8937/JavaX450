//package day0111;
//
//import util.ScannerUtil;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class BoardTrial {
//
//    public static Scanner sc = new Scanner(System.in);
//    public static Board[] arr = new Board[0];
//    public static int nextId = 1;
//    public static int nextIndex = 0;
//
//
//    public static void main(String[] args) {
//
//
//        while(true) {
//            String message = "1. 입력 2. 출력 3. 종료";
//            int userChoice = ScannerUtil.nextInt(sc, message);
//
//            if(userChoice == 1) {
//                writeBoard();
//            } else if(userChoice == 2) {
//                printList();
//            } else if(userChoice == 3){
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//    }//main
//
//    public static void printList(){
//        if (findEmptyIndex() == 0) {
//            System.out.println("아직 작성된 게시글이 없습니다.");
//        } else {
//            for (int i = 0; i < findEmptyIndex(); i++) {
//                System.out.println(arr[i].getId() + ". " + arr[i].getTitle());
//            }
//            String message = "1.수정 2.삭제 3.뒤로가기";
//            int userChoice = ScannerUtil.nextInt(sc, message);
//
//            while (userChoice != 0 && findIndexById(userChoice) == -1) {
//                System.out.println("잘못 입력하셨습니다.");
//                userChoice = ScannerUtil.nextInt(sc, message);
//            }
//
//            if(userChoice == 1){
//
//            } else if(userChoice==2){
//                System.out.println("삭제할 번호를 입력하세요");
//                System.out.println(">");
//                int delNum = sc.nextInt();
//                int index = indexOf(arr, delNum);
//                System.out.println("삭제할 인덱스 : "+index);
//                arr = removeByIndex(arr, index);
//                System.out.println(Arrays.toString(arr));
//
//            }
//
//
//        }
//
//    }
//
//    public static Board[] removeByIndex(Board[] arr, int index){
//        Board[] tmp = new Board[0];
//        for(int i=0;i<arr.length;i++){
//            if(i!=index){
//                tmp =
//            }
//        }
//
//        return tmp;
//    }
//
//
//    public static int indexOf(Board[] array, int element) {
//        for(int i=0;i<arr.length;i++){
//            if(array[element-1] == arr[i]){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//
//
//    public static void writeBoard(){
//        Board b = new Board();
//        String message;
//
//        b.setId(nextId++);
//
//        message = "글의 작성자를 입력해주세요.";
//        b.setWriter(ScannerUtil.nextLine(sc, message));
//
//        message = "글의 제목을 입력해주세요.";
//        b.setTitle(ScannerUtil.nextLine(sc, message));
//
//        message = "글의 내용을 입력해주세요.";
//        b.setContent(ScannerUtil.nextLine(sc, message));
//
////        arr[nextIndex++] = b;
//        arr = add(arr, b);
//    }
//
//    public static Board[] add(Board[] array, Board element) {
//        Board[] temp = new Board[size(array) + 1];
//        for (int i = 0; i < size(array); i++) {
//            temp[i] = get(array, i);
//        }
//        temp[size(array)] = element;
//
//        return temp;
//    }
//
//    public static Board get(Board[] array, int index) {//인덱스의 값을 반환
//        return array[index];
//    }
//
//    public static int size(Board[] array) {
//        return array.length;
//    }
//
//    public static int findEmptyIndex() {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == null) {
//                return i;
//            }
//        }
//        return arr.length;
//    }
//
//    public static int findIndexById(int id) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != null && id == arr[i].getId()) {
//                return i;
//            }
//        }
//
//        return -1;
//    }
//
//
//}
