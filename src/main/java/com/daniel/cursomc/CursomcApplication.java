package com.daniel.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daniel.cursomc.domain.Categoria;
import com.daniel.cursomc.domain.Cidade;
import com.daniel.cursomc.domain.Cliente;
import com.daniel.cursomc.domain.Endereco;
import com.daniel.cursomc.domain.Estado;
import com.daniel.cursomc.domain.ItemPedido;
import com.daniel.cursomc.domain.Pagamento;
import com.daniel.cursomc.domain.PagamentoComBoleto;
import com.daniel.cursomc.domain.PagamentoComCartao;
import com.daniel.cursomc.domain.Pedido;
import com.daniel.cursomc.domain.Produto;
import com.daniel.cursomc.domain.enums.EstadoPagamento;
import com.daniel.cursomc.domain.enums.TipoCliente;
import com.daniel.cursomc.repositories.CategoriaRepository;
import com.daniel.cursomc.repositories.CidadeRepository;
import com.daniel.cursomc.repositories.ClienteRepository;
import com.daniel.cursomc.repositories.EnderecoRepository;
import com.daniel.cursomc.repositories.EstadoRepository;
import com.daniel.cursomc.repositories.ItemPedidoRepository;
import com.daniel.cursomc.repositories.PagamentoRepository;
import com.daniel.cursomc.repositories.PedidoRepository;
import com.daniel.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
	}

}
