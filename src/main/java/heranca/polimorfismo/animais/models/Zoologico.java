package heranca.polimorfismo.animais.models;

public class Zoologico {

    private Animal[] jaulas;
    private int cont = 0;
    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAJaula(Animal animal){
        this.jaulas[cont] = animal;
        cont++;
    }

    public void visitarJaulas() {
        for (Animal animal : jaulas) {
            animal.emitirSom();
            if (!(animal instanceof Preguica)) {
                animal.correr();
            }
        }
    }

    public Animal[] getJaulas() {
        return jaulas;
    }

    public void setJaulas(Animal[] jaulas) {
        this.jaulas = jaulas;
    }
}
