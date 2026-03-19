package com.crossgen.bible_api.application.bookmark;

import com.crossgen.bible_api.domain.bookmark.Bookmark;
import com.crossgen.bible_api.domain.bookmark.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor // final이 붙은 필드를 위한 생성자 자동 생성
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;

    @Transactional
    public Bookmark createBookmark(Long userId, int book, int chapter, int verseCount, String note){
        Bookmark bookmark = Bookmark.builder()
                .userId(userId)
                .book(book)
                .chapter(chapter)
                .verseCount(verseCount)
                .note(note)
                .build();
        return bookmarkRepository.save(bookmark);
    }

    @Transactional(readOnly = true)
    public List<Bookmark> getUserBookmarks(Long userId){
        return bookmarkRepository.findByUserId(userId);
    }
}
