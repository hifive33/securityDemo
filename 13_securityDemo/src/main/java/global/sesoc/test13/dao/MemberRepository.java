package global.sesoc.test13.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import global.sesoc.test13.dto.AuthVO;
import global.sesoc.test13.dto.MemberVO;

@Repository
public class MemberRepository {

	@Autowired
	SqlSession session;
	
	private PasswordEncoder pwencoder= new BCryptPasswordEncoder();
	
	public int insertOne(MemberVO member, String auth) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		member.setUserpwd(pwencoder.encode(member.getUserpwd()));
		mapper.insertOne1(member);
		
		AuthVO authVO = new AuthVO();
		authVO.setUserid(member.getUserid());
		authVO.setAuth(auth);
		mapper.insertOne2(authVO);
		
		return 1;
	}
	
}
