package com.bierbrauer.zebulon.notes;

public class NoteService {

    public Note findById(Long id) {
        // todo bring in repository to use DB
        return new Note(1l, "foo");
    }
}
