package day0113;

public class Rabbit implements IAnimal {
    public void makeSound() { //오버라이딩 조건 : 접근제어자가 넓거나 같아야 함
        System.out.println("토끼 토끼");
    }
    public void move(){
        System.out.println("깡총 깡총");
    }
    public void eat(){
        System.out.println("풀을 뜯어먹습니다.");
    }

    public void swim(){
        System.out.println("용궁에 갑니다.");
    }
}