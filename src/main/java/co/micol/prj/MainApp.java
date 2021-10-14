package co.micol.prj;

import co.micol.prj.board.serviceImpl.BoardSelectList;
import co.micol.prj.member.serviceImpl.MemberSelect;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		BoardSelectList bsl = new BoardSelectList();
		bsl.execute();
//		MemberSelect ms = new MemberSelect();
//		ms.execute();
	}
}
