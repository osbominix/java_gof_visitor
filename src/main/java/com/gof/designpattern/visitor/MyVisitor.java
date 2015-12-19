package com.gof.designpattern.visitor;

import com.gof.designpattern.element.basis.Airplane;
import com.gof.designpattern.element.basis.Apple;
import com.gof.designpattern.element.basis.Film;

/**
 * Created by yl3 on 19.12.15.
 */
public interface MyVisitor {
    void visit(Airplane airplane);
    void visit(Apple apple);
    void visit(Film film);
}
