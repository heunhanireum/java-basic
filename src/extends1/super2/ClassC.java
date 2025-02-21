package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); //부모 생성자가 기본 생성자가 아니면 super를 직접 정의해줘야함
        System.out.println("ClassC 생성자");
    }
}
