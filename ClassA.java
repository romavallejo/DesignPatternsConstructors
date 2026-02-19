public class ClassA {
    public void imprimirMetodoClaseA(){
        Config config = Config.getInstance();
        System.out.println(config);
        System.out.println("llave clase A: "+ config.getKey());
        config.setKey("PEPE");
        System.out.println(config);
        System.out.println("llave clase A: "+ config.getKey());
    }

}
