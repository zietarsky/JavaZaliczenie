package devices;

import java.util.ArrayList;

public class Phone extends Device {
    public Phone(String model, String producer, Integer yearOfProduction) {
        super();

    }
    static final String DEFAULT_APP_SERVER = "192.169.12.34";
    static final String DEFAULT_APP_PROTOCOL = "HTTP";
    static final Double DEFAULT_APP_VERSION = 3.1;


    public void installAnApp(String appName){
        System.out.println("Aplikacja "+appName+" została zainstalowana!");
    }

    public void installAnApp(String appName, Double versionOfAnApp){
        System.out.println("Aplikacja "+appName+" w wersji "+versionOfAnApp+" została zainstalowana!");
    }

    public void installAnApp(String appName, Double versionOfAnApp, String serverAddress){
        System.out.println("Aplikacja "+appName+" w wersji "+versionOfAnApp+" pobrana z serwera o adresie: "+serverAddress+" została zainstalowana!");
    }

    public void installAnApp(ArrayList lista) {
        System.out.println("Aplikacje: "+lista+" zostały zainstalowane");
    };

    @Override
    public void turnOn() {}

    @Override
    public String toString() {
        return "devices.Phone{}";
    }
}
