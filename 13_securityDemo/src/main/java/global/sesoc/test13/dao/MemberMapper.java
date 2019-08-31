package global.sesoc.test13.dao;

import global.sesoc.test13.dto.AuthVO;
import global.sesoc.test13.dto.MemberVO;

public interface MemberMapper {
	public MemberVO read(String userid);
	public void insertOne1(MemberVO member);
	public void insertOne2(AuthVO authVO);
}
