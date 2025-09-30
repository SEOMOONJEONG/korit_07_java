package ch14_abstraction.interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    예를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownButton() / OnDownVolumeDownButton()
    onPressedVolumeUpButton() / OnUpVolumeUpButton() 메서드를 정의하시고
    Main에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다.    #1 으로 푸시오
    음량을 계속 올립니다.    #2 으로 푸시오
 */


public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//
//
//        TvRemoteController tvRemoteController = new TvRemoteController(
//            powerButton, channelDownButton, channelUpButton
//        );
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(), new ModeChangeButton(), new TemperatureDownButton(),
                new TemperatureUpButton());

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
//        TvRemoteController/*클래스명*/ tvRemoteController/*객체명*/ = new TvRemoteController/*클래스명*/(
//                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
//                new VolumeDownButton(), new VolumeUpButton()
//        );  // 생성자
//
//        // 전원을 켭니다.
//        tvRemoteController.onPressedPowerButton();
//
//        System.out.println("-------------------");
//
//        // 채널을 한 칸 내립니다.
//        tvRemoteController.onPressedChannelDownButton();
//        // 채널을 계속 내립니다.
//        tvRemoteController.onDownChannelDownButton();
//        System.out.println();
//        // 채널을 한 칸 올립니다.
//        tvRemoteController.onPressedChannelUpButton();
//        // 채널을 계속 올립니다.
//        // # 1에 대한 Main에서의 실행 방법
//        System.out.println(tvRemoteController.onUpChannelUpButton1());
//        // # 2에 대한 Main에서의 실행 방법
//        tvRemoteController.onUpChannelUpButton2();
//
//        System.out.println("-------------------");
//
//        // 볼륨을 한 칸 내립니다.
//        tvRemoteController.onPressedVolumeDownButton();
//        // 볼륨을 계속 내립니다.
//        tvRemoteController.onDownVolumeDownButton();
//        System.out.println();
//
//        // 볼륨을 한 칸 올립니다.
//        tvRemoteController.onPressedVolumeUpButton();
//        // 볼륨을 계속 올립니다.
//        // # 1에 대한 Main에서의 실행 방법
//        System.out.println(tvRemoteController.onUpVolumeUpButton1());
//        // # 2에 대한 Main에서의 실행 방법
//        tvRemoteController.onUpVolumeUpButton2();
//
        airConditionerController.onPressedPowerButton();

        System.out.println("-------------------");

        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();

        System.out.println("-------------------");

        airConditionerController.onPressedTemperatureUpButton();
        // # 1
        System.out.println(airConditionerController.onUpTemperatureUpButton1());
        // # 2
        airConditionerController.onUpTemperatureUpButton2();

        System.out.println("-------------------");

        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedModeChangeButton();

        System.out.println("-------------------");

        airConditionerController.onPressedPowerButton();



    }
}
