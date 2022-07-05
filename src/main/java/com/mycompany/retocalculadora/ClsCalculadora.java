package com.mycompany.retocalculadora;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Juan Espinosa
 */
public class ClsCalculadora {

    public ClsCalculadora() {
    }

    public void IniciarPrograma() {

        String menu_inicial = """
                            Seleccione una opción:
                              
                            1. Realizar una operación
                            2. Salir
                            """;
        String opcion_menu = "";

        String menu_operacion = """
                            Seleccione una operación
                                
                            1. Suma
                            2. Resta
                            3. Multiplicación
                            4. División
                            5. Potencia
                            6. Raíz Cuadrada
                            7. Salir
                             
                            """;

        String opcion_operacion = "";

        do {

            opcion_menu = JOptionPane.showInputDialog(menu_inicial);
            DecimalFormat formato = new DecimalFormat("#.00");

            switch (opcion_menu) {
                case "1" -> {
                    opcion_operacion = JOptionPane.showInputDialog(menu_operacion);
                    do {
                        

                        if (opcion_operacion.equals("1") || opcion_operacion.equals("2") || opcion_operacion.equals("3") || opcion_operacion.equals("4") || opcion_operacion.equals("5")) {
                            double numero_1 = 0;
                            double numero_2 = 0;

                            try {
                                numero_1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número: "));

                                numero_2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número: "));
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos");
                               
                                break;
                            }
                            
                            switch (opcion_operacion) {
                                
                                case "1":
                                    double suma = numero_1 + numero_2;
                                    JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + formato.format(suma));
                                    break;

                                case "2":
                                    double resta = numero_1 - numero_2;
                                    JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + formato.format(resta));
                                    break;

                                case "3":
                                    double multiplicacion = numero_1 * numero_2;
                                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + formato.format(multiplicacion));
                                    break;
                                case "4":

                                    if (numero_2 != 0) {
                                        
                                        double division = numero_1 / numero_2;
                                        JOptionPane.showMessageDialog(null, "El resultado de la división es: " + formato.format(division));
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El segundo número debe ser diferente de cero");
                                    }
                                    break;
                                case "5":
                                    double potencia = Math.pow(numero_1, numero_2);
                                    JOptionPane.showMessageDialog(null, "El resultado de la potencia es: " +formato.format(potencia));
                                    break;

                                case "7":
                                    System.exit(0);
                                default:
                                    JOptionPane.showMessageDialog(null, "el valor no es valido");
                            }

                        } else if (opcion_operacion.equals("6")) {
                            double numero=0;
                            try{
                             numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número: "));
                            }
                            catch(Exception e){ JOptionPane.showMessageDialog(null, "El número ingresado no es válido");
                                break;}
                            
                            double raiz = Math.sqrt(Math.abs(numero));
                            JOptionPane.showMessageDialog(null, "El resultado de la raíz cuadrada de " + numero + " es: " + formato.format(raiz));

                        } else if (opcion_operacion.equals("7")) {
                            System.exit(0);

                        } else {
                            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido");
                        }

                    } while (!opcion_operacion.equals("7"));
                }

                case "2" ->

                    System.exit(0);
                default ->

                    JOptionPane.showMessageDialog(null, "El valor ingresado no es valido");
            }

        } while (!opcion_menu.equals("2"));

    }

}
