package pl.brych.aop_email_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.brych.aop_email_api.aop.MailSender;
import pl.brych.aop_email_api.dto.Film;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    private List<Film> filmList;

    public ApiController() {
        filmList = new ArrayList<>();

        filmList.add(new Film("Titanic", 1990, "Disney"));
        filmList.add(new Film("Terminator", 1995, "Pixar"));
        filmList.add(new Film("Reksio", 1985, "ZebraStudio"));

    }

    @GetMapping
    public List<Film> sendEmailToUser(){
        return filmList;
    }

    @PostMapping("/addFilm")
    @MailSender
    public void addFilm(@RequestBody Film film){
        filmList.add(film);
    }
}
