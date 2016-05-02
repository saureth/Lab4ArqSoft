package CDI;

import javax.enterprise.inject.Default;

/**
 *
 * @author santiago.sanmartin
 */
@Default
@Informal
public class SaludoInformal implements Saludo{

    @Override
    public String Saludar(String nombre) {
        return "Qué hubo " + nombre;
    }
    
}
