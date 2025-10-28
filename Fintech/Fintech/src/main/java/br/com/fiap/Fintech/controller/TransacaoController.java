package br.com.fiap.Fintech.controller;

import br.com.fiap.Fintech.model.Transacao;
import br.com.fiap.Fintech.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @PostMapping
    public ResponseEntity<Transacao> criarTransacao(@RequestBody Transacao transacao) {
        return ResponseEntity.ok(transacaoService.salvar(transacao));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transacao> buscarTransacao(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(transacaoService.buscarPorId(id));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Transacao>> listarTransacoes() {
        return ResponseEntity.ok(transacaoService.buscarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transacao> atualizarTransacao(@PathVariable Long id, @RequestBody Transacao transacao) {
        try {
            return ResponseEntity.ok(transacaoService.atualizar(id, transacao));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTransacao(@PathVariable Long id) {
        try {
            transacaoService.excluir(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }


}
