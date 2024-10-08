package config;

public class Configuration {
    public static String LOGIN = System.getenv().get("APPLINE_LOGIN");

    public static String PASSWORD = System.getenv().get("APPLINE_PASSWORD");

}
