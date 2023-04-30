package FigurasGeometricas;

public class Quadrado implements FigurasGeometricas {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
    @Override
    public double calculaArea() {
        return lado * lado;
    }
    @Override
    public String getTipoFig() {
        return "Quadrado";
    }
    @Override
    public int compareTo(FigurasGeometricas o) {
        return Double.compare(calculaArea(), o.calculaArea());
    }
}
