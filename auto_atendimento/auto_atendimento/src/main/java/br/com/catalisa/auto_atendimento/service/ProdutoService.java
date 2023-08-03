package br.com.catalisa.auto_atendimento.service;

import br.com.catalisa.auto_atendimento.model.ProdutoModel;
import br.com.catalisa.auto_atendimento.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutosRepository produtoRepository;

    public ProdutoService(ProdutosRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<ProdutoModel> buscarTodosProdutos() {
        return produtoRepository.findAll();
    }

    public ProdutoModel buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public ProdutoModel cadastrarProduto(ProdutoModel produto) {
        return produtoRepository.save(produto);
    }

    public ProdutoModel atualizarProduto(ProdutoModel produto) {

        ProdutoModel produtoExistente = produtoRepository.findById(produto.getId()).orElse(null);

        if (produtoExistente != null) {

            if (produto.getNome() != null) {
                produtoExistente.setNome(produto.getNome());
            }

            produtoExistente.setPreco(produto.getPreco());

            return produtoRepository.save(produtoExistente);
        } else {
            return null;
        }
    }

    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}

