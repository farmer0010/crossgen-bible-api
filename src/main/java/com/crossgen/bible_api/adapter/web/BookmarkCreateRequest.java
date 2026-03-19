package com.crossgen.bible_api.adapter.web;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public class BookmarkCreateRequest {
    private Long userId;
    private int book;
    private int chapter;
    private int verseCount;
    private String note;
}
