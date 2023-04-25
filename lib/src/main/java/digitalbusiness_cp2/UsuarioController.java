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
public class UsuarioController {
	
	@Autowired
	private TransationService transationService;

	private List<Usuario> usuarioList = new ArrayList<>();
	
	@PostConstruct
	private void postConstruct() {
		Usuario user = new Usuario("carol", 1, "carol@gmail.com", "teste123", "11958134758", 21, "Rua Belmiro Alves", "43123454645", "3965478965", false, 300000F, 500000F, 
				new GregorianCalendar(2023, Calendar.APRIL, 17), new GregorianCalendar(2023, Calendar.APRIL, 18), "livro", TipoPagamento.PIX);
		
		usuarioList.add(user);
		
	}
	
	@GetMapping("/user")
	ResponseEntity<List<Usuario>> all() {
		return ResponseEntity.ok(transationService.getAllUsuario());
	}
	
	
	
	@PostMapping("/cadastroUser")
	public ResponseEntity<Usuario> newUsuario(@RequestBody Usuario newUsuario) {
		transationService.saveUsuario(newUsuario);
		return ResponseEntity.ok(newUsuario);
	}
    
	
	@PutMapping("/user/{id}")
	public ResponseEntity<Usuario> replaceEmployee(@RequestBody Usuario newUsuario, @PathVariable Long id) {
		Usuario usuarioUpdated = transationService.updateUsuario(newUsuario,id);
		return ResponseEntity.ofNullable(usuarioUpdated);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Usuario> deleteEmployee(@PathVariable Long id) {
		return ResponseEntity.ofNullable(transationService.deleteUsuario(id));
	}
}
