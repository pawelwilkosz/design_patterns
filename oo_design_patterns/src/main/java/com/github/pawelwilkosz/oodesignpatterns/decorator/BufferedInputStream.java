package com.github.pawelwilkosz.oodesignpatterns.decorator;

public class BufferedInputStream extends FilterInputStream{
    private InputStream stream;

    public BufferedInputStream(InputStream stream){
        this.stream = stream;
    }

    @Override
    public void read() {
        System.out.println("[INFO] read():BufferedInputStream: " + stream.toString());
    }
}
