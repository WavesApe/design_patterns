/**
 * Copyright (C), BiLiu实验室
 * FileName: Player
 *
 * @depict 具体观察者
 * @author Sauron
 * @Date: 2018/5/29 22:47
 */
package observer.advanced.sample;

public class Player implements Observer {
    /**
     * 观察者名字
     */
    private String name;

    public Player(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    //支援盟友方法的实现
    @Override
    public void help() {
        System.out.println("坚持住，" + this.name + "来救你！");
    }

    /**
     * 遭受攻击方法的实现，当遭受攻击时将调用战队控制中心类的通知方法notifyObserver()来通知盟友
     * @param acc
     */
    @Override
    public void beAttacked(AbstractAllyControlCenter acc) {
        System.out.println(this.name + "被攻击！");
        acc.notifyObserver(name);
    }


}
