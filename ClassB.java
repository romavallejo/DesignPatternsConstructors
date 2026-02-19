public class ClassB {
    public void imprimirMetodoClaseB(){
        Config config = Config.getInstance();
        System.out.println(config);
        System.out.println("llave clase B: "+ config.getKey());
    }
}
