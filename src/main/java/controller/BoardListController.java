package controller;

import model.BoardListDTO;

import java.util.ArrayList;

public class BoardListController {
    private ArrayList<BoardListDTO> list;
    private int nextId;

    public BoardListController(){
        list = new ArrayList<>();
        nextId = 1;
    }

    public boolean isempty(){
        if(list.size() == 0){
            return true;
        } else {
            return false;
        }
    }

    public void show(){
        for(BoardListDTO b : list){
            System.out.println("번호 : "+b.getId()+" 제목 : "
                    +b.getTitle()+" 작성자 : "+b.getWriter()+" 내용 : "+b.getContent());
        }
    }

    public boolean validateUsername(int id){
        for(BoardListDTO b : list){
            if(id != b.getId()){
                return false;
            }
        }
        return true;
    }



    public void insert(BoardListDTO boardListDTO){
        boardListDTO.setId(nextId++);
        list.add(boardListDTO);
    }

    public BoardListDTO selectById(int id){
        for(BoardListDTO b : list){
            if(b.getId() == id){
                return new BoardListDTO(b);
            }
        }

        return null;
    }

    public void update(BoardListDTO boardListDTO){
        list.set(list.indexOf(boardListDTO), boardListDTO);
    }

    public void delete(int id){
        BoardListDTO b = new BoardListDTO();
        b.setId(id);
        list.remove(b);
//        UserDTO u = new UserDTO();
//        u.setId(id);
//        list.remove(u);
    }

//    public boolean validateUsername(String username){
//        if(username.equalsIgnoreCase("X")){
//            return false;
//        }
//
//        for(UserDTO u : list){
//            if(username.equals(u.getUsername())) {
//                return false;
//            }
//        }
//
//        return true;
//    }

//    public BoardListDTO auth(String username, String password){
//        for(UserDTO u : list){
//            if(username.equalsIgnoreCase(u.getUsername()) && password.equalsIgnoreCase(u.getPassword())){
//                return new UserDTO(u);
//            }
//        }
//
//        return null;
//    }

}
