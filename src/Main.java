import java.util.ArrayList;

public class Main {

    public String name;

    static String nomeProjeto = "Primeiro Projeto em Java!";

    protected int salary;

    public static void main(String[] args) {

        Ser meuSerAnimal = new Cachorro("Perola", 6, "Alberto");
        Ser meuSerHumano = new Pessoa("Lucas", 20, "Alberto");
        meuSerAnimal.setNome("Lucas");
        System.out.println(meuSerAnimal.saudacao());
        System.out.println(meuSerHumano.saudacao());
        System.out.println(nomeProjeto);
    }

    private void atualizaSalario(){
        this.salary = 4000;
    }

    public int getSalary(){
        this.atualizaSalario();
        return this.salary;
    }

}


