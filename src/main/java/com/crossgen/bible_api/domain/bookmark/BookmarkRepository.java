package com.crossgen.bible_api.domain.bookmark;

import java.util.List;
import java.util.Optional;

public interface BookmarkRepository {
    Bookmark save(Bookmark bookmark);

    // Optional 옵션을 사용하는 이유는 없을수도 있으니깐 사용
    Optional<Bookmark> findById(Long id);

    List<Bookmark> findByUserId(Long userId);

    void deleteById(Long id);
}
