/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto_f;
import java.util.Scanner;

/**
 *
 * @author 7040 i5 lab7
 */
public class PROYECTO_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op; //Variable para controlar la opcion
        Scanner data=new Scanner(System.in);
        String pr[]= new String[10]; // Arreglo de las preguntas
        String res[][]= new String [10][4]; //Arrreglo de las respuestas
        Integer resc [] = new Integer[10]; //Arreglo de los indices de las respuestas correctas
        Integer puntpr []= new Integer [10];  //Arreglo del puntaje por pregunta
        
       
        
               
        
         pr[0]="¿Cuando inicio la Primera Guerra Mundial?";   //Se cargan las preguntas y respuestas a los respectivos arreglos.
             res[0][0]="1920.";
             res[0][1]="1914.";
             res[0][2]="1912.";
             res[0][3]="1903.";
             puntpr[0]=10;
             resc[0]=1;
             
        
             pr[1]="¿Que nacion participo segun sus intereses en ambos bandos durante la Primera Guerra Mundial?";
             res[1][0]="Estados Unidos.";
             res[1][1]="Imperio Britanico.";
             res[1][2]="Reino de Italia.";
             res[1][3]="Republica Francesa."; 
             puntpr[1]=10;
             resc[1]=2;
             
             pr[2]="¿Cuando inicio la revolucion rusa en contra del Zar Nicolas II?";
             res[2][0]="1921.";
             res[2][1]="1910.";
             res[2][2]="1917.";
             res[2][3]="1919.";
             puntpr[2]=10;
             resc[2]=3;
             
             pr[3]="¿Que presidente introdujo a Estados Unidos en la Primera Guerra Mundial?";
             res[3][0]="Wilson.";
             res[3][1]="Kennedy.";
             res[3][2]="Lincoln.";
             res[3][3]="G. Washington.";
             puntpr[3]=10;
             resc[3]=0;
             
             pr[4]="¿Cual fue el modelo de tanque predilecto por el Imperio Britanico durante la Primera Guerra Mundial?";
             res[4][0]="FT-17.";
             res[4][1]="Mark-V.";
             res[4][2]="St. Chamond.";
             res[4][3]="Little Willie.";
             puntpr[4]=10;
             resc[4]=1;
             
             pr[5]="¿Quien dirigio a las fuerzas revolucionarias durante la Revolucion Rusa?";
             res[5][0]="Stalin.";
             res[5][1]="Putilov.";
             res[5][2]="Lenin.";
             res[5][3]="Federov.";
             puntpr[5]=10;
             resc[5]=2;
             
             pr[6]="¿Contra que nacion el Imperio Otomano libró mas batallas durante la Primera Guerra Mundial?";
             res[6][0]="Imperio Aleman.";
             res[6][1]="Republica Francesa.";
             res[6][2]="Imperio Ruso.";
             res[6][3]="Imperio Britanico.";
             puntpr[6]=10;
             resc[6]=3;
             
             pr[7]="¿Que obligo al Imperio Aleman a retirarse de la Primera Guerra Mundial?";
             res[7][0]="Falta de combustible, alimentos y descanso.";
             res[7][1]="Invasion Rusa al territorio aleman.";
             res[7][2]="Ataque de artilleria coordinado por parte de los aliados.";
             res[7][3]="Empleo de armas quimicas.";
             puntpr[7]=10;
             resc[7]=0;
             
             
             pr[8]="¿Que ocasiono el mayor numero de bajas durante la Primera Guerra Mundial?";
             res[8][0]="Tanques.";
             res[8][1]="Artilleria.";
             res[8][2]="Gas Venenoso.";
             res[8][3]="Flotas navales.";
             puntpr[8]=10;
             resc[8]=1;
             
             pr[9]="¿Que caracterizo a la Primera Guerra Mundial?";
             res[9][0]="Uso de trincheras.";
             res[9][1]="Tacticas agresivas del Imperio Aleman.";
             res[9][2]="Empleo de tacticas del siglo pasado junto con armamento moderno.";
             res[9][3]="Uso de armas automaticas.";
             puntpr[9]=10;
             resc[9]=2;
        
          
        
        
        do{
        System.out.println("                          Juego de Trivia");//Menu
        System.out.println("1.    Configuracion");
        System.out.println("2.    Juego");
        System.out.println("3.    Consulta de puntajes obtenidos");
        System.out.println("4.    Salir");
        System.out.println("");
        System.out.println("Digite la opcion que desee: ");
        op=data.nextInt();
        System.out.println("");
       
        selec(op,pr,res,resc,puntpr); 
        }while(op!=4); //Mientras que la opcion sea distinta a salir se repetira el menu
         // Llamado a la funcion para el acceso a la opcion que desee el usuario        
        
                     
       
        
    }
    
    
    public static void selec(int a, String pr[],String res[][],Integer resc[],Integer puntpr[] ){ //Funcion que resibe el numero de la opcion que desee el usuario
        Scanner data2=new Scanner(System.in);
        
        String pri; //Pregunta ingresada por el usuario
        Integer i; //Para controlar for
        Integer f,c; //Para controlar for
        Integer cf; //Para controlar que opcion dentro de configuracion desea realizar el usuario.
        Integer rescu; //Para conocer el indice de la respuesta correcta que ha ingresado el usuario.
        Integer puntpru; //Para conocer el puntaje de la respuesta correcta ingresado por el usuario.
        String jugador[]=new String[100]; //Para almacenar los nombres de los usuarios.
        Integer cu=-1; //Para contar a los usuarios;
        
        
        
       
        
        
               
        switch(a){ //Switch para controlar el menu
            
            case 1: 
              System.out.println("Por favor espere");
             try{
             Thread.sleep(2000);            //Para pausar el programa 2 segundos
             }catch(InterruptedException e ) {
                 
             }   
             
             
          
             System.out.println("                  PREGUNTAS Y RESPUESTAS POR DEFECTO"); //Se imprimen las preguntas y respuestas por defecto
             System.out.println("");
             System.out.println("Cargando preguntas y respuestas");
            
             
             try{
             Thread.sleep(1000);            //Para pausar el programa 1 segundo
             }catch(InterruptedException e ) {
                 
             }   
             
             
             
             
             
             
             for(i=0; i<10; i++){        //Para imprimir las preguntas y respuestas por defecto
                 System.out.println((i+1)+ ") " +pr[i]);
                 System.out.println("");
                 
                 for(c=0; c<4; c++){
                 System.out.println((c+1)+ ") " +res[i][c]);
                 
                 
                 
                 }
                 System.out.println("");
                 try{
                 Thread.sleep(1000);            //Para pausar el programa 1 segundo
                 }catch(InterruptedException e ) {
                 
             } 
             
             
             }
             System.out.println("");
             do {
             
             System.out.println("1.Cambiar una pregunta y sus respuestas."); //Sub menu de Configuracion
             System.out.println("2.Eliminar una pregunta y sus respuestas.");
             System.out.println("3.Volver al menu");
             System.out.println("Seleccione la opcion que desee: ");
             cf=data2.nextInt();
             }while(cf<1 || cf>3);
             
             if(cf==1){
             do{    
             System.out.println("Introduzca el numero de la pregunta que desea cambiar: ");
             i=data2.nextInt();
             
             }while(i<1 || i>10);
             data2.skip("\n");
              //Para que no se salta la siguiente linea
             System.out.println("Introduzca la nueva pregunta #"+i);
             pri=data2.nextLine();
             if(pri.equals(pr[i-1])){ //Para impedir que el usuario ingrese una pregunta ya existente
             System.out.println("La pregunta que ha ingresado es igual a la pregunta numero # "+i);
             System.out.println("\n");
             
             }
             else{
             pr[i-1]=""; //Para limpiar la pregunta de la posicion i
             pr[i-1]=pri; //Para asignarle a la posicion i-1 la pregunta ingresada por el usuario
             System.out.println("Cambio de las respuestas: ");
             System.out.println("\n");
             for(c=0;c<4;c++){    //Para limpiar las respuestas anteriores
             res[i-1][c]="";
             
             
             
             }
             
             
             
             
             
             
             for(c=0;c<4;c++){ //Para pedir las nuevas respuestas
             System.out.println("Ingrese la respuesta #"+(c+1) +": ");
             res[i-1][c]=data2.nextLine();
             System.out.println("");
             
             
             }
             resc[i-1]=-1;  //Para impedir un rango valido de respuestas ya que se procedera a cambiar dicha respuesta correcta.
             System.out.println("Ingrese el numero de la respuesta corresta: ");
             rescu=data2.nextInt();
             resc[i-1]=rescu;
             puntpr[i-1]=0;
             System.out.println("Ingrese el puntaje de la respuesta correcta: ");
             puntpru=data2.nextInt();
             puntpr[i-1]=puntpru;
             System.out.println("Por favor espere");
             try{
             Thread.sleep(2000);            //Para pausar el programa 2 segundos
             }catch(InterruptedException e ) {
                 
             }
             
             
             
             
             
             System.out.println("Preguntas y respuestas actualizadas.");
             System.out.println("");
             for(i=0; i<10; i++){
             System.out.println((i+1)+ ") "+ pr[i]);
             System.out.println("");
              for(c=0; c<4; c++){
                 System.out.println((c+1)+ ") " +res[i][c]);
                 
                 
                 
                 }
              
             
             System.out.println("");
              try{
                 Thread.sleep(1000);            //Para pausar el programa 1 segundo
                 }catch(InterruptedException e ) {
                 
             } 
                  
             
             }
             }
             }
             
             else if(cf==2){
                 i=0;
                 System.out.println("Ingrese el numero de la pregunta que desea eliminar:");
                 i=data2.nextInt();
                 System.out.println("Eliminando la pregunta #" +i + " por favor espere...");
                 try{
                 Thread.sleep(1000);            //Para pausar el programa 2 segundo
                 }catch(InterruptedException e ) {
                 
                 } 
                 
                
                 
                 
                 pr[i-1]=""; //Para borrar la pregunta
                 resc[i-1]=-1; //Para impedir la seleccion de una respuesta ya que seras eliminadas.
                 puntpr[i-1]=0; //Asignar 0 al puntaje de la pregunta ya que se ha eliminado
                 for(c=0; c<4; c++){
                 res[i-1][c]="";
                 
                 
                 
                 }
                 
             System.out.println("Preguntas y respuestas actualizadas.");
             System.out.println("");
             for(i=0; i<10; i++){
             System.out.println((i+1)+ ") "+ pr[i]);
             System.out.println("");
              for(c=0; c<4; c++){
                 System.out.println((c+1)+ ") " +res[i][c]);
                 
                 
                 
                 }
              
             
             System.out.println("");
              try{
                 Thread.sleep(1000);            //Para pausar el programa 1 segundo
                 }catch(InterruptedException e ) {
                 
             } 
                  
             
             }
             
                 
                 
             }
             
             
             
            
                        
                
                
                break;
                
            case 2:
                System.out.println("Ingrese un nombre de usuario: ");
                cu=cu+1;
                jugador[cu]=data2.nextLine();
                
                
               
             
                
                
                
                
                
                
                
                
                
                
                
                
                
                
             break;    
            case 3:
                break;
                
                
            case 4:
                System.exit(0);
                break;
                
            default:
                System.out.println("Opcion fuera de rango.");
                
        
        
        
        
        
        
        
        
        
        }
    
    
    
    
    
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

