/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Abril-2024 
 */
package especies;

public class Fungi {
    private String nombreComun;
    private String nombreCientifico;
    private String Reino;
    private String Clase;
    private String Orden;

    public Fungi(String nombreComun, String nombreCientifico, String Reino, String Clase, String Orden) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.Reino = Reino;
        this.Clase = Clase;
        this.Orden = Orden;
    }

    @Override
    public String toString() {
        return "Fungi{" +
                "nombreComun='" + nombreComun + '\'' +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                ", Reino='" + Reino + '\'' +
                ", Clase='" + Clase + '\'' +
                ", Orden='" + Orden + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fungi fungi = (Fungi) o;
        return nombreComun.equals(fungi.nombreComun) &&
                nombreCientifico.equals(fungi.nombreCientifico) &&
                Reino.equals(fungi.Reino) &&
                Clase.equals(fungi.Clase) &&
                Orden.equals(fungi.Orden);
    }
}
