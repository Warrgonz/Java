package proyecto;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Proyecto {

    public static void main(String[] args) {

        boolean salir = false;
        String strOpcion; // Opcion del usuario.
        String btnOpcion;

        while (!salir) {
            strOpcion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opcion",
                    "Games & Geeks",
                    JOptionPane.QUESTION_MESSAGE,
                    null, // null para icono defecto
                    new Object[]{"Inventario", "Recursos humanos", "Sistema de envios", "Transportistas"},
                    "?");
            switch (strOpcion) {
                case "Inventario" -> {
                    JOptionPane.showConfirmDialog(null, "Soy inventario");
                    while (!salir) {
                        btnOpcion = (String) JOptionPane.showInputDialog(
                                null,
                                "Seleccione la opcion que desea gestionar",
                                "Games & Geeks",
                                JOptionPane.QUESTION_MESSAGE,
                                null, // null para icono defecto
                                new Object[]{"Agregar producto", "Buscar producto", "Modificar producto", "Eliminar producto"},
                                "?");
                        switch (btnOpcion) {
                            case "Agregar producto" -> {
                                btnOpcion = (String) JOptionPane.showInputDialog(
                                        null,
                                        "Seleccione la opcion que desea gestionar",
                                        "Games & Geeks",
                                        JOptionPane.QUESTION_MESSAGE,
                                        null, // null para icono defecto
                                        new Object[]{"Videojuegos", "Ropa y calzado", "Figuras de accion", "Consolas y computacion"},
                                        "?");
                                
                                switch (btnOpcion) {
                                    case "":
                                        
                                        break;
                                    default:
                                        throw new AssertionError();
                                }

                            }
                            case "Buscar producto" -> {
                                JOptionPane.showConfirmDialog(null, "METODO MODIFICAR");
                                break;
                            }
                            case "Modificar producto" -> {
                                JOptionPane.showConfirmDialog(null, "METODO MODIFICAR");
                                break;
                            }
                            case "Eliminar producto" -> {
                                JOptionPane.showConfirmDialog(null, "METODO ELIMINAR");
                                break;
                            }
                        }
                    }
                }
                case "Recursos humanos" -> {
                    JOptionPane.showConfirmDialog(null, "Soy hr");
                    while (!salir) {
                        btnOpcion = (String) JOptionPane.showInputDialog(
                                null,
                                "Seleccione la opcion que desea gestionar",
                                "Games & Geeks",
                                JOptionPane.QUESTION_MESSAGE,
                                null, // null para icono defecto
                                new Object[]{"Agregar empleado", "Buscar empleado", "Modificar empleado", "Eliminar empleado"},
                                "?");
                        switch (btnOpcion) {
                            case "Agregar empleado" -> {
                                JOptionPane.showConfirmDialog(null, "METODO AGREGAR");
                                break;
                            }
                            case "Buscar empleado" -> {
                                JOptionPane.showConfirmDialog(null, "METODO MODIFICAR");
                                break;
                            }
                            case "Modificar empleado" -> {
                                JOptionPane.showConfirmDialog(null, "METODO MODIFICAR");
                                break;
                            }
                            case "Eliminar empleado" -> {
                                JOptionPane.showConfirmDialog(null, "METODO ELIMINAR");
                                break;
                            }
                        }
                    }

                }
                case "Sistema de envios" -> {
                    JOptionPane.showConfirmDialog(null, "Soy enviar");
                    while (!salir) {
                        btnOpcion = (String) JOptionPane.showInputDialog(
                                null,
                                "Seleccione la opcion que desea gestionar",
                                "Games & Geeks",
                                JOptionPane.QUESTION_MESSAGE,
                                null, // null para icono defecto
                                new Object[]{"Agregar direccion", "Modificar direccion", "Eliminar direccion"},
                                "?");
                        switch (btnOpcion) {
                            case "Agregar empleado" -> {
                                JOptionPane.showConfirmDialog(null, "METODO AGREGAR");
                                break;
                            }
                            case "Modificar empleado" -> {
                                JOptionPane.showConfirmDialog(null, "METODO MODIFICAR");
                                break;
                            }
                            case "Eliminar direccion" -> {
                                JOptionPane.showConfirmDialog(null, "METODO ELIMINAR");
                                break;
                            }
                        }
                    }
                }
                case "Transportistas" ->
                    JOptionPane.showConfirmDialog(null, "Soy UPS");
                default -> {
                }
            }

        }

    }

//            switch (opcion) {
//                case 0:
//                    System.out.println("Has seleccionado la opcion 1");
//                    break;
//                case 1:
//                    System.out.println("Has seleccionado la opcion 2");
//                    break;
//                case 2:
//                    System.out.println("Has seleccionado la opcion 3");
//                    break;
//                case 3:
//                    salir = true;
//                    break;
//                default:
//                    System.out.println("Solo números entre 1 y 4");
//            }
//
//            // Inventario (Producto)
//        }
//    }
}
