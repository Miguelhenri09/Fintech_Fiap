package br.com.fiap.Fintech.repository;

import br.com.fiap.Fintech.model.TransacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<TransacaoModel, Long> {

}
