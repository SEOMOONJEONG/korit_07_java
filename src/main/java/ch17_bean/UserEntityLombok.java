package ch17_bean;

import lombok.Data;

// 여기에 애너테이션을 달면 class level
@Data
public class UserEntityLombok {
    // 여기에 달면 field level
    /*
        @Setter
        private int password;   // password 만  setter 적용
     */
    private int username;
    private int password;
    private String email;
    private String name;
}
