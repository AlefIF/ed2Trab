import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String caminho;
        int opc;

        System.out.println("Digite o caminho do txt a ser lido");
        //caminho = ler.next();
        lerTxt.CONSERTA_TXT("./Voos.txt");

        do {
            System.out.println("==================================================Funcionalidades==================================================");
            System.out.println("1) Calcular a possibilidade de voos dados dois aeroportos");
            System.out.println("2) Calcular uma rota possível para um voo");
            System.out.println("3) Calcular, de um aeroporto, voos diretos que partem dele e a lista desses destinos");
            System.out.println("4) Calcular, dado origem e destino, a viagem com menor distância percorrida e a com o menor tempo de voo");
            System.out.println("5) Calcular, dado um aeroporto, se eh possivel chegar a qualquer outro, e listar, calculando um de cada vez, \n"+
                    "   os aeroportos que se fossem removidos, desfariam o unico caminho ate outro");
            System.out.println("5) Calcular, dado um aeroporto, uma rota que passa por todos os outros com um tempo de voo minimo");
            System.out.println("=================================================Informacoes do TXT=================================================");
            System.out.println("6) Mostrar grafo das rotas");
            System.out.println("7) Mostrar grafo dos voos");
            System.out.println("====================================================================================================================");
            System.out.println("0) Sair");
            System.out.println("====================================================================================================================");
            System.out.println("Digite a opcao desejada:");
            opc = ler.nextInt();
            switch (opc){
                case 1:
                    fun1();
                    break;
                case 2:
                    fun2();
                    break;
                case 3:
                    fun3();
                    break;
                case 4:
                    fun4();
                    break;
                case 5:
                    fun5();
                    break;
                case 6:
                    fun6();
                    break;
                case 7:
                    fun7();
                   /*
                    GrafoVoos g = new GrafoVoos();
                    GrafoVoos.Vertice abq = g.addVertice("Albuquerque");
                    GrafoVoos.Vertice atl = g.addVertice("Atlanta");
                    GrafoVoos.Vertice nyk = g.addVertice("Nova York");

                    g.addAresta(abq, atl, 500);
                    g.addAresta(abq, nyk, 45.5);
                    g.addAresta(atl, abq, 200.3);
                    g.addAresta(nyk, abq, 12.3);
                    System.out.println(g);
                    */
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalidae");
                    break;
            }
        } while(opc != 0);

    }

    public static void fun1(){

    }

    public static void fun2(){

    }

    public static void fun3(){

    }

    public static void fun4(){

    }

    public static void fun5(){

    }

    public static void fun6(){

    }

    public static void fun7(){

    }
}


