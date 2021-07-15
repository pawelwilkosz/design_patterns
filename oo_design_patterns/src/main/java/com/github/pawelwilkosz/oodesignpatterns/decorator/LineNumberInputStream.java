package com.github.pawelwilkosz.oodesignpatterns.decorator;

public class LineNumberInputStream extends FilterInputStream{
    private InputStream stream;

    public LineNumberInputStream(InputStream stream){
        this.stream = stream;
    }

    @Override
    public void read() {
        System.out.println("[INFO] read():BufferedInputStream: " + stream.toString());
    }
}
