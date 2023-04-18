package digitalbusiness_cp2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransationService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario saveEmployee(Usuario usuario) {
		UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
		usuarioRepository.save(usuarioEntity);
		return usuario;
	}

	public List<Usuario> getAllUsuario() {
		return usuarioRepository.findAll().stream().map(entity -> new Usuario(entity)).toList();
	}
}
