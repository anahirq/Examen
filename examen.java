import java.io.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class examen  extends JFrame{
    
   public static void main (String[] args) throws IOException {
   
   int menu=0 , capt=0 , cons=0 , canc=0 ,  canc1=0 , camb=0 , x=1 ;
   int nump []= new int [19];       
   String app []= new String [19];/*Apellido pat profe*/    String appc []= new String [19]; //Apellido pat profe substring
   String amp []= new String [19];/*Apellido mat profe*/    String ampc []= new String [19]; //Apellido mat profe substring
   String nomp []= new String [19];/*Nombre profe*/         String nompc []= new String [19]; //Nombre substring
   String idp []= new String [19]; /*id profesor*/
   
   examen nomv =new examen();
      nomv.setVisible(true);
      nomv.setSize(2200,1200);
      nomv.getContentPane().setBackground(Color.GRAY);
      
   
   do{
   menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu \n 1. Captura \n 2. Consulta \n 3.Cancelaciones  \n 4.Cambios \n 5.Salida"));

   
      //CAPTURA
      if(menu==1){capt=Integer.parseInt(JOptionPane.showInputDialog(null,"MENU\n1-Profesores \n2-Alumnos "));
            if(capt==1){nump[x]=x;
                        app[x]=JOptionPane.showInputDialog(null,"Ingrese Apellido Paterno");
                           app[x]= app[x].toUpperCase(); 
                           appc[x]=app[x].substring(0,2);
            
                        amp[x]=JOptionPane.showInputDialog(null,"Ingrese Apellido Materno");
                           amp[x]= amp[x].toUpperCase(); 
                           ampc[x]=amp[x].substring(0,1);
                           
                        nomp[x]=JOptionPane.showInputDialog(null,"Ingrese Nombre");
                           nomp[x]= nomp[x].toUpperCase(); 
                           nompc[x]=nomp[x].substring(0,1);
                           
                        idp[x]=x+ appc[x]+ ampc[x]+ nompc[x];
            System.out.println(x+ appc[x]+ ampc[x]+ nompc[x]);
            
               }//capt1
            if(capt==2){}
      
      }//1

      //CONSULTAS
      if(menu==2){cons=Integer.parseInt (JOptionPane.showInputDialog (null, "MENU\n1-Boleta Grupo \n2-Boleta Alumno "));
            if(cons==1){}
            if(cons==2){}
      
      }//2
      
      //CANCELACIONES
      if(menu==3){canc=Integer.parseInt (JOptionPane.showInputDialog (null, "MENU\n1-Alumnos \n2-Calificaciones "));
            if(canc==1){canc1=Integer.parseInt (JOptionPane.showInputDialog (null, "MENU\n1-Fisicas \n2-Logicas \n3- Reinstalacion "));
            
            
            }//C1
            if(canc==2){canc1=Integer.parseInt (JOptionPane.showInputDialog (null, "MENU\n1-Fisicas \n2-Logicas \n3- Reinstalacion "));
            }//C2
      
      }//3
      
      //CAMBIOS
      if(menu==4){camb=Integer.parseInt (JOptionPane.showInputDialog (null, "Calificaciones"));}
   
      }while (menu!=5);
   
   }
  }