package cz.czechitas.java2webapps.ukol6.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import cz.czechitas.java2webapps.ukol6.service.CitatyRepository;
import cz.czechitas.java2webapps.ukol6.service.CitatyService;
import cz.czechitas.java2webapps.ukol6.service.NahodneCisloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

/**
 *
 */
@Controller
public class CitatyController {

private final CitatyService citatyService;

@Autowired
  public CitatyController(CitatyService citatyService){this.citatyService = citatyService;
}

@GetMapping("/")
  public ModelAndView citat() {
   return new ModelAndView("citat")
          .addObject("citat", citatyService.nahodnyCitat());
}

  @GetMapping("/{poradi}")
  public ModelAndView konkretniCitat(@PathVariable int poradi) {
    return new ModelAndView("citat")
            .addObject("citat", citatyService.konkretniCitat(poradi));

  }


}