package ch07_collection.crudboard.crudmember;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();  //MemberDao가 생성자-->MemberDao 가서 생성자 만든다. //2번
       // dao.inserData(new Member());Member가서 매개변수(String id, String name, int age, String gender)확인하고 ()안에 입력
       // -->dao.inserData(new Member("","", 0, ""));  //8번
        dao.insertData(new Member("kim","김만수", 12,"남자"));  //1줄이 회원 1명(html문서 1개에 해당)
        dao.insertData(new Member("park","박영희", 20,"여자"));
        dao.insertData(new Member("lee","이수진", 30,"여자"));
        dao.insertData(new Member("choi","최윤식", 40,"남자"));  //9번 (복사해서 4명분 입력)

        int size = dao.getSize();  //실제 회원 몇명인지 만들기(요소 갯 구하기) //10번
        System.out.println("회원은 총 " + size + "명입니다."); //11번 -->상단 getSize(현재 붉은색)에 마우스 대고 method만들기 클릭하면 Dao로 이동함

        System.out.println("\n모든 회원 정보를 출력합니다.");


        List<Member> memberList = dao.selecAll(); //모든 멤버(회원)가져오므로 ()안에 매개변수 안쓴다.//
        // 관리자가 우리 회원 몇명인지 확인하는것(html문서 1개에 해당)

        for (Member bean : memberList){ //이 자리에 toString 숨어 있다. //반환타입 모르겠으면 <Member> 꺽쇠 안 확인. 반환타입 :'Member'
            System.out.println(bean);
            String id = bean.getId();
            String name = bean.getName();
            int age = bean.getAge();
            String gender = bean.getGender();
            String message = id + "\t" + name + "\t" + age + "\t" +gender;
            System.out.println(message);
        }
        System.out.println("\n특정 아이디를 이용하여 특정 회원 정보를 조회합니다.");
        String findId = "lee";
        Member one = dao.getOne(findId);  //lee씨가 있으므로 one 은 not null /없는 성 넣으면 null로 나옴

        if (one == null) {
            System.out.println(findId + "아이디는 존재하지 않습니다.");
        }else {
            String id = one.getId();   //특정 아이디 찾기
            String name = one.getName();
            int age = one.getAge();
            String gender = one.getGender();

            String message = id + "\t" + name + "\t" + age + "\t" +gender;
            System.out.println(message);

        }
        System.out.println("\n특정 아이디를 사용하여 회원 정보를 삭제합니다.");
        String deleteId = "park";

        int result = dao.deleteData(deleteId);  //park 회원이 탈퇴할 때
        if (result !=  -1) {
            System.out.println(deleteId + "아이디 삭제 성공");
        }else {
            System.out.println(deleteId + "아이디를 발견하지 못했습니다.");
        }
        System.out.println("\nbefore all deleted : " + dao.getSize());
        System.out.println("회원 목록을 전부 삭제합니다.");
        dao.deleteAllData();

        System.out.println("\nafter all deleted : " + dao.getSize());
    }
}
