/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana_9;

import java.util.ArrayList;
import java.util.List;
import semana_9.Entidades.Estudiantes;
import semana_9.Pantalla.ListaEstudiantes;
/**
 *
 * @author Estudiante
 */
public class Semana_9 {

    public static List<Estudiantes>EstudiantesGlobal = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here  
        ListaEstudiantes pantalla = new ListaEstudiantes();
        pantalla.setVisible(true);
        
    }
}
