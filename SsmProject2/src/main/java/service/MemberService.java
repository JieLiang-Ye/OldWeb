package service;

import java.util.List;

import model.Member;

public interface MemberService {
	//create
	void addMember(Member m);
	//read
	List<Member> selectAllMember();
	String selectAll();
	Member selectMemberById(int id);
	
	//update
	
	void updateMember(int id,String password,String name);
	
	//delete
	
	void deleteMember(int id);
	

}