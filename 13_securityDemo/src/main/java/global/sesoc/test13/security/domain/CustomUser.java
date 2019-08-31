package global.sesoc.test13.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import global.sesoc.test13.dto.MemberVO;

public class CustomUser extends User {
	private static final long serialVersionUID = 1L;
	
	private MemberVO member;
	
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}
	
	public CustomUser(MemberVO vo) {
		super(vo.getUserid(), vo.getUserpwd(), vo.getAuthList().stream().map(auth -> new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList()));
		
		this.member = vo;
	}

	public MemberVO getMember() {
		return member;
	}
	
}
