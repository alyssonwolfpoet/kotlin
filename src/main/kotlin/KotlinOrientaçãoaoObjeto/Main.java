package KotlinOrientaçãoaoObjeto;

public class Main {
    public static void main(String[] args) {
        Planet p = new Planet();
        System.out.println(p.getNome());
        p.setNome("Planeta Terra");
        System.out.println(p.getNome());
    }
}
