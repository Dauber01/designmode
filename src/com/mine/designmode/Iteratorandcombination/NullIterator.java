package com.mine.designmode.Iteratorandcombination;

import java.util.Iterator;

/**
 * @author Lucifer
 * @do 空迭代器
 * @date 2018/08/03 11:12
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
