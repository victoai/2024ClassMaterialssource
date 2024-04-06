package java2prj1.interfaceEx.cook;

import java.util.ArrayList;
import java.util.random.*;
public class Najeong extends Cook implements 한식가능한{

	public Najeong() {
		
	}
	public Najeong(String name) {
		super(name);
	}
	@Override
	public String 된장찌게만들기() {
		// TODO Auto-generated method stub
		return "된찌";
	}

	@Override
	public String 불고기만들기() {
		// TODO Auto-generated method stub
		return "불고기";
	}

	@Override
	public String 김밥만들기() {
		// TODO Auto-generated method stub
		return "김밥";
	}

	public static void main(String args) {
		ArrayList<Cook> list = new ArrayList<>();
		list.add(new Cook("양식이 가능한 요리사"));
		list.add(new Cook("중식이 가능한 요리사"));
		list.add(new Cook("한식이 가능한 요리사"));
		
	}
}
