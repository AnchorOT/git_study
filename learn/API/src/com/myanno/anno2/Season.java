package com.myanno.anno2;

public enum Season {
    //如果枚举类中有抽象方法   那在枚举项中全部要重写
    SPRING("春"){
        @Override
        public void show() {
            System.out.println(this.name());
        }
    },
    SUMMER("夏"){
        public void show() {
            System.out.println(this.name());
        }
    },
    AUTUMN("秋"){
        public void show() {
            System.out.println(this.name());
        }
    },
    WINTER("冬"){
        public void show() {
            System.out.println(this.name());
        }
    };
    public String name;

     private Season(){}

    Season(String name) {
        this.name = name;
    }
    public abstract void show();
}
