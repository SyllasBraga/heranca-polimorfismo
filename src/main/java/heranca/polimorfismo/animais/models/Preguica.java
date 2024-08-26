package heranca.polimorfismo.animais.models;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Preguiça emitindo som silenciosamente");
    }

    public void subirEmArvores() {
        System.out.println("Preguiça subindo em árvores");
    }
}
