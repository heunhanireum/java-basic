package poly.ex3;

//추상 메서드가 하나라도 있으면 추상 클래스로
public abstract class AbstractAnimal {

    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
