package com.gof.designpattern.visitor;

import com.gof.designpattern.element.basis.Airplane;
import com.gof.designpattern.element.basis.Apple;
import com.gof.designpattern.element.basis.Film;

/**
 * Created by yl3 on 19.12.15.
 */
public class VisitorA implements MyVisitor {
    public void visit(Airplane airplane) {
        System.out.println("Take an airplane to travel around.");
    }

    public void visit(Apple apple) {
        System.out.println("Eat an apple.");
    }

    public void visit(Film film) {
        System.out.println("Watch a film.");
    }
}
