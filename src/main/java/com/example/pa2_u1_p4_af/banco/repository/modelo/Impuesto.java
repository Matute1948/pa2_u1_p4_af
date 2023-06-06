package com.example.pa2_u1_p4_af.banco.repository.modelo;

import java.math.BigDecimal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Impuesto {
    //si son modelos debemos trabajar con wrappers
    private BigDecimal iva;

    //toString
    @Override
    public String toString() {
        return "Impuesto [iva=" + iva + "]";
    }

    //get y set
    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
    
    
}
