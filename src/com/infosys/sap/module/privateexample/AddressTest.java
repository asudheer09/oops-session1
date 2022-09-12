package com.infosys.sap.module.privateexample;

 class Address {
    private int doorNo;
    private String street;
    private String village;
    private String city;
    private String country;
    private long pincode;

     public int getDoorNo() {
         return doorNo;
     }

     public void setDoorNo(int doorNo) {
         this.doorNo = doorNo;
     }

     public String getStreet() {
         return street;
     }

     public void setStreet(String street) {
         this.street = street;
     }

     public String getVillage() {
         return village;
     }

     public void setVillage(String village) {
         this.village = village;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public String getCountry() {
         return country;
     }

     public void setCountry(String country) {
         this.country = country;
     }

     public long getPincode() {
         return pincode;
     }

     public void setPincode(long pincode) {
         this.pincode = pincode;
     }

     /*public Address(int doorNo, String street, String village, String city, String country, long pincode) {
         this.doorNo = doorNo;
         this.street = street;
         this.village = village;
         this.city = city;
         this.country = country;
         this.pincode = pincode;
     }*/
 }

public class AddressTest{
    public static void main(String[] args) {
        Address a= new Address();
        a.setDoorNo(123); //setDoorNo()
        a.setCity("hyd");
        a.setCountry("india");
        a.setPincode(123455);
        a.setVillage("old city"); //setVillage
        System.out.println(a.getDoorNo()); //getDoorNo()
        System.out.println(a.getCity());
        System.out.println(a.getCountry());
        System.out.println(a.getPincode());
        System.out.println(a.getVillage()); //getVillage


    }


}

