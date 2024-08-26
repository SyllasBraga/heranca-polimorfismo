package heranca.polimorfismo.animais;

import heranca.polimorfismo.animais.models.*;

/*
 * As classes contidas na pasta 'animais\models' correspondem do exercício 1 até o 4
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--------- ANIMAIS ----------\n");
        Animal cachorro = new Cachorro("Caramelo", 5);
        Animal cavalo = new Cavalo("Pangaré", 7);
        Animal preguica = new Preguica("Ligeirinha", 3);

        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();

        System.out.println("\n--------- Veterinario ----------\n");
        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        System.out.println("\n--------- Zoológico ----------\n");
        Zoologico zoologico = new Zoologico();
        zoologico.adicionarAJaula(cachorro);
        zoologico.adicionarAJaula(cavalo);
        zoologico.adicionarAJaula(preguica);
        zoologico.adicionarAJaula(new Cavalo("Pampas", 7));
        zoologico.adicionarAJaula(new Preguica("Floquinho", 3));
        zoologico.adicionarAJaula(new Cachorro("Bolt", 4));
        zoologico.adicionarAJaula(new Cavalo("Beto", 6));
        zoologico.adicionarAJaula(new Preguica("Nina", 2));
        zoologico.adicionarAJaula(new Cachorro("Max", 3));
        zoologico.adicionarAJaula(new Cavalo("Storm", 8));
        zoologico.visitarJaulas();
    }
}