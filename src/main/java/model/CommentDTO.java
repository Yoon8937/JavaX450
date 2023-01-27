package model;

public class CommentDTO {
    private int id;
    private String comment;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CommentDTO){
            CommentDTO c = (CommentDTO) obj;
            return this.id == c.id;
        }
        return false;
    }

    public CommentDTO(){}
    public CommentDTO(CommentDTO origin){
        id = origin.id;
        comment = origin.comment;
    }
    public CommentDTO(int id) { this.id = id; }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
