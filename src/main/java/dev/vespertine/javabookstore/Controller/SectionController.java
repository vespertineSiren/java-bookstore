package dev.vespertine.javabookstore.Controller;

import dev.vespertine.javabookstore.Models.Section;
import dev.vespertine.javabookstore.Repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sections/")
public class SectionController {

    @Autowired
    SectionRepository sectionRepository;

    @GetMapping(value = "/sections")
    public List<Section> getAllSectionsfromBooStore(){
        return sectionRepository.findAll();
    }
}
