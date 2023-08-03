package br.com.catalisa.auto_atendimento.service;

import br.com.catalisa.auto_atendimento.model.BebidaModel;
import br.com.catalisa.auto_atendimento.repository.BebidasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BebidasService {

    @Autowired
    BebidasRepository bebidasRepository;

    public List<BebidaModel> buscarTodas(){
        return bebidasRepository.findAll();
    }

    public Optional<BebidaModel> buscarPorId(Long id){
        return bebidasRepository.findById(id);
    }

    public BebidaModel cadastrar(BebidaModel bebidaModel){
        return bebidasRepository.save(bebidaModel);
    }

    public BebidaModel alterar(Long id, BebidaModel bebidaModel){

        BebidaModel bebidas = buscarPorId(id).get();

        if (bebidaModel.getNome() != null){
            bebidas.setNome(bebidaModel.getNome());
        }

        bebidas.setPreco(bebidaModel.getPreco());

        return bebidasRepository.save(bebidas);
    }

    public void deletar(Long id){
        bebidasRepository.deleteById(id);
    }
}
