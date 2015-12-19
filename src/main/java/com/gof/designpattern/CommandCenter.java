package com.gof.designpattern;

import com.gof.designpattern.element.MyCollection;
import com.gof.designpattern.visitor.VisitorA;
import com.gof.designpattern.visitor.VisitorB;

/**
 * Created by yl3 on 19.12.15.
 */
public class CommandCenter {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();

        VisitorA visitorA= new VisitorA();
        VisitorB visitorB = new VisitorB();

        myCollection.accept(visitorA);

        System.out.println();
        myCollection.accept(visitorB);
    }
}
