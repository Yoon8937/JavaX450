package model;

public class BoardListDTO {
    private int id;
    private String title;
    private String writer;
    private String content;

    public boolean equals(Object o){
        if(o instanceof BoardListDTO){
            BoardListDTO b = (BoardListDTO) o;
            return this.id == b.id;
        }
        return false;
    }

    public BoardListDTO(){}
    public BoardListDTO(BoardListDTO origin){
        id = origin.id;
        title = origin.title;
        writer = origin.writer;
        content = origin.content;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
