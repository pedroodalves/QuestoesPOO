package Lista04.Questao05;

public class Main {
    public static void main(String[] args) {
        Personagem[] equipe = {
                new Guerreiro(),
                new Mago(),
                new Arqueiro()
        };

        System.out.println("=== TURNO DE COMBATE ===");

        for (Personagem personagem : equipe) {
            personagem.atacar();
        }

        System.out.println("=== FIM DO TURNO ===");
    }
}
