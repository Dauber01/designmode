package com.mine.designmode.decorator;

import java.io.*;

/**
 * @author Lucifer
 * @do inputstream的装饰者装饰后的类
 * @date 2018/07/23 14:28
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    @Override
    public int read() throws IOException{
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException{
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

}
