package org.example;

import lombok.*;

@AllArgsConstructor
@Builder
@ToString
@Data
public class Person {
    private String name;
    double height;
    private double weight;

//    private Person(Person builder) {
//        this.name = builder.name;
//        this.height = builder.height;
//        this.weight = builder.weight;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }

    //    public static class Builder {
//
//        private String name;
//        private double height;
//        private double weight;
//
//        public Builder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Builder height(double height) {
//            this.height = height*0.01;
//            return this;
//        }
//
//        public Builder weight(double weight) {
//            this.weight = weight;
//            return this;
//        }
//
//        public Person build() {
//            return new Person(this);        // 이 this는 Builder 클래스의 인스턴스에 해당합니다.
//        }
//
//    }


}

