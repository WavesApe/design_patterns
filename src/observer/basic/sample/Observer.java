package observer.basic.sample;

/**
 * Observer（观察者）：观察者将对观察目标的改变做出反应，观察者一般定义为接口，
 * 该接口声明了更新数据的方法update()，因此又称为抽象观察者。
 */
/**
 * Copyright (C), BiLiu实验室
 * FileName: Observer
 * 观察者
 * @author Sauron
 * @depict
 * @Date: 2018/5/29 22:53
 */
public interface Observer {
    //声明响应方法
    public void response();
}
