//package viewer;
//
//import controller.BoardListController;
//import model.BoardListDTO;
//import util.ScannerUtil;
//
//import java.util.Scanner;
//
//public class BoardListViewer {
//    private final Scanner SCANNER;
//    private BoardListController boardListController;
//
//    private BoardListDTO board = null;
//
//    public BoardListViewer(){
//        SCANNER = new Scanner(System.in);
//        boardListController = new BoardListController();
//    }
//
//    public void showIndex(){
//        String message = "1. 입력 2. 목록 보기 3. 종료";
//        while(true) {
//            int userChoice = ScannerUtil.nextInt(SCANNER, message);
//            if (userChoice == 1) {
//                writeBoard();
////                if(logIn != null){
////                    showMenu();
////                }
//
//            } else if (userChoice == 2) {
//                showMenu();
//            } else if (userChoice == 3) {
//                System.out.println("사용해주셔서 감사합니다.");
//                break;
//            }
//        }
//    }
//
//    private void showMenu(){
//        if (boardListController.isempty()) {
//            System.out.println("아직 등록된 글이 존재하지 않습니다.");
//        } else {
//            boardListController.show();
//
//            String message = "상세보기할 글의 번호나 뒤로 가실려면 0을 입력해주세요.";
//            int userChoice = ScannerUtil.nextInt(SCANNER, message);
//
//            while (userChoice != 0 && !boardListController.validateUsername(userChoice)){
//                System.out.println("잘못 입력하셨습니다.");
//                userChoice = ScannerUtil.nextInt(SCANNER, message);
////                b.setId(userChoice);
//            }
//
//            if(userChoice)
//
//        }
//    }
//
//    private void writeBoard(){
//        BoardListDTO b = new BoardListDTO();
//
////        b.setId(nextId++);
//
//        String message;
//
//        message = "글의 작성자를 입력해주세요.";
//        b.setWriter(ScannerUtil.nextLine(SCANNER, message));
//
//        message = "글의 제목을 입력해주세요.";
//        b.setTitle(ScannerUtil.nextLine(SCANNER, message));
//
//        message = "글의 내용을 입력해주세요.";
//        b.setContent(ScannerUtil.nextLine(SCANNER, message));
//
//        boardListController.insert(b);
//    }
//
//
//
//
//
//}
