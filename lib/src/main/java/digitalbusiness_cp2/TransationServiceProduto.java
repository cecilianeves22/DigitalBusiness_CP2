package digitalbusiness_cp2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransationServiceProduto {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto saveProduto(Produto produto) {
		ProdutoEntity produtoEntity = new ProdutoEntity(produto);
		produtoRepository.save(produtoEntity);
		return produto;
	}

	public List<Produto> getAllProduto() {
		return produtoRepository.findAll().stream().map(entity -> new Produto(entity)).toList();
	}
	
	public Produto findById(Long id) {
		 Optional<ProdutoEntity> produtoEntity = produtoRepository.findById(id);
		 if(produtoEntity.isPresent()) {
			 return new Produto(produtoEntity.get());
		 } 
		 return null;
	}
	
	public Produto updateProduto(Produto newProduto, Long id) {
		Optional<ProdutoEntity> produtoEntityOptional = produtoRepository.findById(id);
		if(produtoEntityOptional.isPresent()) {
			ProdutoEntity produtoEntity = produtoEntityOptional.get();
			produtoEntity.setNome(newProduto.getNome());
			produtoEntity.setUuid(newProduto.getUuid());
			produtoEntity.setDataCadastro(newProduto.getDataCadastro());
			produtoEntity.setDataAtualizacao(newProduto.getDataAtualizacao());
			produtoEntity.setHabilitado(newProduto.isHabilitado());
			return newProduto;
		}
		return null;
		
	}
	
	public Produto deleteProduto(Long id) {
		Optional<ProdutoEntity> produtoEntityOptional = produtoRepository.findById(id);
		if(produtoEntityOptional.isPresent()) {
			ProdutoEntity produtoEntity = produtoEntityOptional.get();
			produtoRepository.delete(produtoEntity);
			return new Produto(produtoEntity);
		}
		return null;
	}
}
