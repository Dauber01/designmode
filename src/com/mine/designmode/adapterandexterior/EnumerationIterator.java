package com.mine.designmode.adapterandexterior;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Lucifer
 * @do 早期枚举实现和当代迭代器的适配器
 * @date 2018/07/30 15:03
 */
public class EnumerationIterator implements Iterator {

    Enumeration enumeration;

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
