package com.lancer.创建型模式.原型模式;

public class test {
    /**
     * 原型设计模式(Prototype Pattern),用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象
     *
     * 这一章要讲的是创建型模式中一种比较特殊的模式--原型模式，这个模式有个最大的特点就是克隆一个现有的对象，这个
     * 克隆的结果有两种，一种是浅复制，另一种是深复制。我们通过原型模式可以快速地创建一个对象而不需要提供专门的new()操作，
     * 这无疑是一种非常有效的方式，可以快速地创建一个新的对象
     *
     *      原型模式的核心是一个clone方法，通过这个方法进行对象的复制，在java中，提供了一个Cloneable接口来标识这个对象是可复制的，
     * 为什么说是“标示”呢？查看Cloneable源码可以看到这个接口中一个方法都没有，这个接口的作用就是一个标识，只有实现这个接口的
     * 对象才有可能被复制！
     *
     * 在使用原型设计模式时，需要注意以下几个事项
     * 1、克隆对象时对象的构造方法并不执行
     * 为什么呢》原因很简单，在使用Object类的clone方法时，是从内存中直接复制二进制流，重新分配内存块给克隆对象，所以
     * 构造方法不被执行也在情理之中。
     */
}
