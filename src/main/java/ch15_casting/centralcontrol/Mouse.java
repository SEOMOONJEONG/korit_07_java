package ch15_casting.centralcontrol;

public class Mouse implements Power{

    @Override
    public void on() {
        System.out.println("마우스의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스의 전원을 끕니다.");
    }
    // downcasting에 앞서 고유 메서드들 하나씩 정의하겠습니다.
    public void leftClick() {
        System.out.println("마우스 왼쪽 클릭");
    }
}
