package si.um.feri.mikrostoritev.osebe.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import si.um.feri.mikrostoritev.osebe.dao.OsebeDao;
import si.um.feri.mikrostoritev.osebe.vao.Oseba;

@RestController
public class OsebeRest {

    @Autowired
    private OsebeDao osebeDao;


    @PostMapping("/osebe")
    public void dodajOsebo(Oseba o) {
        osebeDao.save(o);
    }

    @GetMapping("/osebe")
    public Iterable<Oseba> vseOsebe() {
        return osebeDao.findAll();
    }

    @GetMapping("/osebe/{email}")
    public Oseba najdiOsebo(@PathVariable("email") String email) {
        return osebeDao.findById(email).get();
    }

}
