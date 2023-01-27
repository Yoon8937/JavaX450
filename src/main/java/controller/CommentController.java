package controller;

import model.CommentDTO;

import java.util.ArrayList;

public class CommentController {
    private ArrayList<ArrayList<String>> list;
    private int nextId;

    public CommentController(){ //초기화
        list = new ArrayList<ArrayList<String>>(4);
        nextId = 1;//흠..................................보류
        for(int i=0;i<4;i++){
            ArrayList<String> tmp = new ArrayList<String>();
            list.add(tmp);
        }
        System.out.println("리스트 배열의 초기화 한 후입니다."+list.size());
        System.out.println(list);
//        for(int i=0;i<list.size();i++){
//            for(int j=0;i<list.get(i).size();j++){
//                System.out.println(list.get(i).get(j)+" ");
//            }
//        }

//        add(b);
    }

//    public void add(CommentDTO commentDTO,int id){
////        ArrayList<String> tmp = new ArrayList<String>();
//        System.out.println(commentDTO.getComment()+" 이것은 댓글입니다. by add method");
//        list.get(id-1).add(commentDTO.getComment());
//    }
    public void add(CommentDTO commentDTO){
        list.get(commentDTO.getId()-1).add(commentDTO.getComment());
    }

    public void show(CommentDTO commentDTO){
//        System.out.println("모든 댓글을 보여드립니다.");
//        System.out.println(list + "listtttt");
//        System.out.println(list.get(commentDTO.getId()-1));

        int idx = commentDTO.getId()-1;
        for(int i=0;i<list.get(idx).size();i++){
            System.out.printf("%d 댓글 : %s\n", i+1,list.get(idx).get(i));
        }

//        for(int i=0;i<list.size();i++){
//            for(int j=0;i<list.get(i).size();j++){
//                System.out.println(list.get(i).get(j)+" ");
//            }
//        }
    }

    public void showPrev(CommentDTO commentDTO, int id){
        int idx = id - 1;
        if(list.get(idx).size() == 0){
            System.out.println("아직 아무 댓글이 없네요");
        } else {
            for(int i=0;i<list.get(idx).size();i++){
                System.out.printf("%d 댓글 : %s\n", i+1,list.get(idx).get(i));
            }
        }


    }



}
