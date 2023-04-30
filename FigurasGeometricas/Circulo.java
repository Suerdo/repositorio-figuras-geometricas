package FigurasGeometricas;

public class Circulo implements FigurasGeometricas{
    private double raio;
    public Circulo (double raio){
        this.raio = raio;
    }
    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*raio;
    }
    @Override
    public double calculaArea() {
        return Math.PI*(raio*raio);
    }
    @Override
    public String getTipoFig() {
        return "Circulo";
    }
    @Override
    public int compareTo(FigurasGeometricas o) {
        return Double.compare(calculaArea(), o.calculaArea());

    }
}