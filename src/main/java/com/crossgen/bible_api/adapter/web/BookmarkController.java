package com.crossgen.bible_api.adapter.web;

import com.crossgen.bible_api.application.bookmark.BookmarkService;
import com.crossgen.bible_api.domain.bookmark.Bookmark;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @PostMapping
    public ResponseEntity<Bookmark> createBookmark(@RequestBody BookmarkCreateRequest request) {
        Bookmark savedBookmark = bookmarkService.createBookmark(
                request.getUserId(),
                request.getBook(),
                request.getChapter(),
                request.getVerseCount(),
                request.getNote()
        );
        return ResponseEntity.ok(savedBookmark);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Bookmark>> getUserBookmarks(@PathVariable("userId") Long userId) {
        List<Bookmark> bookmarks = bookmarkService.getUserBookmarks(userId);
        return ResponseEntity.ok(bookmarks);
    }
}