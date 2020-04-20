package com.company;

/**
 * @Description TODO
 * @Date 2020-04-20
 * @Author MaWeiJun
 * @Version 1.0
 */
public abstract class Observer {
    protected String	name;
    protected Subject	sub;

    public Observer(String name, Subject sub)
    {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
