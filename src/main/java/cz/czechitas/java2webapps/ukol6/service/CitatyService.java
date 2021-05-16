package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {
    private final NahodneCisloService nahodneCisloService;
    private final CitatyRepository citatyRepository;
    private String citat;



   @Autowired
   public CitatyService(NahodneCisloService nahodneCisloService, CitatyRepository citatyRepository) {
        this.nahodneCisloService = nahodneCisloService;
        this.citatyRepository = citatyRepository;
    }

    public String nahodnyCitat(){
     citat = citatyRepository.citat(nahodneCisloService.dejNahodneCislo(citatyRepository.pocet()));
        return citat;
    }
public String konkretniCitat(int poradi){
       citat=citatyRepository.citat(poradi);
       return citat;
}


}



