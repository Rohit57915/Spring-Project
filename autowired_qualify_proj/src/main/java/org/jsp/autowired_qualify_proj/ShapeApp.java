package org.jsp.autowired_qualify_proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ShapeApp {
    @Autowired
    @Qualifier("triangle")  // or "square"
    private Shape shape;

    public void display() {
        shape.sides();
    }
}

