package org.swordess.toy.spring.cpscanning;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SimpleMovieLister {

    @Resource
    private MovieFinder movieFinder;

    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

}
