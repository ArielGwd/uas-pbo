package Composition;
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Mobil {
    private Engine engine;

    public Mobil(String engineType) {
        this.engine = new Engine(engineType);
    }

    public void showEngineType() {
        System.out.println("Tipe Mesin Mobil : " + engine.getType());
    }
}

public class Composition {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("V8");
        mobil.showEngineType();
    }
}