public class Config {
    private static Config instance;
    private static String key = "llave";

    public static Config getInstance(){
        if (instance==null) {
            instance = new Config();
        }
        return instance;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String k) {
        key = k;
    }

}
