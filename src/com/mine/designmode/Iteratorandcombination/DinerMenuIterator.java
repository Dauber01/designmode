package com.mine.designmode.Iteratorandcombination;

import java.util.Iterator;

/**
 * @author Lucifer
 * @do 晚餐厅的迭代器
 * @date 2018/08/02 20:53
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;

    int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        if (position >= items.length || items[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw new IllegalStateException("I can't remove all item util you've done at least one next()");
        }
        if (items[position - 1] != null){
            for (int i = position - 1; i < (items.length - 1); i++){
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
