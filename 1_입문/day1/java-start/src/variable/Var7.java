package variable;

public class Var7 {
    public static void main(String[] args) {
        // 자주 사용하는 type
        // 정수 - int, long / 파일 다룰 때는 - byte
        // 실수 - double
        // 불린형 - boolean
        // 문자열 - String

        int a = 100; // 정수 리터럴
        double b = 10.5; // 실수 리터럴
        boolean c = false ; // 불리언(Boolean) 리터럴, true, false 입력 가능
        char d = 'A'; // 문자 하나 리터럴, 하나 이상은 불가
        // 문자 하나를 표현할 일이 거의 없어 String을 주로 사용한다.

        String e = "Hello Java"; // 문자열 리터럴, 문자열을 다루기 위한 특별한 타입, 첫글자 반드시 대문자로 시작
        // String은 문자의 길이에 따라 메모리 사용량이 동적으로 달라진다.

        // type에 맞는 값을 할당해야 함
        // incompatible types: java.lang.String cannot be converted to int
        // int z = "백원";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // 리터럴 (literal)
        // 코드에서 개발자가 직접적은 고정된 값을 프로그래밍 용어로 리터럴(literal)이라고 한다.
        // 변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서, 리터럴 자체는 변하지 않는다.
    }
}
