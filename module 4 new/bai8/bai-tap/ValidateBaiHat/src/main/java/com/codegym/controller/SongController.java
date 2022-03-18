package com.codegym.controller;

import com.codegym.model.Song;
import com.codegym.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("song")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("edit/{id}")
    public String result(@PathVariable Long id,Model model) {
        Song songs = songService.findById(id);
        model.addAttribute("songs",songs);
        return "result";
    }
    @PostMapping("edit")
    public String edit(@ModelAttribute Song songs,Model model, RedirectAttributes redirectAttributes){
        songService.save(songs);
        Long id = songs.getId();
        model.addAttribute("songs", songService.findById(id));
        String link = "redirect:/song/edit/" + id;
        redirectAttributes.addFlashAttribute("message", "Update success");
        return link;
    }
    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("song", new Song());
        return "create";
    }

    @PostMapping("create")
    public String create(@Validated @ModelAttribute Song song, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        new Song().validate(song, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            songService.save(song);
            redirectAttributes.addFlashAttribute("message", "Create Song success");
            String link = "redirect:/song/edit/" + song.getId();
            return link;
        }

    }
}
