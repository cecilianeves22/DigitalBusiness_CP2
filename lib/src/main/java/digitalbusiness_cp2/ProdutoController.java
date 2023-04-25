package digitalbusiness_cp2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class ProdutoController {
	
	@Autowired
	private TransationServiceProduto transationServiceProduto;

	private List<Produto> produtoList = new ArrayList<>();
	
	@PostConstruct
	private void postConstruct() {
		Produto product = new Produto("livro", 1 ,new GregorianCalendar(2023, Calendar.APRIL, 17), new GregorianCalendar(2023, Calendar.APRIL, 18), true);
		
		produtoList.add(product);
		
	}
	
	@GetMapping("/produto")
	ResponseEntity<List<Produto>> all() {
		return ResponseEntity.ok(transationServiceProduto.getAllProduto());
	}
	
	
	
	@PostMapping("/cadastroProduto")
	public ResponseEntity<Produto> newProduto(@RequestBody Produto newProduto) {
		transationServiceProduto.saveProduto(newProduto);
		return ResponseEntity.ok(newProduto);
	}
    
	
	@PutMapping("/produto/{id}")
	public ResponseEntity<Produto> replaceProduto(@RequestBody Produto newProduto, @PathVariable Long id) {
		Produto produtoUpdated = transationServiceProduto.updateProduto(newProduto,id);
		return ResponseEntity.ofNullable(produtoUpdated);
	}
	
	@DeleteMapping("/produto/{id}")
	public ResponseEntity<Produto> deleteProduto(@PathVariable Long id) {
		return ResponseEntity.ofNullable(transationServiceProduto.deleteProduto(id));
	}
}
