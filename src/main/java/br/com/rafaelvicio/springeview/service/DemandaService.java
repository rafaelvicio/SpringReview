package br.com.rafaelvicio.springeview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaelvicio.springeview.modelo.Demanda;
import br.com.rafaelvicio.springeview.repository.DemandaRepository;

@Service
public class DemandaService {

    @Autowired
    private DemandaRepository demandaRepository;

    public Iterable<Demanda> obterTodos(){
        Iterable<Demanda> demandas = demandaRepository.findAll();
        return demandas;
    }

    public void salvar(Demanda demanda){
        demandaRepository.save(demanda);
    }

}