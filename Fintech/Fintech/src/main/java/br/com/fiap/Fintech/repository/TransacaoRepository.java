package br.com.fiap.Fintech.repository;

import br.com.fiap.Fintech.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
