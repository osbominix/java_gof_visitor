package com.gof.designpattern.visitor;

import com.gof.designpattern.element.basis.Airplane;
import com.gof.designpattern.element.basis.Apple;
import com.gof.designpattern.element.basis.Film;

/**
 * Created by yl3 on 20.12.15.
 */
public class VisitorB implements MyVisitor {

    public void visit(Airplane airplane) {
        System.out.println("Control an airplane.");
    }

    public void visit(Apple apple) {
        System.out.println("Draw an apple.");
    }

    public void visit(Film film) {
        System.out.println("Write a comment for a film.");
    }
}
