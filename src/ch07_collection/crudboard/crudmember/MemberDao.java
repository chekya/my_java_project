package ch07_collection.crudboard.crudmember;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {  //생성자 초기화 Alt + Insert해서 생성자 만든다.
    private List<Member> memberList = null;  //4번 //회원 목록을 담을 컬렉션(회원도 순서를 따지는 자료구조로 만들것므로 'List'붙인다.
    //객체 생성될 때 객체 안에 소쿠리(통)이 하나 있는데 그 소쿠리 이름이 memberList 이다.--->객체생성됨(생성자의 주목적)
    // 원래는 database에 들어있어야 하는데 지금은 없어서 한시적으로 여기에 입력함

    public MemberDao() {  //위에서 Alt + Insert 하면 이 줄 (생성자) 생긴다. --> 바로 윗줄(라인 7) 작성  //3번
        this.memberList = new ArrayList<Member>(); //라인 7번 작성 후 라인 12 작성,객체 생성--> ArrayList.  //5번
    }

    public int insertData(Member member) {  //6번 //회원 1명 추가하기  //database 작성하게 되면 길어짐 //위 라인 작성 후
        System.out.println("아이디가 " + member.getId() + "인 회원이 가입합니다."); //8번(회원가입메소드 만들었으므로 Main가서 가입해본다.)
        this.memberList.add(member);  //회원 1명 추가이므로 'add' 메소드.  //7번
        return 1;  //7번
    }

    public int getSize() { //12번
        return this.memberList.size();
    }

    public List<Member> selecAll() {
        return this.memberList;   //컬렉션 전체를 가져오므로 'memberList' 기입.
    }

    public Member getOne(String findId) {
        // 특정 아이디 findId 를 사용하여 회원이 존재하는지 검색합니다.
        Member who = null;  //발견되면 여기에 값 할당. 지금은 찾는 회원 없다.

        for (Member bean : memberList) {
            if (findId == bean.getId()) { //찾고자하는 아이디 == 반복하고 있는 현재 멤버의 아이디
                who = bean;
                break;
            } else {
                // 그런 사람 없음
            }
        }
        return who;
    }

    public int deleteData(String deleteId) {
        int cnt = -1; // 좌측 'int cnt = -1;' 이것 작성하면 그 다음에 먼저 'return cnt;'작성 해 놓고 그 사이에 'for문' 작성하는 버릇 들일 것

        for (Member bean : memberList) {
            if (deleteId.equals(bean.getId()) ) {//지우고자 하는 아이디 equals 현재의 아이디(앞으로 '==' 쓰지말고 'equals'(참조형) 쓸 것(참조자료형 일 때는 '==' 쓰지말고 'equals'써야 에러 안난다.
                this.memberList.remove(bean);
                cnt = 1;
                break;

            }
        }
        return cnt;
    }

    public void deleteAllData() {
        this.memberList.clear();

    }
}
