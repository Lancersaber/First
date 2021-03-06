package com.lancer.结构型模式.适配器模式;

public class test {
    /**
     * 模式定义
     *
     *      适配器模式(Adapter Pattern)，把一个类的接口变换成客户端所期望的另外一种接口，从而使原本因接口不匹配而
     * 无法在一起工作的两个类能够在一起工作，又称为转换器模式、变压器模式。
     *
     * 存在两种适配器模式：
     * 1）对象适配器模式---在这种适配器模式中，适配器容纳一个它包裹的类的实例。
     * 2）类适配器模式---在这种适配器模式下，适配器继承自己实现的类。
     *
     * 无论哪种适配器，它的宗旨都是：保留现有类所提供的服务，向客户提供接口，以满足客户的期望。即在不改变原有系统的基础上，提供新的接口服务。
     *
     *
     * 设计原则
     * 1、使用对象组合，面向接口和抽象编程
     *      在适配器设计模式中，使用对象组合的方式，以目标接口包装被适配者，这样使得被适配者的任何子类都可以被适配器所使用，提高了软件结构的复用性。(在
     * 本例中被适配者是12V电源，适配器是AdapterPower12)。适配器模式将被适配者和目标接口绑定在一起，而不是和实现进行绑定，这样更利于系统的升级和扩展。也
     * 可以有新的实现，只要它们遵循目标接口的标准即可。
     */
}
