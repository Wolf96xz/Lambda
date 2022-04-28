package Calcular;

public enum Impuesto {

    SUPERREDUCED(4), REDUCED(10), NORMAL(21);

    public int percent;

    private Impuesto(int percent) { this.percent = percent; }

    public int getPercent() { return percent; }
}
