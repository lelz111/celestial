package com.example.demo;

public class HelloRequest {
    private String name;

    public HelloRequest(){

    }

    public HelloRequest(String name) {this.name = name;}

    //getter
    public String getName(){return name;}

    //setter
    public void setName(String name){this.name = name;}

}
