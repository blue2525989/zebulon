package com.bierbrauer.zebulon.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController(value="/notes")
public class NoteController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public Note getNote(@RequestParam(value = "message", defaultValue = "This is the note body") String message) {
        return new Note(counter.incrementAndGet(), message);
    }
}
