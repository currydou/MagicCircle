package com.shadev.pierrebeziercircle.qq;

/**
 * Created by next on 2018/8/3.
 */

public class Circle {


    private float mRadius;
    private float mX;
    private float mY;


    public Circle(){

    }

    public Circle(float x,float y, float radius){
        this.mRadius = radius;
    }

    public float getX(){
        return this.mX;
    }
    public void setX(float x){
        this.mX = x;
    }
    public float getY(){
        return this.mY;
    }
    public void setY(float y){
        this.mY = y;
    }

    public float getRadius() {
        return this.mRadius;
    }

    public void setRadius(float radius) {
        this.mRadius = radius;
    }
}