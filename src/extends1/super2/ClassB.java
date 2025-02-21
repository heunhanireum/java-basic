package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a, 0); //부모 생성자가 기본 생성자면 생략 가능, this(내 클래스 다른 생성자)나 super 둘중에 하나 선택할 수 있음
        //밑에있는 생성자 호출할때 super가 호출됨. this로 타고타고 가도 한번은 super가 호출된다는 소리
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
