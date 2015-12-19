package com.gof.designpattern.element.basis;

import com.gof.designpattern.visitor.MyVisitor;

/**
 * Created by yl3 on 19.12.15.
 */
public class Film implements AnyObject {
    public void accept(MyVisitor myVisitor) {
        myVisitor.visit(this);
    }
}
