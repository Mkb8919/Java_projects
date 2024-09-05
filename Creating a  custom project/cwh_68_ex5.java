package com.company;

class Shape{
    int lengh, breadth, radius , height;
    Shape(int length , int breadth, int radius, int height){
        this.lengh = length;
        this.breadth = breadth;
        this.radius = radius;
        this.height = height;
    }

    public int getLengh() {
        return lengh;
    }

    public void setLengh(int lengh) {
        this.lengh = lengh;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
class Rectangle2 extends Shape{
    Rectangle2(int length, int breadth, int height ){
        super(length, breadth,-1,height);
    }
    public int area(){
        return this.lengh * this.breadth;
    }
    public double volume(){
        return this.lengh * this.breadth * this.height;
    }
}
class Square1 extends Shape{
    Square1(int length ){
        super(length, -1,-1,-1);
    }
    public int area(){
        return this.lengh * this.lengh;
    }
}

class Circle2 extends Shape{
    Circle2( int radius ){
        super(-1,-1,radius,-1);
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder2 extends Shape{
   Cylinder2( int radius , int height){
        super(-1,-1,radius,height);
    }
    public double area() {
       return 2 * Math.PI * this.radius * (this.radius + this.height );
    }
    public double volume(){
       return Math.PI * this.radius * this.radius * this.height;
    }
}
class Sphere1 extends  Shape{
    Sphere1( int radius ){
        super(-1,-1,radius,-1);
    }
    public double area(){
        return 4 * Math.PI * this.radius * this.radius;
    }
    public double volume(){
        return (4/3) * Math.PI *  this.radius * this.radius * this.radius;
    }
}
public class cwh_68_ex5{
    public static void main(String[] args) {
//       Sphere1 sp = new Sphere1(6);
//        System.out.println(sp.area());
//        System.out.println(sp.volume());

//        Rectangle2 rec = new Rectangle2(7,9,12);
//        System.out.println(rec.area());
//        System.out.println(rec.volume());

//        Circle2 cr = new Circle2(14);
//        System.out.println(cr.area());

//        Square1 sq = new Square1(32);
//        System.out.println(sq.area());

        Cylinder2 cyl = new Cylinder2(8,6);
        System.out.println(cyl.area());
        System.out.println(cyl.volume());

    }
}