package com.example.pa2_u1_p4_af.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

@Repository
public class ImpuestoRepositoryImpl implements ImpuestoRepository{

    @Override
    public BigDecimal seleccionar(String codigoImpuesto) {
        // TODO Auto-generated method stub

        return (new BigDecimal(12));
    }
    
}
