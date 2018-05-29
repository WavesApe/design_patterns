package observer.basic.sample;

import java.util.ArrayList;
import java.util.List;


/**
 * 定义一个抽象目标类 Subject  （可以称他为宏观目标类）
 * Subject（目标）：目标又称为主题，它是指被观察的对象。在目标中定义了一个观察者集合，
 * 一个观察目标可以接受任意数量的观察者来观察，它提供一系列方法来增加和删除观察者对象，
 * 同时它定义了通知方法notify()。目标类可以是接口，也可以是抽象类或具体类。
 */
/**
 * Copyright (C), BiLiu实验室
 * FileName: Subject
 * 抽象目标类
 * @author Sauron
 * @depict
 * @Date: 2018/5/29 22:53
 */
abstract class Subject {
    /**
     * 定义一个观察者集合用来存储所有观察者的对象
     */
    protected List<Observer> observers =  new ArrayList<>();

    /**
     * 往观察者集合中添加一个观察者
     * @param observer
     */
    public void addObserver(Observer observer){
        boolean add = observers.add(observer);
    }

    /**
     * 删除一个观察者
     */
    public void delete(Observer observer){

        observers.remove(observer);
    }

    /**
     * 声明一个抽象通知方法
     */
    abstract void notice();

}
