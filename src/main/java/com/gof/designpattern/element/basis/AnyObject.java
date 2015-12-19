package com.gof.designpattern.element.basis;

import com.gof.designpattern.visitor.MyVisitor;

/**
 * Created by yl3 on 19.12.15.
 */
public interface AnyObject {
    void accept(MyVisitor myVisitor);
}
