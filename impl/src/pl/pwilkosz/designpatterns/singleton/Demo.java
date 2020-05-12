package pl.pwilkosz.designpatterns.singleton;

public class Demo {
    public static void main(String[] argc){
        PrinterStream ps1 = PrinterStream.getInstance();
        PrinterStream ps2 = PrinterStream.getInstance();

        System.out.println(ps1 == ps2);

        ps1.setIpAddress("127.0.0.1");

        System.out.println(ps1.getIpAddress() + " " + ps2.getIpAddress());
    }
}
