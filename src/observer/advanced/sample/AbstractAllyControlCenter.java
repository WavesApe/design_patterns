package observer.advanced.sample;

import java.util.ArrayList;

/**
 * Copyright (C), BiLiu实验室
 * FileName: AbstractAllyControlCenter
 * 目标类抽象类
 * @author Sauron
 * @depict
 * @Date: 2018/5/29 22:53
 */
abstract class AbstractAllyControlCenter {
    /**
     * 战队名称
     */
    protected String allyName;
    /**
     * 定义一个集合用于存储战队成员
     */
    protected ArrayList<Observer> players = new ArrayList<Observer>();


    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }


    /**
     * 注册战队成员方法方法
     */

    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    /**
     * 注销战队成员方法方法
     * @param obs
     */

    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    /**
     * 声明抽象通知方法
     */
    public abstract void notifyObserver(String name);

}
