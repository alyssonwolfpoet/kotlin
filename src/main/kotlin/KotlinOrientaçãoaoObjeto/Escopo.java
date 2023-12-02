package KotlinOrientaçãoaoObjeto;

public class Escopo {
    static int valor = 0;
    int value = 0;
    public Escopo(){
        valor++;
        value++;
    }

    public static void main(String[] args) {
        new Escopo();
        new Escopo();
        new Escopo();
        new Escopo();

        Escopo s = new Escopo();
        System.out.println(s.valor); // pertence ao escopo classe, por isso incrementa
        System.out.println(s.value); // pertence ao escorpo objeto, incrementa uma vez

        for (int i = 0; i<4 ;i++){
            s.value++;
        }
        System.out.println(s.value);
    }
}
