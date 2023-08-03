package br.com.catalisa.auto_atendimento.service;

import br.com.catalisa.auto_atendimento.model.ItemPedidoModel;
import br.com.catalisa.auto_atendimento.model.PedidoModel;
import br.com.catalisa.auto_atendimento.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PedidoService {

    @Autowired
    PedidosRepository pedidoRepository;

    public PedidoService(PedidosRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public PedidoModel criarPedido() {
        return pedidoRepository.save(new PedidoModel());
    }

    public void adicionarItemAoPedido(PedidoModel pedido, ItemPedidoModel itemPedido) {
        if (pedido != null) {

            pedido.getItens().add(itemPedido);
            atualizarValorTotalDoPedido(pedido);
            pedidoRepository.save(pedido);
        }
    }

    public void removerItemDoPedido(PedidoModel pedido, ItemPedidoModel itemPedido) {

        if (pedido != null && itemPedido != null) {

            pedido.getItens().remove(itemPedido);
            atualizarValorTotalDoPedido(pedido);
            pedidoRepository.save(pedido);
        }
    }

    public void atualizarQuantidadeDoItem(PedidoModel pedido, ItemPedidoModel itemPedido, int quantidade) {
        // Verifique se o pedido e o item existem
        if (pedido != null && itemPedido != null) {
            // Atualize a quantidade do item no pedido e atualize o valor total do pedido
            itemPedido.setQuantidade(quantidade);
            atualizarValorTotalDoPedido(pedido);
            pedidoRepository.save(pedido);
        }
    }

    private void atualizarValorTotalDoPedido(PedidoModel pedido) {
        double valorTotal = 0.0;
        for (ItemPedidoModel item : pedido.getItens()) {
            double precoProduto = item.getProdutoModel().getPreco();
            int quantidade = item.getQuantidade();
            valorTotal += precoProduto * quantidade;
        }
        pedido.setValorTotal(valorTotal);
    }
}

