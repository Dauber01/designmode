package com.mine.designmode.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Lucifer
 * @do 测试装饰者改造的输入流的方法
 * @date 2018/07/23 14:36
 */
public class InputTest {

    public static void main(String[] args) throws IOException{
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("com/mine/designmode/decorator/test.txt")));
            while ((c = in.read()) >= 0){
                System.out.println((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
