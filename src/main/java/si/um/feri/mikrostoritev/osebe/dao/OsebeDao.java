package si.um.feri.mikrostoritev.osebe.dao;

import org.springframework.data.repository.CrudRepository;
import si.um.feri.mikrostoritev.osebe.vao.Oseba;

public interface OsebeDao extends CrudRepository<Oseba, String> {

}
