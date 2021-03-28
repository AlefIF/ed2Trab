import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Voo {
    private String voo;
    private String aeroportoOrigem;
    private String horaPartida;
    private String aeroportoDestino;
    private String horaChegada;
    private Integer paradas;
    private Double distancia;

    public String toString(){
        return this.toString(Boolean.TRUE);
    }
    public String toString(Boolean quebra){
        StringBuilder sb = new StringBuilder();

        if (quebra){
            sb.append("\n");
        }
        sb.append(voo);
        sb.append(" ");
        sb.append(aeroportoOrigem);
        sb.append(" ");
        sb.append(horaPartida);
        sb.append(" ");
        sb.append(aeroportoDestino);
        sb.append(" ");
        sb.append(horaChegada);
        sb.append(" ");
        sb.append(paradas);
        sb.append(" ");

        return sb.toString();
    }

    public String getAeroportoDestino() {
        return aeroportoDestino;
    }

    public void setAeroportoDestino(String aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }

    public String getVoo() {
        return voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }

    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(String aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public Integer getParadas() {
        return paradas;
    }

    public void setParadas(Integer paradas) {
        this.paradas = paradas;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public void calculaPesosRestantes(HashMap<String, Aeroporto> aeroportos) {
        if(
            Objects.isNull(aeroportoOrigem)
            || Objects.isNull(aeroportoDestino)
        ) return;

        distancia = Math.sqrt(
                Math.pow(aeroportos.get(aeroportoDestino).getCoordenadaX() - aeroportos.get(aeroportoOrigem).getCoordenadaX(), 2) +
                Math.pow(aeroportos.get(aeroportoDestino).getCoordenadaY() - aeroportos.get(aeroportoOrigem).getCoordenadaY(), 2)
        );
    }
}
