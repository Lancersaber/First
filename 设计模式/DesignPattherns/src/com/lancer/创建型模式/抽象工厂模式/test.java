package com.lancer.创建型模式.抽象工厂模式;

public class test {
    /**
     * 抽象工厂模式提供了一个接口，用于创建相关或者依赖对象的家族，而不需要指定具体实现类。
     *
     * 设计原则
     * 1、多用对象组合，少用继承
     *      所谓对象组合，就是让对象作为类的成员变量，通过构造函数或者set方法给类对象的实例变量赋值。
     * 抽象工厂模式告诉我们要多用对象组合，少用继承。
     *
     * 2、针对抽象编程，不针对实现编程
     *      当设计一个软件系统的时候，要尽可能地对系统中出现的各种事物进行抽象，从而建立基础的抽象底层，这样做的目的
     *  就是让软件结构更加架构化、系统化，系统结构更加灵活，易维护、易扩展。然而，抽象并不是一件容易的事。这需要我们
     *  多多实践，在开发实践中多积累经验，掌握抽象的技巧。
     *
     *  3、产品对象通过工厂暴露的方法创建。（重要）
     *      我们说在任何一个软件系统中至少存在两个对象，并且至少有两个对象之间存在着某种关系。稍有不慎就会造成对象中嵌套对象
     * new关键字泛滥的情况，这时就会造成对象之间的“耦合”，也就是实例对象之间的依赖程度很高，一个对象的改变会造成与之关联对象的
     * 变化，从而无法符合原来设计的要求，因此造成的软件系统修改维护的成本是无法估计的。要避免这种情况出现，尽量避免在对象实例中
     * 使用new关键字创建其他实例。抽象工厂模式对于对象解耦方面是显而易见的，在客户类Customer中，没有使用创建对象实例的语句，而是
     * 调用抽象工厂暴露的方法获得对象实例，创建具体对象实例的工作全部都是在具体工厂中实现的。
     *
     *
     * （重要）抽象工厂和工厂方法的比较
     *      首先，抽象工厂模式和工厂方法模式都是工厂模式，这一点是毋庸置疑的。它们都实现了将应用程序从特定的实现类中解耦，然而，
     * 这两种设计存在以下几个重要的区别：工厂方法模式通过继承的方式实现应用程序的解耦，而抽象工厂模式则通过对象组合的方式实现应用
     * 程序解耦；工厂方法模式用来创建一个抽象产品，具体工厂实现工厂方法来创建具体产品，而抽象工厂模式用来创建一个产品家族的抽象类型。
     * 虽然，两种设计模式使用不同的方式实现应用程序的解耦，使用的场合也有所区别，但二者还是有联系的。...
     */
}
