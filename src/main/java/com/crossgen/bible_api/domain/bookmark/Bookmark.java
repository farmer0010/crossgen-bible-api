package com.crossgen.bible_api.domain.bookmark;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookmarks")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(nullable = false)
    private int book;

    @Column(nullable = false)
    private int chapter;

    @Column(name = "verse_count", nullable = false)
    private int verseCount;

    @Column(length = 500)
    private String note;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Builder
    public Bookmark(Long userId, int book, int chapter, int verseCount, String note) {
        this.userId = userId;
        this.book = book;
        this.chapter = chapter;
        this.verseCount = verseCount;
        this.note = note;
        this.createdAt = LocalDateTime.now();
    }

    public void updateNote(String newNote) {
        this.note = newNote;
    }
}