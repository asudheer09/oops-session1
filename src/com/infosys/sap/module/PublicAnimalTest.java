package com.infosys.sap.module;

class Animal{
    public String animal="elephant";
}
public class PublicAnimalTest {
    public static void main(String[] args) {
        Animal a= new Animal();
        System.out.println(a.animal);
    }
}
