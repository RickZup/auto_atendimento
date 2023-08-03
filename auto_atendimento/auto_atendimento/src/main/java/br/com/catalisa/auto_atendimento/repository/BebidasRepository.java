package br.com.catalisa.auto_atendimento.repository;

import br.com.catalisa.auto_atendimento.model.BebidaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BebidasRepository extends JpaRepository<BebidaModel, Long> {
}
