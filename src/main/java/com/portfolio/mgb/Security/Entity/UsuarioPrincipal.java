
package com.portfolio.mgb.Security.Entity;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author samab
 */
public class UsuarioPrincipal implements UserDetails{
    private String nombre;
    private Collection<? extends GrantedAuthority> authorities ;
    
    
    //CONTRUNCTORES 

    public UsuarioPrincipal(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
    //GETTER Y SETTERS 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
