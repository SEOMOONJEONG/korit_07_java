package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

//    public TvRemoteController(PowerButton powerButton,      // 접근지정자 클래스명 객체명 → 여태까지의 작성방법과 다릅니다.
//                              ChannelDownButton channelDownButton,
//                              ChannelUpButton channelUpButton) {
//        this.powerButton = powerButton;
//        this.channelDownButton = channelDownButton;
//        this.channelUpButton = channelUpButton;
//    }


    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeDownButton volumeDownButton,
                              VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }


    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton/*필드*/.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    // onPressedChannelUpButton() 메서드 / onUpChannelUpBuntton() 메서드를 구현하시고
    // Main에서 실행하여
    // 실행 예
    // 채널을 한 칸 올립니다.
    // 채널을 계속 올립니다.

    public void onPressedChannelUpButton(){
        channelUpButton.onPressed();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }



    // 여기서 풀이법이 두 가지로 갈리게 됩니다.
    // # 1
    public String onUpChannelUpButton1(){
        return channelUpButton.onUp();          // onUp();의 결과값이 return "채널을 계속 " + onUp();
    }

    // # 2
    public void onUpChannelUpButton2(){
        System.out.println(channelUpButton.onUp());
    }
    // Volume
    // # 1
    public String onUpVolumeUpButton1() {
        return volumeUpButton.onUp();
    }

    // # 2
    public void onUpVolumeUpButton2() {
        System.out.println(volumeUpButton.onUp());
    }

}
