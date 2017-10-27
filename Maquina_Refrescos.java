
package maquina_refrescos;

import java.util.*;


public class Maquina_Refrescos {
 
 
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int menu, rep, resp, contra, respAdmi, menuAdmi2, VolverI;

        int COCA[] = new int [5];
        int topeC = 5;
        int tempC = 0;
        
        int MANZANA[] = new int [5];
        int topeM = 5;
        int tempM = 0;
        
        int SANGRIA[] = new int [5];
        int topeS = 5;
        int tempS = 0;
        
        int FANTA[] = new int [5];
        int topeF = 5;
        int tempF = 0;
        
        System.out.println("\n\n\n\n\n\t\t\t\t\t\t\tPOR FAVOR ESPERA UN MOMENTO ...");
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
        }
        
       
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");   
        System.out.println("BIENVENIDO..! \n");
        System.out.print("QUIERES INGRESAR A NUESTRA MAQUINA DE REFRESCOS \n\t  1.SI  2.NO: =  ");
        rep=t.nextInt();
        
        while(rep>2){
              System.out.println("\n*******************************************");
              System.out.println("\t     ERROR");
              System.out.print("\n INGRESA DE NUEVO  =>  1.SI  2.NO: =   ");
              rep=t.nextInt();
        }
        
        if(rep==2){
            System.out.println("");
            System.out.println("******************** \n");   
            System.out.println("HASTA PRONTO...!! \n");
            System.out.println("******************** \n");
        }//Fin del IF
        
        while(rep==1){
              System.out.println("\n-----------------------------------------"); 
              System.out.println("\t\tMAQUINA DE REFRESCOS \t|");
              System.out.println(" 1.COCA - COLA  \t\t\t| \n 2.MANZANITA \t\t\t\t| \n 3.SANGRIA \t\t\t\t| \n 4.FANTA  \t\t\t\t| \n 5.ADMINISTRADOR \t\t\t| \n 0.SALIR \t\t\t\t|");
              System.out.println("-----------------------------------------"); 
              System.out.print("INGRESA UNA OPCION: ");
              menu=t.nextInt();
              
              if(menu==0){
                System.out.println("");
                System.out.println("******************** \n");   
                System.out.println("HASTA PRONTO...!! \n");
                System.out.println("******************** \n");
                 break;
               }
              while(menu>5){
                   System.out.println("\n-----------------------------------------");
                   System.out.println("\t ERROR \t\t\t\t|");
                   System.out.println("\t\tMAQUINA DE REFRESCOS \t|");
                   System.out.println(" 1.COCA - COLA  \t\t\t| \n 2.MANZANITA \t\t\t\t| \n 3.SANGRIA \t\t\t\t| \n 4.FANTA  \t\t\t\t| \n 5.ADMINISTRADOR \t\t\t| \n 0.SALIR \t\t\t\t|");
                   System.out.println("-----------------------------------------\n");
                   System.out.print("VUELVE A ELEGIR:  ");
                   menu=t.nextInt();
              }//Fin del While
            
              switch(menu){
                  case 1:
                        System.out.println("\n\n+++++++++++++++++++++++++++++ ");
                        System.out.println("\tCOCA - COLA \t");
                        System.out.print("DESEAS TOMAR UNA COCA-COLA =>  1.SI  2.NO =  ");
                        resp=t.nextInt();
                        if(resp==2){
                                 System.out.println("\n");
                                 System.out.println("************************************ \n");   
                                 System.out.println("PUEDES PEDIR OTRO REFRESCO...!! \n");
                                 System.out.println("************************************ \n");
                                 break; 
                            }
                        while(resp>2){
                            System.out.println("\n*****************************");
                            System.out.print("ERROR, VULVE A ELEGIR: \n ");
                            System.out.print("\t 1.SI  2.NO = ");       
                            resp=t.nextInt();
                            System.out.println("*****************************\n");
                        }//Fin del while
                        
                        if(resp==1){
                            if(topeC==0){
                                System.out.println("\n");
                                System.out.println("==================================================="); 
                                System.out.println("ESCANEANDO MAQUINA DE COCAS, UN MOMENTO........ \t \n");
                                try{Thread.sleep(2000);} catch(InterruptedException e){}
                                System.out.println("\t\tUPS, LO SENTIMOS *** \n");
                                System.out.println("       LA MAQUINA YA NO CUENTA CON REFRESCOS");
                                System.out.println("==================================================="); 
                            }//Fin del If
                            else{
                                 tempC = COCA[topeC-1];
                                 COCA[topeC-1] = 0;
                                 topeC--;
                                 System.out.println("\n\n========================================| \n"); 
                                 System.out.println("ENTREGANDO COCA - COLA.......... \t| \n");
                                 try{Thread.sleep(3500);} catch(InterruptedException e){}
                                 System.out.println("\t LISTO QUE TE REFRESQUES  \t| \n");
                                 System.out.println("========================================| "); 
                                 System.out.println("A LA MAQUINA LE QUEDAN : " + topeC + " COCAS        |\n\n");
                                 }//Fin del else de en caso de que tope no valga 0
                        }//Fin del if de resp==1
                      break;
                     
                  case 2:
                        System.out.println("\n\n+++++++++++++++++++++++++++++ ");
                        System.out.println("\tMANZANITA \t");
                        System.out.print("DESEAS TOMAR UNA MANZANITA =>  1.SI  2.NO =  ");
                        resp=t.nextInt();
                        if(resp==2){
                                 System.out.println("\n");
                                 System.out.println("************************************ \n");   
                                 System.out.println("PUEDES PEDIR OTRO REFRESCO...!! \n");
                                 System.out.println("************************************ \n");
                                 break; 
                            }
                        while(resp>2){
                            System.out.println("\n*****************************");
                            System.out.print("ERROR, VULVE A ELEGIR: \n ");
                            System.out.print("\t 1.SI  2.NO = ");       
                            resp=t.nextInt();
                            System.out.println("*****************************\n");
                        }//Fin del while
                        
                        if(resp==1){
                            if(topeM==0){
                                System.out.println("\n");
                                System.out.println("==================================================="); 
                                System.out.println("ESCANEANDO MAQUINA DE MANZANITAS, UN MOMENTO........ \t \n");
                                try{Thread.sleep(2000);} catch(InterruptedException e){}
                                System.out.println("\t\tUPS, LO SENTIMOS *** \n");
                                System.out.println("       LA MAQUINA YA NO CUENTA CON REFRESCOS");
                                System.out.println("==================================================="); 
                            }//Fin del If
                            else{
                                 tempM = MANZANA[topeM-1];
                                 MANZANA[topeM-1] = 0;
                                 topeM--;
                                 System.out.println("\n\n========================================| \n"); 
                                 System.out.println("ENTREGANDO MANZANITA.......... \t\t| \n");
                                 try{Thread.sleep(3500);} catch(InterruptedException e){}
                                 System.out.println("\t LISTO QUE TE REFRESQUES  \t| \n");
                                 System.out.println("========================================| "); 
                                 System.out.println("A LA MAQUINA LE QUEDAN : " + topeM + " MANZANITAS   |\n\n");
                                 }//Fin del else de en caso de que tope no valga 0
                        }//Fin del if de resp==1
                      break;

                  case 3:
                        System.out.println("\n\n+++++++++++++++++++++++++++++ ");
                        System.out.println("\tSANGRIA \t");
                        System.out.print("DESEAS TOMAR UNA SANGRIA =>  1.SI  2.NO =  ");
                        resp=t.nextInt();
                        if(resp==2){
                                 System.out.println("\n");
                                 System.out.println("************************************ \n");   
                                 System.out.println("PUEDES PEDIR OTRO REFRESCO...!! \n");
                                 System.out.println("************************************ \n");
                                 break; 
                            }
                        while(resp>2){
                            System.out.println("\n*****************************");
                            System.out.print("ERROR, VULVE A ELEGIR: \n ");
                            System.out.print("\t 1.SI  2.NO = ");       
                            resp=t.nextInt();
                            System.out.println("*****************************\n");
                        }//Fin del while
                        
                        if(resp==1){
                            if(topeS==0){
                                System.out.println("\n");
                                System.out.println("==================================================="); 
                                System.out.println("ESCANEANDO MAQUINA DE COCAS, UN MOMENTO........ \t \n");
                                try{Thread.sleep(2000);} catch(InterruptedException e){}
                                System.out.println("\t\tUPS, LO SENTIMOS *** \n");
                                System.out.println("       LA MAQUINA YA NO CUENTA CON REFRESCOS");
                                System.out.println("==================================================="); 
                            }//Fin del If
                            else{
                                 tempS = SANGRIA[topeS-1];
                                 SANGRIA[topeS-1] = 0;
                                 topeS--;
                                 System.out.println("\n\n========================================| \n"); 
                                 System.out.println("ENTREGANDO SANGRIA.......... \t\t| \n");
                                 try{Thread.sleep(3500);} catch(InterruptedException e){}
                                 System.out.println("\t LISTO QUE TE REFRESQUES  \t| \n");
                                 System.out.println("========================================| "); 
                                 System.out.println("A LA MAQUINA LE QUEDAN : " + topeS + " SANGRIAS    |\n\n");
                                 }//Fin del else de en caso de que tope no valga 0
                        }//Fin del if de resp==1
                      break;
                 
                  case 4:
                        System.out.println("\n\n+++++++++++++++++++++++++++++ ");
                        System.out.println("\tFANTA \t");
                        System.out.print("DESEAS TOMAR UNA FANTA =>  1.SI  2.NO =  ");
                        resp=t.nextInt();
                        if(resp==2){
                                 System.out.println("\n");
                                 System.out.println("************************************ \n");   
                                 System.out.println("PUEDES PEDIR OTRO REFRESCO...!! \n");
                                 System.out.println("************************************ \n");
                                 break; 
                            }
                        while(resp>2){
                            System.out.println("\n*****************************");
                            System.out.print("ERROR, VULVE A ELEGIR: \n ");
                            System.out.print("\t 1.SI  2.NO = ");       
                            resp=t.nextInt();
                            System.out.println("*****************************\n");
                        }//Fin del while
                        
                        if(resp==1){
                            if(topeF==0){
                                System.out.println("\n");
                                System.out.println("==================================================="); 
                                System.out.println("ESCANEANDO MAQUINA DE FANTAS, UN MOMENTO........ \t \n");
                                try{Thread.sleep(2000);} catch(InterruptedException e){}
                                System.out.println("\t\tUPS, LO SENTIMOS *** \n");
                                System.out.println("       LA MAQUINA YA NO CUENTA CON REFRESCOS");
                                System.out.println("==================================================="); 
                            }//Fin del If
                            else{
                                 tempF = FANTA[topeF-1];
                                 FANTA[topeF-1] = 0;
                                 topeF--;
                                 System.out.println("\n\n========================================| \n"); 
                                 System.out.println("ENTREGANDO FANTA.......... \t\t| \n");
                                 try{Thread.sleep(3500);} catch(InterruptedException e){}
                                 System.out.println("\t LISTO QUE TE REFRESQUES  \t| \n");
                                 System.out.println("========================================| "); 
                                 System.out.println("A LA MAQUINA LE QUEDAN : " + topeF + " FANTAS   |\n\n");
                                 }//Fin del else de en caso de que tope no valga 0
                        }//Fin del if de resp==1
                      break;
                      
                  case 5:
                       System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                       System.out.println("INGRESA TU PASSWORD:  ");
                       contra=t.nextInt();
                      
                       if(contra!=1618){
                         System.out.println("\nVERIFICANDO PASSWORD, UN MOMENTO........ \t");
                         try{Thread.sleep(500);} catch(InterruptedException e){}
                         System.out.println("\nPASSWORD INVALIDO");
                         System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                       }//Cierro el If si es != de la contra
                       
                       if(contra==1618){
                           System.out.println("\nVERIFICANDO PASSWORD, UN MOMENTO........ \t");
                           try{Thread.sleep(500);} catch(InterruptedException e){}
                           System.out.println("\n***PASSWORD CORRECTO ***");
                           
                             System.out.print("DESEAS CONTINUAR  1.SI  2.NO:  ");
                             respAdmi=t.nextInt();
                             while(respAdmi==1)
                             {
                             if(respAdmi==2){
                                System.out.println("");
                                System.out.println("************************* \n");   
                                System.out.println("HASTA PRONTO ADMIN...!! \n");
                                System.out.println("************************* \n");
                                break; 
                                }//Cierro if para salir
                             
                             if(respAdmi==1){
                                  System.out.println("\n´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´\n");
                                  System.out.println("\t\t\tMENU ADMIN \n");
                                  System.out.print("VER CUANTOS REFRESCOS QUEDAN EN LAS MAQUINAS  1.SI  2.NO =  ");
                                  respAdmi=t.nextInt();
                                  System.out.println("");
                                  if(respAdmi==2){
                                      System.out.println("");
                                      System.out.println("************************* \n");   
                                      System.out.println("HASTA PRONTO ADMIN...!! \n");
                                      System.out.println("************************* \n");
                                      break;        
                                  }
                                  if(respAdmi==1){
                                   for(int c=0; c<=topeC ; c++){
                                      System.out.println("EN LA MAQUINA DE COCAS      QUEDAN: " + topeC + " PIEZAS \t\t\t´´");
                                      break;
                                      }//Fin de la maquina de Cocas

                                  for(int m=0; m<=topeM ; m++){
                                      System.out.println("EN LA MAQUINA DE MANZANAS   QUEDAN: " + topeM + " PIEZAS \t\t\t´´");
                                      break;
                                  }//Fin de la maquina de Manzanas

                                  for(int s=0; s<=topeS ; s++){
                                      System.out.println("EN LA MAQUINA DE SANGRIAS   QUEDAN: " + topeS + " PIEZAS \t\t\t´´");
                                      break;
                                  }//Fin de la maquina de Manzanas

                                  for(int f=0; f<=topeF ; f++){
                                      System.out.println("EN LA MAQUINA DE FANTAS     QUEDAN: " + topeF + " PIEZAS \t\t\t´´ \n");
                                      break;
                                  }//Fin de la maquina de Manzana
                                  System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
                                  }//Cierro if si el admin dice que si 
                             }//Fin del if si el admin quiere ver cuantos refrescos quedan
                             }//Aqui iria el while
                       }//Cierro el if si la contraseña coincide
                      break;
                 
                  default:{
                     System.out.println("");
                     System.out.println("******************** \n");   
                     System.out.println("HASTA LUEGO...!! \n");
                     System.out.println("******************** \n");
                  }//Fin del default
              }//Fin del Switch del Menu
        }//Fin del While
    }//Fin del Main
}//Fin de la clase
