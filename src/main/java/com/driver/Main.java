package com.driver;

public class Main {
  public static class A {
    public String meth(){
            return "Invoking method from class A";
    }
}
public static class B extends A {
  @Override
  public String meth() {
      // TODO Auto-generated method stub
      return "Method is overridden in Extendend class B";
  }
}

  public static void main(String[] args) {
    B b=new B();
    System.out.println(b.meth());
  }
}