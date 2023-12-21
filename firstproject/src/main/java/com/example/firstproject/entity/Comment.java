package com.example.firstproject.entity;

import com.example.firstproject.service.ArticleService;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // 해당 댓글 엔티티 여러개가, 하나의 Article에 연관된다!
    @JoinColumn(name = "article_id") // "article_id" 컬럼에 Article의 대표
    private Article article;

    @Column
    private String nickname;

    @Column
    private String body;
}
