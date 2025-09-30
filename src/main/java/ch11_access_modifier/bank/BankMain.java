package ch11_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank account1 = new Bank();
        account1.setAccountNum(123456);
        account1.setAccountHolder("홍길동");
        account1.setBalance(100000);
        account1.setPinNumber(1234);

        Bank account2 = new Bank();
        account2.setAccountNum(987654);
        account2.setAccountHolder("신사임당");
        account2.setBalance(500000);
        account2.setPinNumber(9876);

        account1.showAccountInfo();
        account2.showAccountInfo();
        System.out.println();

        System.out.println("account1 에 대한 입출금");
        account1.deposit(50000, 1234);
        account1.withdraw(200000, 1234);
        account1.withdraw(100000, 1234);

        System.out.println();
        System.out.println("account2 에 대한 입출금");
        account2.withdraw(100000, 9876);
        account2.deposit(200000, 9876);

        System.out.println();
        System.out.println("최종 계좌 정보");
        account1.showAccountInfo();
        account2.showAccountInfo();


        // 잔액이 마이너스인 계좌 객체를 생성하는 방법
        Bank account3 = new Bank(135791, "김사", -3000, 1357);
        account3.showAccountInfo();
    }
}
