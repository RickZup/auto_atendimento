package br.com.catalisa.auto_atendimento.repository;

import br.com.catalisa.auto_atendimento.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensRepository extends JpaRepository<ProdutoModel, Long> {
}
