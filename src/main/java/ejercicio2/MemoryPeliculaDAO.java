package ejercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoryPeliculaDAO {

    List<PeliculaTO> peliculas;

    public MemoryPeliculaDAO(){
        this.peliculas = new LinkedList<>();
    }

    public void add(PeliculaTO peliculaTO){
        if(!peliculas.contains(peliculaTO))
            peliculas.add(peliculaTO);
    }

    public List<PeliculaTO> getDisponibles(){
        return peliculas;
        //return new ArrayList<>(peliculas);
    }

    public void remove(PeliculaTO peliculaTO){
        peliculas.remove(peliculaTO);
    }

    public PeliculaTO removeById(int id){
        for(PeliculaTO pelicula: peliculas){
            if(pelicula.getId()==id){
                remove(pelicula);
                return pelicula;
            }
        }
    return null;
    }

    public List<PeliculaTO> getDisponiblesOrdenadas(){
        //return peliculas.sort(); <-- COMPARATOR
        return peliculas.stream().sorted().collect(Collectors.toList());
    }

}
