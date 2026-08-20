public class ExercicioClass {
    public static void main(String[] args){
        Conta contajoanilda = new Conta("Joanilda");
        contajoanilda.depositar(20);

        Conta contagabriel = new Conta("Gabriel");
        contagabriel.depositar(10);

        contajoanilda.sacar(15);


        System.out.println("Conta da joanilda: " + contajoanilda.verSaldo());
        System.out.println("Conta do gabriel: " + contagabriel.verSaldo());


    }
}
