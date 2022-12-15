package hello.core.singleton;

public class SingletonService {
    //static 영역에 객체 1개 생성
    private static final SingletonService instance = new SingletonService();

    //외부에서 인스턴스가 필요하면 위에 생성해둔 스태틱 인스턴스를 반환
    public static SingletonService getInstance() {
        return instance;
    }

    //외부에서 new 연산자로 객체 생성 불가
    private SingletonService() {
    }
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
