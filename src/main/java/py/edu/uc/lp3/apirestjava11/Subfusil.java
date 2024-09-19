package py.edu.uc.lp3.apirestjava11;

// Clase para representar subfusiles
public class Subfusil extends ArmasDeFuego {
    private int precioDinero;
    private int nivelMinimoRequerido;

    // ... constructores, getters y setters ...


    public Subfusil(int precioDinero, int nivelMinimoRequerido) {
        this.precioDinero = precioDinero;
        this.nivelMinimoRequerido = nivelMinimoRequerido;
        this.descripcion = "Subfusil de bronce de la edad media";
        this.precio = 1700;
        this.nombre = "Subfusil MP7";
        this.carga = 30;
    }

    public int getPrecioDinero() {
        return precioDinero;
    }

    public void setPrecioDinero(int precioDinero) {
        this.precioDinero = precioDinero;
    }

    public int getNivelMinimoRequerido() {
        return nivelMinimoRequerido;
    }

    public void setNivelMinimoRequerido(int nivelMinimoRequerido) {
        this.nivelMinimoRequerido = nivelMinimoRequerido;
    }
}