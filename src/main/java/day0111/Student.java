package day0111;

public class Student {
    private int id;
    private String name;
    private int korean;
    private int english;
    private int math;

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }




    public Student(){
        id = -1;
        name = "아직 없음";
    }

    public void print(){
        System.out.printf("번호: %d번 이름:%s\n", id, name);
        System.out.printf("국어: %d점 영어: %d점 수학: %d점\n", korean, english, math);
        System.out.printf("총점: %d점 평균: %.2f점\n", calculateSum(), calculateAverage());
    }

    public int calculateSum() {
        return korean + english + math;
    }

    public double calculateAverage() {
        return (double)calculateSum() / 3;
    }
    public boolean euquals(Object object){
        if(object instanceof Student) {
            Student s = (Student) object;
            return this.id == s.id;
        }

        return false;
    }

}
