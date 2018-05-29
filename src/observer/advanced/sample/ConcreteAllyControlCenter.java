package observer.advanced.sample;

/**
 * Copyright (C), BiLiu实验室
 * FileName: ConcreteAllyControlCenter
 * 具体目标类
 * @author Sauron
 * @depict
 * @Date: 2018/5/29 23:00
 */
public class ConcreteAllyControlCenter extends AbstractAllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    /**
     * 实现通知方法
     * @param name
     */
    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");

        players.forEach(ally->{

            System.out.println(ally.getName());
            if(!ally.getName().equalsIgnoreCase(name)){
                    ally.help();
             }
        });



    }
}
