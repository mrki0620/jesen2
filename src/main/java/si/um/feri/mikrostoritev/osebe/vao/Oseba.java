package si.um.feri.mikrostoritev.osebe.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Oseba {

    public Oseba(String ime, String priimek, String email) {
        this.ime = ime;
        this.priimek = priimek;
        this.email = email;
    }

    private String ime;

    private String priimek;

    @Id
    private String email;

}
