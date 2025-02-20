package extends1.overriding;

public class ElectricCar extends Car {

    //없어도 아무 문제 없지만 이걸 붙이지 않고 실수로 메서드명에 오타가 생기면
    // CarMain 클래스에서 electricCar.move();를 호출할때 부모 메서드가 호출됨
    // 얘를 붙이면 오버라이드를 했다는 표식을 붙인 것
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }


    public void charge() {
        System.out.println("충전합니다.");
    }
}
