package service;

import org.junit.Test;

import model.Member;
import service.impl.MemberServiceImpl;

public class MemberServiceImplTest {
	private static MemberServiceImpl msi=new MemberServiceImpl();
	
	//@Test
	public void addMemberTest()
	{
		
		msi.addMember(new Member("a","ii","77","taipei","44"));
		
		System.out.println("add success");
	}
	
	//@Test
	public void selectAllMemberTest()
	{
		System.out.println(msi.selectAllMember());
	}
	
//	@Test
	public void selectMemberByIdTest()
	{
		System.out.println(msi.selectMemberById(24));
	}
	
	//@Test
	public void updateMemberTest()
	{
		
		msi.updateMember(2, "000", "jackie");
		
		System.out.println("update success");
	}
	
	@Test
	public void deleteMemberTest()
	{
		msi.deleteMember(23);
		
		System.out.println("delete success");
	}

}