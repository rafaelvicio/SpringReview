package br.com.rafaelvicio.springeview.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.rafaelvicio.springeview.modelo.Demanda;
import br.com.rafaelvicio.springeview.repository.DemandaRepository;

@Controller
public class DemandaController {

    @Autowired
    private DemandaRepository demandaRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/demandas")
    public String demandas(Model model) {
        Iterable<Demanda> demandas = demandaRepository.findAll();
        model.addAttribute("demandas", demandas);
        return "demandas";
    }

    @RequestMapping(value = "salvar", method = RequestMethod.POST)
    public String salvar(@RequestParam("nome") String nome, @RequestParam("email") String email,
            @RequestParam("telefone") String telefone, Model model) {

        Demanda novaDemanda = new Demanda(nome, email, telefone);
        demandaRepository.save(novaDemanda);

        Iterable<Demanda> demandas = demandaRepository.findAll();
        model.addAttribute("demandas", demandas);

        return "demandas";
    }

}