package FigurasGeometricas;

import java.util.ArrayList;
import java.util.Collections;

public class RepositorioFigurasGeo {

    private ArrayList<FigurasGeometricas> figurasGeometricas;

    public RepositorioFigurasGeo(){
        figurasGeometricas = new ArrayList<>();
    }
    public void adicionarFigura(FigurasGeometricas figurasGeometrica){
        figurasGeometricas.add(figurasGeometrica);
    }
    public void remover(int posicao){
        figurasGeometricas.remove(posicao);
    }
    public FigurasGeometricas recupera(int posicao){
        return figurasGeometricas.get(posicao);
    }
    public double getPerimetro(int posicao){
        return figurasGeometricas.get(posicao).calcularPerimetro();
    }
    public double getArea(int posicao){
        return figurasGeometricas.get(posicao).calculaArea();
    }
    public String getTipo(int posicao){
        return figurasGeometricas.get(posicao).getTipoFig();
    }
    public void ordena(){
        Collections.sort(figurasGeometricas);
    }
    public ArrayList<FigurasGeometricas> getFiguras() {
        return figurasGeometricas;
    }
}
