package org.example;

import java.util.Date;

public class Memo {

    private int id; //  글 번호
    private String name; // 작성자 이름
    private String password; // 비밀번호
    private String Content; // 메모 내용
    private Date date; // 작성일
    // 컴퓨터 시스템의 날짜와 시간을 자동으로 저장) 가지고 있다.
    // 수정 시, 수정 시간으로

    // 생성자 메서드 영역
    public Memo(String name, String password, String content, Date date) {
        this.name = name;
        this.password = password;
        Content = content;
        this.date = date;
    }

    // getter, setter 메서드
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setContent(String content) {
        Content = content;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getContent() {
        return Content;
    }
    public Date getDate() {
        return date;
    }

    public void printMemo() {
        System.out.printf("\n이름: %s\n내용: %s",this.getName(),this.getContent());
        // 날짜 출력 형식
        System.out.printf("");
    }

}