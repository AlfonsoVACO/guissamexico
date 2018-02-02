package com.guissa.guissa.services.imp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.guissa.guissa.models.entidades.TipoUsuario;
import com.guissa.guissa.models.entidades.User;
import com.guissa.guissa.repositorys.SesionRepository;

@Service("servicioSesion")
public class SesionServiceImp implements UserDetailsService {

	@Autowired
	@Qualifier("sesionRepository")
	private SesionRepository sesionRepository;

	@Override
	public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
		User usuario = sesionRepository.findUserByCorreo(correo);
		List<GrantedAuthority> authorityes = buildAuthority(usuario.getIdTipousuario());
		return (UserDetails) buildUser(usuario, authorityes);
	}

	private User buildUser(User user, List<GrantedAuthority> autorityes) {
		return new User(user.getIdUser(), user.getNombre(), user.getApellidos(), user.getCorreo(), user.getNic(),
				user.getPass(), user.getAvatar());
	}

	private List<GrantedAuthority> buildAuthority(TipoUsuario tipoUsuario) {
		Set<GrantedAuthority> auths = new HashSet<GrantedAuthority>();
		auths.add(new SimpleGrantedAuthority(tipoUsuario.getDescripcion()));

		return new ArrayList<GrantedAuthority>(auths);
	}

}
