package heranca.polimorfismo.animais.models;

public class Veterinario {

    public void examinar(Animal animal) {
        animal.emitirSom();
    }
}
