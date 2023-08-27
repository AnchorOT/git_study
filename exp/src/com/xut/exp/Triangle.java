package com.xut.exp;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public  Triangle()
    {
        this(0,0,0);
    }
    public Triangle(double side1,double side2,double side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getC()
    {
        return (side3+side2+side1);
    }
    public double getS()
    {
        double s=getC()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public boolean Istrianglevalid()
    {
        if(side1+side2<=side3||side2+side3<=side1||side3+side1<=side2)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Triangle s1=new Triangle(3,4,5);
        if(!s1.Istrianglevalid())System.out.println("该三角形不合法");
        Triangle s2=new Triangle(7,8,9);
        if(!s2.Istrianglevalid())System.out.println("该三角形不合法");
        Triangle s3=new Triangle(1,2,3);
        //if(!s3.Istrianglevalid()){
        //System.out.println("该三角形不合法");
        //边长1，2，3构不成三角形
        //}
        System.out.print("边长为3，4，5的三角形:"+"\n");
        System.out.print("周长"+s1.getC()+"\n");
        System.out.print("面积:"+s1.getS()+"\n");
        System.out.print("边长为7，8，9的三角形:"+"\n");
        System.out.print("周长"+s2.getC()+"\n");
        System.out.print("面积:"+s2.getS()+"\n");
    }
}
