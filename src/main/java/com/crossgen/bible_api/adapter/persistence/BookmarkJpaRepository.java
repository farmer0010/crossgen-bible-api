package com.crossgen.bible_api.adapter.persistence;

import com.crossgen.bible_api.domain.bookmark.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookmarkJpaRepository extends JpaRepository<Bookmark, Long> {
    List<Bookmark> findByUserId(Long userId);
}