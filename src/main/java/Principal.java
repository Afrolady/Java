
public class Principal {
    
    public static void main(String[] args){
        
        //Crear personaje 
        //en los parentesis se escribe lo que se coloco en el constructor. llamo al constructor.  este es un onjeto que tiene un nombre, un genero y es de tipo Juego
        
        System.out.println("*****************");
        Juego miJuego = new Juego(nombre:"JuanMa", sexo:'M');  
        System.out.println(miJuego.getNombre()); //Muestra el nombre
        System.out.println(miJuego.getSexo()); //Muestra el sexo
        System.out.println(miJuego.getpositionX());
        System.out.println(miJuego.getpositionY());
        
        System.out.println(miJuego.getVida());
        miJuego.usarBotiquin();
        System.out.println(miJuego.getVida());
         
    }
    
}
