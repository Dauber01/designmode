package com.mine.designmode.template;

/**
 * @author Lucifer
 * @do 鸭子的ben
 * @date 2018/07/31 15:33
 */
public class Duck implements Comparable {

    String name;

    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck)object;
        if (this.weight < otherDuck.weight){
            return -1;
        }else if (this.weight == otherDuck.weight){
            return 0;
        }else {
            return 1;
        }
    }
}
