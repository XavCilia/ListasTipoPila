package listas_tipo_pila;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        
        do{
            try{
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu de Opciones \n\n"
                + "1. Insertar un nodo\n"
                + "2. Eliminar un nodo\n"
                + "3. ¿La Pila esta vacia?\n"
                + "4. ¿Cuál es el último valor ingresado en la Pila\n"
                + "5. ¿Cuántos nodos tiene la pila?\n"
                + "6. Vaciar Pila\n"
                + "7. Mostrar contenido de la Pila\n"
                + "8. Salir\n\n"));
                
                switch (opcion){
                    case 1:
                      nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                              "Ingresa el valor a guardar en el nodo" ));
                      pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor:"
                            + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía");
                        }
                        break;
                    case 3: 
                        if(pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "La Pila esta vacía");
                        
                        } else {
                          JOptionPane.showMessageDialog(null, "La pila No esta vacía");
                        
                        }
                        break;
                    case 4:
                        if (!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es:"
                        + pila.MostrarUltimoValorIngresado());
                    } else {
                        JOptionPane.showMessageDialog(null,"La Pila esta vacía" );
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La Pila contiene " + pila.TamanoPila() + " nodos");
                        break;
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente ");
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelva a intentar nuevamente.");
                        break;
            }
                
            } catch (NumberFormatException e){
            }
        } while (opcion != 8);
    }    
 }        
    

