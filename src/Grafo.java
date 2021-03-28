import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Grafo {
    private HashMap<String, Aeroporto> aeroportos = new HashMap<>();
    private List<Voo> voos = new ArrayList<>();

    public void show(Boolean minimo){
        System.out.println(this.montaStringShow(minimo));
    }

    private String montaStringShow(Boolean minimo) {
        StringBuilder sb = new StringBuilder();
        if(!minimo){
            sb.append("############################################################### AEROPORTOS \n");
            aeroportos.forEach((s, aeroporto) -> sb.append(aeroporto.toString()));
            sb.append("############################################################### VOOS \n");
            voos.forEach((voo) -> sb.append(voo.toString()));
        }else{
            sb.append("Quantidade de aeroportos: ");
            sb.append(aeroportos.size());
            sb.append(" Quantidade de voos: ");
            sb.append(voos.size());
        }

        return sb.toString();
    }

    public HashMap<String, Aeroporto> getAeroportos() {
        return aeroportos;
    }

    public List<Voo> getVoos() {
        return voos;
    }

}
