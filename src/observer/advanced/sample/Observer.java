package observer.advanced.sample;

/**
 * Copyright (C), BiLiu实验室
 * FileName: Observer
 * @depict 抽象观察类
 * @author Sauron
 * @Date: 2018/5/29 22:40
 */
public interface Observer {
    /**
     * 获取名字
     * @return
     */
    public String getName();

    /**
     * 赋值名字
     * @param name
     */
    public void setName(String name);

    /**
     * 声明支援盟友方法
     */
    public void help();

    /**
     * 声明遭受攻击方法
     * @param acc
     */
    public void beAttacked(AbstractAllyControlCenter acc);
}
