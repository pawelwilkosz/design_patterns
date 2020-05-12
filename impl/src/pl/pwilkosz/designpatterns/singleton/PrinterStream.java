package pl.pwilkosz.designpatterns.singleton;

public class PrinterStream {
    private static PrinterStream INSTANCE;
    private String ipAddress;
    private String name;

    private PrinterStream(){
    }

    public static PrinterStream getInstance(){
        if(INSTANCE == null){
            INSTANCE = new PrinterStream();
        }

        return INSTANCE;
    }

    public String getIpAddress(){
        return INSTANCE.ipAddress;
    }

    public void setIpAddress(String ipAddress){
        INSTANCE.ipAddress = ipAddress;
    }

    public String getName(){
        return INSTANCE.name;
    }

    public void setName(String name){
        INSTANCE.name = name;
    }
}
