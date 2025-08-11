package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        Board data01 = new Board(10, "여름 폭염", "김철수", "2025/08/10", 5);  //1번 Bean 객체

        Board data02 = new Board(9, "우크라이나 전쟁", "푸틴", "2025/07/17", 3);  //2번 Bean 객체

        Board data03 = new Board(8, "홈플러스", "이수정", "2025/11/11", 8);  ///3번 Bean 객체

        BoardDao dao = new BoardDao();
        dao.insertData(data01);
        dao.insertData(data02);
        dao.insertData(data03);
        dao.insertData(new Board(7, "서이초등학교", "금잔디", "2025/11/11", 4));
        dao.insertData(new Board(6, "남극탐험", "이강우", "2025/11/11", 11));

        System.out.println("요소 개수 : " + dao.getSize());

        System.out.println("\n전체 게시물 목록을 조회합니다.");
        List<Board> boardList = dao.selectAll(); //전체 게시물 목록 조회 //List<Board>가 반환타입임(좌측 우측? 메소드 호출에 의해서 반환되므로?)

        for (Board bean: boardList){  //: 좌측 단수 이름은 bean, board, item 다 무방 //폭염 제일먼저 넣었으므로 제일 먼저 나옴(FIFO)
           // System.out.println(bean); 연습(필요 없음, 삭제해도 됨 )  //확장 for문
            int no = bean.getNo();           //게시물 목록 페이지 작성과 출력
            String title = bean.getTitle();
            String writer = bean.getWriter();
            String regdata = bean.getRegdate();
            int readcount = bean.getReadcount();
            String message = no + "\t" + title + "\t" + writer + "\t" +regdata + "\t" + readcount;
            System.out.println(message);

        }

        System.out.println("\n게시물 번호를 이용하여 특정 게시물을 조회합니다.");
        int findId = 7 ;  //찾고자 하는 게시물 번호
        Board bean = dao.getOne(findId);
        if (bean == null) {
            System.out.println(findId + "게시물은 존재하지 않습니다."); //게시물 목록 페이지 작성과 출력
        }else {
            System.out.println("글번호\t제목\t작성자\t작성 일자\t조회수");

            int no = bean.getNo();
            String title = bean.getTitle();
            String writer = bean.getWriter();
            String regdata = bean.getRegdate();
            int readcount = bean.getReadcount();


            String message = no + "\t" + title + "\t" + writer + "\t" +regdata + "\t" + readcount;
            System.out.println(message);

        }
        System.out.println("\n게시물 번호를 이용하여 특정 게시물을 삭제합니다.");
        int deleteId = 8 ;  //삭제하고자 하는 게시물 번호

        int result = dao.removeData(deleteId);

        if (result != -1) { //발견했을 때
            System.out.println(deleteId + "게시물 삭제 성공");
        }else { //발견 못했을 때
            System.out.println(deleteId + "게시물 발견하지 못했습니다.");
        }
        System.out.println("\nbefore all deleted : " + dao.getSize()); //전체 데이터 다 지움(삭제 전 후 데이터 비교 판단)
        System.out.println("게시물 목록을 전부 삭제합니다.");
        dao.removeAllBoards();  //모든 게시물을 지웁니다.

        System.out.println("after all deleted : " + dao.getSize()); //before 와 after 들어가면 전후 비교이다.
    }
}
