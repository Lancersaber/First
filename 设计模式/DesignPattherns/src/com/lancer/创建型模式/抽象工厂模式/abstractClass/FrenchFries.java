package com.lancer.创建型模式.抽象工厂模式.abstractClass;

public abstract class FrenchFries extends AbstractBaseFood implements IFood{

    public void printMessage(){
        System.out.println("--"+this.kind+"风味薯条,\t单价："+this.price+",\t数量:"+this.num+", \t 合计:"+this.totolPrice());
    }
}
