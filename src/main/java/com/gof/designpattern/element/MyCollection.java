package com.gof.designpattern.element;

import com.gof.designpattern.element.basis.Airplane;
import com.gof.designpattern.element.basis.AnyObject;
import com.gof.designpattern.element.basis.Apple;
import com.gof.designpattern.element.basis.Film;
import com.gof.designpattern.visitor.MyVisitor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yl3 on 19.12.15.
 */
public class MyCollection implements AnyObject{

    Set<AnyObject> anyObjectSet = new HashSet<AnyObject>();

    public MyCollection() {
        anyObjectSet.add(new Airplane());
        anyObjectSet.add(new Apple());
        anyObjectSet.add(new Film());
    }

    public void accept(MyVisitor myVisitor) {
        for (AnyObject anyObject : anyObjectSet) {
            anyObject.accept(myVisitor);
        }
    }
}
