package day0111;

import util.ScannerUtil;

import java.util.Scanner;

public class BoardTest {
    public static Scanner sc = new Scanner(System.in);
    public static Board[] arr = new Board[0];
    public static int nextId = 1;




    public static void main(String[] args) {


        while(true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(sc, message);

            if(userChoice == 1) {
                writeBoard();

            } else if(userChoice == 2) {
//                System.out.println(Arrays.toString(arr));
                printList();
            } else if(userChoice == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }//main

    public static void printList(){
        if (findEmptyIndex() == 0) {
            System.out.println("아직 작성된 게시글이 없습니다.");
        } else {
            for (int i = 0; i < findEmptyIndex(); i++) {
                System.out.println(arr[i].getId() + ". " + arr[i].getTitle());
            }

            String message = "1.상세보기 2.삭제 3.뒤로가기";
            int userChoice = ScannerUtil.nextInt(sc, message);

            while (userChoice != 0 && findIndexById(userChoice) == -1) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(sc, message);
            }

            if (userChoice == 1 ){
                printOne(userChoice);
            } else if(userChoice == 2){
                System.out.println("몇 번을 삭제할까요?");
                int delNum = sc.nextInt();
                int index = indexOf(arr,delNum);
                System.out.println("삭제할 인덱스 :"+index);
                arr = delete(index);


            }


//            if (userChoice != 0) {
//                printOne(userChoice);
//            }

        }
    }
    public static Board[] delete(int idx){//삭제할 인덱스
        arr[idx] = null;
        Board[] tmp = new Board[arr.length-1];
        tmp = method(tmp,idx);
        return tmp;

    }

    public static Board[] method(Board[] tmp, int idx){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                tmp[i] = arr[i];
            } else if(arr[i]==null){
                break;
            }
        }

        for(int i=idx;i<arr.length-idx;i++){
            tmp[i] = arr[i+1];
        }
        return tmp;
    }


//    public static Board[] removeByIndex(Board[] array, int index) {
//        Board[] temp = new Board[0];
//        for (int i = 0; i < size(array); i++) {
//            if (i != index) {
//                temp = add(temp, get(array, i));
//            }
//        }
//        return temp;
//    }


    public static Board get(Board[] array, int index) {return array[index];}

    public static int indexOf(Board[] array, int element) {
        for (int i = 0; i < size(array); i++) {
            if (arr[element-1] == get(array, i)) {
                return i;
            }
        }

        return -1;
    }

    public static Board[] add(Board[] array, Board element) {
        Board[] temp = new Board[size(array) + 1];
        for (int i = 0; i < size(array); i++) {
            temp[i] = get(array, i);
        }
        temp[size(array)] = element;

        inputInfo(temp[size(array)]);


        return temp;
    }

    public static void printOne(int id){
        if(findIndexById(id) == -1){
            System.out.println("해당 id를 가진 게시글은 존재하지 않습니다.");
        }else {
            arr[findIndexById(id)].printBoard();
            String message = "1. 수정 2.뒤로가기";
            int userChoice = ScannerUtil.nextInt(sc, message);
            if(userChoice == 1){
                update(id);
            } else if(userChoice==2) {
                printList();
            }
        }
    }




    public static void update(int id){
        int index = findIndexById(id);
        arr[index].setTitle(ScannerUtil.nextLine(sc, "새로운 제목을 입력해주세요."));

        arr[index].setContent(ScannerUtil.nextLine(sc, "새로운 내용을 입력해주세요."));

        printOne(id);
    }

    public static int findIndexById(int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && id == arr[i].getId()) {
                return i;
            }
        }

        return -1;
    }


    public static int findEmptyIndex() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return i;
            }
        }
        return arr.length;
    }

    public static void writeBoard(){
        Board b = new Board();
        arr = add(arr,b);

    }



    public static void inputInfo(Board b) {

        String message;

        b.setId(nextId++);

        message = "글의 작성자를 입력해주세요.";
        b.setWriter(ScannerUtil.nextLine(sc, message));

        message = "글의 제목을 입력해주세요.";
        b.setTitle(ScannerUtil.nextLine(sc, message));

        message = "글의 내용을 입력해주세요.";
        b.setContent(ScannerUtil.nextLine(sc, message));

//        arr[nextIndex] = b;
    }

    public static int size(Board[] array) {return array.length;}

}