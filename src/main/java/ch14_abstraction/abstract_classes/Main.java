package ch14_abstraction.abstract_classes;

public class Main {
    public static void main(String[] args) {
        // 4. Main.java로 이동해서 tabletFactory1 객체를 생성하고... 이름 붙일 것
        TabletFactory tabletFactory1 = new TabletFactory();
        tabletFactory1.setName("애플 태블릿 공장");
        // 5. 구글 태블릿 공장으로 수정할 것 → getter를 활용하여
        tabletFactory1.setName("구글 태블릿 공장");
        System.out.println(tabletFactory1.getName() + "으로 변경되었습니다.");
        // 6. 객체명 product("구글 태블릿")을 호출할 것
        tabletFactory1.produce("구글 태블릿");
        // 7. 객체명.manage()를 호출할 것
        tabletFactory1.manage();
        // 8. 객체명.upgrade("구글~ ")를 호출할 것
        tabletFactory1.upgrade("구글 태블릿 10인치 2세대");
        // 9. factory2 객체를 생성할 것
        Factory factory2 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(model + "컴퓨터를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("컴퓨터 공장을 관리합니다.");
            }
        };
        factory2.setName("삼성 컴퓨터 공장");
        factory2.showInfo();
    }
}
