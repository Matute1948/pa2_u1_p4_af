package com.example.pa2_u1_p4_af.banco.serrvice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pa2_u1_p4_af.banco.repository.ImpuestoRepository;
import com.example.pa2_u1_p4_af.banco.repository.modelo.Impuesto;

@Service
public class CargaSistemaServiceImpl implements CargaSistemaService{

    @Autowired
    private Impuesto impuesto;
    @Autowired
    private ImpuestoRepository impuestoRepository;

    @Override
    public void cargar() {

        System.out.println("Inicia carga de impuestos");
        BigDecimal valorIva = this.impuestoRepository.seleccionar("IVA");
        this.impuesto.setIva(valorIva);
        System.out.println("Fin de carga de impuestos");
    
    }
    
}
