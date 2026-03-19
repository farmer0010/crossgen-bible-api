package com.crossgen.bible_api.adapter.persistence;



import com.crossgen.bible_api.domain.bookmark.Bookmark;

import com.crossgen.bible_api.domain.bookmark.BookmarkRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Repository;



import java.util.List;

import java.util.Optional;



@Repository

@RequiredArgsConstructor

public class BookmarkPersistenceAdapter implements BookmarkRepository {



    private final BookmarkJpaRepository jpaRepository;



    @Override

    public Bookmark save(Bookmark bookmark) {

        return jpaRepository.save(bookmark);

    }



    @Override

    public Optional<Bookmark> findById(Long id) {

        return jpaRepository.findById(id);

    }



    @Override

    public List<Bookmark> findByUserId(Long userId) {

        return jpaRepository.findByUserId(userId);

    }



    @Override

    public void deleteById(Long id) {

        jpaRepository.deleteById(id);

    }

}