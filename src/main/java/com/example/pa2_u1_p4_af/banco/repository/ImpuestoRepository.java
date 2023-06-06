package com.example.pa2_u1_p4_af.banco.repository;

import java.math.BigDecimal;

public interface ImpuestoRepository {

    public BigDecimal seleccionar(String codigoImpuesto);
    
}
