package com.company;

/**
 * @Description TODO
 * @Date 2020-04-20
 * @Author MaWeiJun
 * @Version 1.0
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void announce();

    String getAction();

    void setAction(String action);
}
