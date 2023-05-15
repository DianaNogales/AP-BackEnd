package com.portfolio.mgb.Security.Service;

import com.portfolio.mgb.Security.Entity.Usuario;
import com.portfolio.mgb.Security.Repository.iUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author samab
 *
 * // CTRL + ALT + I IMPLEMENTAR
 */
@Service
@Transactional

public class UsuarioService {

    @Autowired
    iUsuarioRepository iusuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email) {
        return iusuarioRepository.existsByEmail(email);

    }

    public void save(Usuario usuario) {
        iusuarioRepository.save(usuario);
     
    }
}