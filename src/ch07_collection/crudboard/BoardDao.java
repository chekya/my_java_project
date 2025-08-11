package ch07_collection.crudboard; //DAO 클래스 : 데이터 베이스에게 데이터를 추가/수정/삭제등의 작업을 요청해주는 중간 middle-ware 성격의 클래스

import java.util.ArrayList;
import java.util.List;

//DAO 클래스 : 데이터 베이스에게 데이터를 추가/수정/삭제등의 작업을 요청해주는 중간 middle-ware 성격의 클래스
public class BoardDao {
    private List<Board> boardList = null; // 게시물들을 담은 통(bottle) //Main에 추가해서 현재 5개의 게시물 있음

    public BoardDao() { //초기화 한다.
        this.boardList = new ArrayList<Board>();  // 게시물 담는 통 초기화(객체 생성해서 상단의 null을 의미있게 만들어야한다.)
    }

    public int insertData(Board board) { //P236  매개변수(Board board)를 목록에 추가하고자 하는 게시물 1개
        System.out.println("게시물 번호 :" + board.getNo() + "이(가) 추가 되었습니다.");
        boardList.add(board);  //add 써서 매개변수를 목록에 추가.
        return 1;  //숫자 1은 성공이라는 개념(추가 성공이라는 뉘앙스, IT에서 숫자 0 은 flase, 그 이외에는 다 true 이므로.)
    }

    public int getSize() {   //반환타입이 int 이므로 위의 boardList에 size 붙인다.?
        return this.boardList.size();  //전체데이터 가져올 때는 굳이 ()안에 매개변수 필요없음 -->'전부다줘'라는 의미
    }                                  //한 건만 가져올 때는 board, 여러 개 가져올 때는 ListBoard 가져온다.?

    public List<Board> selectAll() {
        return this.boardList;  //윗 줄 생성되면 이 줄 입력
    }

    public int removeData(int deleteId) {
        //deleteId는 삭제하고자 하는 게시물 번호
        int cnt = -1;  //-1은 '발견' 여부를 나타내는 flag 변수((-1은 부정적 의미, 발견못했다는 뉘앙스) 발견되면 1로 바꾼다.)
                       //거짓(삭제못했다,못찾았다)가 기본값이나 삭제하면 '1'로 바뀐다. 이렇게 바뀌는 변수를 'flag 변수'라 하다.
        for (Board bean : boardList) {  // 확장for
            if (deleteId == bean.getNo()) {  //발견 함  --> 즉 삭제
                this.boardList.remove(bean);
                cnt = 1; // 발견했으므로 1로 바꿈
                break;

            } else {   //발견 못함  (else는 일단 공란으로 만들어 놓고 필요할 때 추가)
            }
        }
        return cnt;
    }
    //아래의 Board는 참조 자료형이고, 클래스이므로 기본값 null을 return
    public Board getOne(int findId) {    //findId는 찾고자 하는 게시물 번호

        Board findData = null;  //반환해 줄 데이터 정보 찾아보고 없으면 null값 return 하라는 의미.
        //게시물을 밖은 확장 for문으로 찾은 후 내가 찾는 게시물과 같은지 확인은 안의 단순 if문
        for (Board bean : boardList) {  //확장 for문 (:세미콜론 좌측 boardList 는 복수, 우측 bean 은 단수)
            if (bean.getNo() == findId) { //해당 게시물 발견됨(단순 if문)
                findData = bean;  //해당 객체를 반환하는 데이터에 할당//무의미한 데이터가 할당이 되어 유의미한 데이터가 됨(!null (not null))

                break;  //이하 다른 게시물은 볼 필요 없으므로
            }
        }

        return findData; //경우에 따라서 not null일 수도 null일 수도 있다.
    }


    public void removeAllBoards() {
        this.boardList.clear(); //게시물 모두 지움
    }
}
