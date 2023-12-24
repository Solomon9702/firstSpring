package com.example.firstproject.entity;

import com.example.firstproject.service.ArticleService;
import jakarta.persistence.*;
import lombok.*;

@Entity  // 해당 클래스가 엔티티임을 선언
@Getter
@ToString
@AllArgsConstructor  // 모든 필드를 매개변수로 갖는 생성자 자동 생성
@NoArgsConstructor  // 매개변수가 아예 없는 기본 생성자 자동 생성
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // DB가 자동으로 1씩 증가
    private Long id;  // 대표키

    @ManyToOne // 해당 댓글 엔티티 여러개가, 하나의 Article에 연관된다!
    @JoinColumn(name = "article_id") // 외래키 생성, Article 엔티티의 기본(id)와 매핑
    private Article article;  // 해당 댓글의 부모 게시글

    @Column  // 해당 필드를 테이블의 속성을 매핑
    private String nickname;  // 댓글을 단 사람

    @Column
    private String body;  // 댓글 본문
}
