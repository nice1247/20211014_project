package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberSelect {
	private Scanner scn = new Scanner(System.in);
	MemberVO member = new MemberVO();
	private MemberService dao = new MemberServiceImpl();

	public void execute() {
		
		System.out.println("==================");
		System.out.println("조회할 멤버의 ID를 입력하세요.");
		member.setId(scn.nextLine());
		member = dao.memberSelect(member);
		member.toString();
	}
}
