package Calcular;

import java.math.BigDecimal;

public class Producto {
    public String name;
    public BigDecimal price;
    public Impuesto impuesto;

    Producto(String name, BigDecimal price, Impuesto impuesto) {
        this.name = name;
        this.price = price;
        this.impuesto = impuesto;
    }

}