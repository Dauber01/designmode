package com.mine.designmode.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Lucifer
 * @do 带钩子的咖啡实现
 * @date 2018/07/31 15:13
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping Coffee througn filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
       String answer = getUserInput();

       if (answer.toLowerCase().startsWith("y")){
           return true;
       }else {
           return false;
       }
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n) ?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (IOException ioe){
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }

}
