package com.crossgen.bible_api.domain.bookmark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BookmarkTest {

    @Test
    @DisplayName("북마크가 정상적으로 생성되고, 메모(note)가 수정되어야 한다.")
    void updateNoteTest() {
        Bookmark bookmark = Bookmark.builder()
                .userId(1L)
                .book(43)
                .chapter(3)
                .verseCount(16)
                .note("처음 적은 묵상 메모")
                .build();

        String updatedNote = "하나님이 세상을 이처럼 사랑하사";
        bookmark.updateNote(updatedNote);

        assertThat(bookmark.getNote()).isEqualTo(updatedNote);
        assertThat(bookmark.getBook()).isEqualTo(43);
        assertThat(bookmark.getVerseCount()).isEqualTo(16);
    }
}