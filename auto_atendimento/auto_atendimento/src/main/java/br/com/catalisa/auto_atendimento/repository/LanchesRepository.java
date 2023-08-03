package br.com.catalisa.auto_atendimento.repository;

import br.com.catalisa.auto_atendimento.model.LancheModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanchesRepository extends JpaRepository<LancheModel, Long> {
}
