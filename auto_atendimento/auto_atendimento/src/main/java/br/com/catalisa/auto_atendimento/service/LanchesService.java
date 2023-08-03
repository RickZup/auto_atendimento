package br.com.catalisa.auto_atendimento.service;

import br.com.catalisa.auto_atendimento.model.BebidaModel;
import br.com.catalisa.auto_atendimento.model.LancheModel;
import br.com.catalisa.auto_atendimento.repository.BebidasRepository;
import br.com.catalisa.auto_atendimento.repository.LanchesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LanchesService {

    @Autowired
    LanchesRepository lanchesRepository;

    public List<LancheModel> buscarTodas(){
        return lanchesRepository.findAll();
    }

    public Optional<LancheModel> buscarPorId(Long id){
        return lanchesRepository.findById(id);
    }

    public LancheModel cadastrar(LancheModel lancheModel){
        return lanchesRepository.save(lancheModel);
    }

    public LancheModel alterar(Long id, LancheModel lancheModel){

        LancheModel lanches = buscarPorId(id).get();

        if (lancheModel.getNome() != null){
            lanches.setNome(lancheModel.getNome());
        }

        lanches.setPreco(lancheModel.getPreco());

        return lanchesRepository.save(lanches);
    }

    public void deletar(Long id){
        lanchesRepository.deleteById(id);
    }

}
