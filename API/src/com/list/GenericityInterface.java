package com.list;

public class GenericityInterface {
    public static void main(String[] args) {
genericityzimpl<String> genericity=new genericityzimpl<>();
genericity.methood("111");
genericityzimpl1 genericityzimpl1= new genericityzimpl1();
genericityzimpl1.methood(11);
    }
}
interface genericity<E>{
    public abstract void methood(E e);
}
class genericityzimpl<E> implements genericity<E>{

    @Override
    public void methood(E e) {
        System.out.println(e);
    }
}
class genericityzimpl1<Interger> implements genericity<Interger> {

    @Override
    public void methood(Interger interger) {
        System.out.println(interger);
    }
}
