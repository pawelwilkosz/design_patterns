package com.github.pawelwilkosz.oodesignpatterns.decorator;

public class FileInputStream implements InputStream{
    @Override
    public void read() {
        System.out.println("[INFO] read() method from: " + this.toString());
    }
}
