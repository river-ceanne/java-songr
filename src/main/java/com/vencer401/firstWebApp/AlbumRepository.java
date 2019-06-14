package com.vencer401.firstWebApp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<Album, Long> {

    public List<Album> findByTitle(String title);
}
