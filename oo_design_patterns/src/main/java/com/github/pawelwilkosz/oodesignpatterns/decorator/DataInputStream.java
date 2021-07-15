package com.github.pawelwilkosz.oodesignpatterns.decorator;

public class DataInputStream extends FilterInputStream{
    private InputStream stream;

    public DataInputStream(InputStream stream){
        this.stream = stream;
    }

    @Override
    public void read() {
        System.out.println("[INFO] read():DataInputStream: " + stream.toString());
    }
}
