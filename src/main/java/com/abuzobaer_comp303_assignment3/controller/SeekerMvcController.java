package com.abuzobaer_comp303_assignment3.controller;

import com.abuzobaer_comp303_assignment3.entity.Seeker;
import com.abuzobaer_comp303_assignment3.service.SeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SeekerMvcController {

    @Autowired
    private SeekerService seekerService;

    @GetMapping
    public String getAll(Model model)
    {
        List<Seeker>  seekers=seekerService.getAll();
        model.addAttribute("seekers",seekers);

        return "index";
    }

    @GetMapping("new")
    public String addSeeker(Model model)
    {
        Seeker seeker=new Seeker();
        model.addAttribute("seeker",seeker);
        return "create_seeker";
    }

    @PostMapping("save")
    public String saveOrder(@Valid Seeker seeker, BindingResult bindingResult )
    {
        if(bindingResult.hasErrors())
        {return "create_seeker";}

        seekerService.save(seeker);

        return "redirect:/";
    }



    @GetMapping("update/{id}")
    public String showSeeker(Model model, @PathVariable int id)
    {
        Seeker seeker=seekerService.findById(id);
        model.addAttribute("seeker",seeker);

        return "create_seeker";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id)
    {
        seekerService.delete(id);

        return "redirect:/";
    }

}
