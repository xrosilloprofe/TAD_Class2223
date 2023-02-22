package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeliculaTO implements Comparable<PeliculaTO>{

    private static int next=0;
    private String titulo;
    private int id;
    private Map<String,String> actores;
    private List<String> directores;

    public PeliculaTO(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        actores = new HashMap<>();
        directores = new ArrayList<String>();
    }

    public PeliculaTO(String titulo) {
        this.id = next++;
        this.titulo = titulo;
        actores = new HashMap<>();
        directores = new ArrayList<String>();
    }

    public Map<String,String> getActores() {
        return actores;
    }

    public int getId(){ return id;}
    public String getTitulo(){ return titulo;}

    public void addActor(String actor, String rol) {
        actores.put(actor,rol);
    }

    @Override
    public int compareTo(PeliculaTO pelicula){
        return this.titulo.compareToIgnoreCase(pelicula.getTitulo());
    }

    @Override
    public String toString() {
        return "Pelicula: {" +
                "titulo=" + titulo +
                ", id=" + id +
//                ", actores=" + actores +
//                ", directores=" + directores +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof PeliculaTO))
            return false;
        PeliculaTO p = (PeliculaTO) obj;
        return p.id==id;
    }

}