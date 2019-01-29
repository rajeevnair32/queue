package com.spiderwire.queue.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1/queue")
public class QueueController {

    @PostMapping("/inqueue/{ticket}")
    public void inqueue(@PathVariable("ticket") final int ticket) {
    }

    @PostMapping("/current/{ticket}")
    public void current(@PathVariable("ticket") final int ticket) {
    }
}
