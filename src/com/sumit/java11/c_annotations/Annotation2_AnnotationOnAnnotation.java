package com.sumit.java11.c_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

//@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.CONSTRUCTOR})
@Target({ElementType.TYPE_USE})
@interface WildCard{

}

public class Annotation2_AnnotationOnAnnotation {

    @WildCard
    int x;

    @WildCard
    static int y;

    void m1(@WildCard int x){
        @WildCard int y = 10;

        var x1 = new @WildCard Annotation2_AnnotationOnAnnotation();

        int n = (@WildCard int) 23.9;
    }



}