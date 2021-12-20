package com.github.pawelwilkosz.oodesignpatterns.decorator;

/*
* Decorator solves problem of multiple inheritance
* */
public class Demo {
    public static void main(String[] argc){
        InputStream fs = new FileInputStream();
        fs = new BufferedInputStream(fs);
        fs = new DataInputStream(fs);
        fs = new LineNumberInputStream(fs);
        fs.read();
    }
}
