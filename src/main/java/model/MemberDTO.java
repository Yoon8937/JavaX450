package model;

public class MemberDTO {
    private int id;
    private String username;
    private String password;
    private String nickname;
    private int level;

    public MemberDTO(){}
    public MemberDTO(int id){
        this.id = id;
    }

    public MemberDTO(MemberDTO origin){
        this.id = origin.id;
        this.username = origin.username;
        this.password = origin.password;
        this.nickname = origin.nickname;
        this.level = origin.level;
    }

    public boolean equals(Object obj){
        if(obj instanceof MemberDTO){
            MemberDTO m = (MemberDTO) obj;
            return this.id == m.id;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
