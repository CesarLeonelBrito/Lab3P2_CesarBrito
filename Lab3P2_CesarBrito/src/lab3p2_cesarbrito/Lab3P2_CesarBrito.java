package lab3p2_cesarbrito;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_CesarBrito {

    public static void main(String[] args) {

        ArrayList<Tienda> tiendas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String usernameAdmin = "admin";
        String passwordAdmin = "1234";
        System.out.print("Ingrese su usuario: ");
        String usernameInput = sc.next();
        System.out.print("Ingrese su contraseña: ");
        String passwordInput = sc.next();
        while (!usernameInput.equals(usernameAdmin) || !passwordInput.equals(passwordAdmin)) {
            System.out.println("***USUARIO INCORRECTO***");
            System.out.print("Ingrese su usuario: ");
            usernameInput = sc.next();
            System.out.print("Ingrese su contraseña: ");
            passwordInput = sc.next();
        }
        if (usernameInput.equals(usernameAdmin) && passwordInput.equals(passwordAdmin)) {
            System.out.println("***USUARIO CORRECTO***");
            int opcionM = 0;
            while (opcionM != 7) {
                System.out.println("=====MENU=====");
                System.out.println("1. Agregar Tienda");
                System.out.println("2. Agregar Algo a una Tienda(Articulo, Empleado, Cliente)");
                System.out.println("3. Modificar Tienda");
                System.out.println("4. Listar Tiendas");
                System.out.println("5. Eliminar Tienda");
                System.out.println("6. Login");
                System.out.println("7. Salir del Menu");
                System.out.print("Ingrese su opcion: ");
                opcionM = sc.nextInt();
                if (opcionM == 1) {
                    System.out.println("");
                    String identificador, ubicacion, productoMasVendido;
                    int empleadosMax, cantidadCajas, cantidadArticulos;
                    System.out.print("Ingrese el identificador: ");
                    identificador = sc.next();
                    boolean buscar = true;
                    while (buscar == true) {
                        buscar = buscar(identificador, tiendas);
                        if (buscar == true) {
                            System.out.println("EL IDENTIFICADOR YA ESTA UTILIZDO");
                            System.out.print("Ingrese el identificador: ");
                            identificador = sc.next();
                        }
                    }
                    System.out.print("Ingrese la ubicacion: ");
                    ubicacion = sc.next();
                    System.out.print("Ingrese el producto mas vendido: ");
                    productoMasVendido = sc.next();
                    System.out.print("Ingrese la cantidad maxima de empleados: ");
                    empleadosMax = sc.nextInt();
                    System.out.print("Ingrese la cantidad de cajas registradoras: ");
                    cantidadCajas = sc.nextInt();
                    System.out.print("Ingrese la cantidad maxima de articulos: ");
                    cantidadArticulos = sc.nextInt();
                    Tienda x = new Tienda(identificador, ubicacion, empleadosMax, cantidadCajas, productoMasVendido, cantidadArticulos);
                    System.out.println("TAMBIEN DEBE AGREGAR UN SUPERVISOR POR LO MINIMO");
                    String nombre, apellido, nacionalidad, username, password;
                    int salario, salarioPromedio, metaPromedio;
                    System.out.print("Ingrese el nombre: ");
                    nombre = sc.next();
                    System.out.print("Ingrese el apellido: ");
                    apellido = sc.next();
                    System.out.print("Ingrese la nacionalidad: ");
                    nacionalidad = sc.next();
                    System.out.print("Ingrese el usuario: ");
                    username = sc.next();
                    System.out.print("Ingrese la contraseña: ");
                    password = sc.next();
                    System.out.print("Ingrese el salario: ");
                    salario = sc.nextInt();
                    System.out.print("Ingrese el salario promedio: ");
                    salarioPromedio = sc.nextInt();
                    System.out.print("Ingrese la meta promedio: ");
                    metaPromedio = sc.nextInt();
                    Supervisor y = new Supervisor(salarioPromedio, metaPromedio, nombre, apellido, salario, nacionalidad, username, password);
                    x.getEmpleados().add(y);
                    tiendas.add(x);
                    /////////
                    /////////
                    /////////
                } else if (opcionM == 2) {
                    System.out.println("");
                    System.out.print("Ingrese el identificador de la tienda que desea agregar: ");
                    String search = sc.next();
                    boolean found = false;
                    for (int i = 0; i < tiendas.size(); i++) {
                        if (tiendas.get(i).getIdentificador().equals(search)) {
                            System.out.print("1. Agregar Producto, 2. Agregar Empleado, 3. Agregar Cliente"
                                    + "\nIngrese su opcion: ");
                            int op = sc.nextInt();
                            if (op == 1) {
                                int serie, precio;
                                String color, garantia;
                                System.out.print("Ingrese el color: ");
                                color = sc.next();
                                System.out.print("Ingrese la garantia: ");
                                garantia = sc.next();
                                System.out.print("Ingrese la serie: ");
                                serie = sc.nextInt();
                                System.out.print("Ingrese el precio: ");
                                precio = sc.nextInt();
                                System.out.print("1. Televisores, 2. Consolas, 3. Equipos de Sonido, 4. Teatros en Casa"
                                        + "\nIngrese su opcion: ");
                                int op2 = sc.nextInt();
                                while (op2 < 1 || op2 > 4) {
                                    System.out.print("1. Televisores, 2. Consolas, 3. Equipos de Sonido, 4. Teatros en Casa"
                                            + "\nIngrese su opcion: ");
                                    op2 = sc.nextInt();
                                }
                                if (op2 == 1) {
                                    int pantalla, conexiones, grosor;
                                    String marca;
                                    boolean smart;
                                    System.out.print("Ingrese la marca: ");
                                    marca = sc.next();
                                    System.out.print("Ingrese si es Smart TV s/n: ");
                                    char b = sc.next().charAt(0);
                                    if (b == 's' || b == 'S') {
                                        smart = true;
                                    } else {
                                        smart = false;
                                    }
                                    System.out.print("Ingrese que tan grande es la pantalla: ");
                                    pantalla = sc.nextInt();
                                    System.out.print("Ingrese la cantidad de conexiones: ");
                                    conexiones = sc.nextInt();
                                    System.out.print("Ingrese que tan grande es el grosor: ");
                                    grosor = sc.nextInt();
                                    tiendas.get(i).getArticulos().add(new Televisor(pantalla, smart, marca, conexiones, grosor, serie, precio, color, garantia));
                                } else if (op2 == 2) {
                                    String marca, informacionTarjeta;
                                    int almacenamiento, controles, accesorios;
                                    System.out.print("Ingrese la marca: ");
                                    marca = sc.next();
                                    System.out.print("Ingrese la informacion sobre la tarjeta: ");
                                    informacionTarjeta = sc.next();
                                    System.out.print("Ingrese el almacenamiento: ");
                                    almacenamiento = sc.nextInt();
                                    System.out.print("Ingrese cuantos controles trae: ");
                                    controles = sc.nextInt();
                                    System.out.print("Ingrese cuantos accesorios trae: ");
                                    accesorios = sc.nextInt();
                                    tiendas.get(i).getArticulos().add(new Consola(marca, almacenamiento, controles, accesorios, informacionTarjeta, serie, precio, color, garantia));
                                } else if (op2 == 3) {
                                    int altavoces, potencia, puertosAuxiliares, discos, puertosUSB;
                                    System.out.print("Ingrese cuantos altavoces tiene: ");
                                    altavoces = sc.nextInt();
                                    System.out.print("Ingrese la potencia: ");
                                    potencia = sc.nextInt();
                                    System.out.print("Ingrese la cantidad de puertos auxiliares: ");
                                    puertosAuxiliares = sc.nextInt();
                                    System.out.print("Ingrese la capacidad de discos: ");
                                    discos = sc.nextInt();
                                    System.out.print("Ingrese la cantidad de puertos USB: ");
                                    puertosUSB = sc.nextInt();
                                    tiendas.get(i).getArticulos().add(new EquipoSonido(altavoces, potencia, puertosAuxiliares, discos, puertosUSB, serie, precio, color, garantia));
                                } else if (op2 == 4) {
                                    int altavoces, discosCantidad;
                                    String informacion;
                                    System.out.print("Ingrese la informacion: ");
                                    informacion = sc.next();
                                    System.out.print("Ingrese la cantidad de altavoces: ");
                                    altavoces = sc.nextInt();
                                    System.out.print("Ingrese la cantidad de discos que acepta: ");
                                    discosCantidad = sc.nextInt();
                                    tiendas.get(i).getArticulos().add(new Teatro(altavoces, discosCantidad, informacion, serie, precio, color, garantia));
                                }
                            } else if (op == 2) {
                                String nombre, apellido, nacionalidad, username, password;
                                int salario;
                                System.out.print("Ingrese el nombre: ");
                                nombre = sc.next();
                                System.out.print("Ingrese el apellido: ");
                                apellido = sc.next();
                                System.out.print("Ingrese la nacionalidad: ");
                                nacionalidad = sc.next();
                                System.out.print("Ingrese el usuario: ");
                                username = sc.next();
                                System.out.print("Ingrese la contraseña: ");
                                password = sc.next();
                                System.out.print("Ingrese el salario: ");
                                salario = sc.nextInt();
                                System.out.print("1. Cajero, 2. Supervisor, 3. Asesor Financiero"
                                        + "\nIngrese su opcion: ");
                                int op2 = sc.nextInt();
                                while (op2 < 1 || op2 > 3) {
                                    System.out.print("1. Cajero, 2. Supervisor, 3. Asesor Financiero"
                                            + "\nIngrese su opcion: ");
                                    op2 = sc.nextInt();
                                }
                                if (op2 == 1) {
                                    String horario, horaAlmuerzo;
                                    int years, meta, cantidadEmpleados;
                                    System.out.print("Ingrese el horario: ");
                                    horario = sc.next();
                                    System.out.print("Ingrese la hora de almuerzo: ");
                                    horaAlmuerzo = sc.next();
                                    System.out.print("Ingrese los años que lleva laborando: ");
                                    years = sc.nextInt();
                                    System.out.print("Ingrese la meta a vender por mes: ");
                                    meta = sc.nextInt();
                                    System.out.print("Ingrese la cantidad de empleados atendidos: ");
                                    cantidadEmpleados = sc.nextInt();
                                    Cajero x = new Cajero(years, horario, horaAlmuerzo, meta, cantidadEmpleados, nombre, apellido, salario, nacionalidad, username, password);
                                    tiendas.get(i).getEmpleados().add(x);
                                    for (int j = 0; j < tiendas.get(i).getEmpleados().size(); j++) {
                                        if (tiendas.get(i).getEmpleados().get(j) instanceof Supervisor) {
                                            System.out.println(j + " - " + tiendas.get(i).getEmpleados().get(j));
                                        }
                                    }
                                    System.out.print("Ingrese el numero que su supervisor tiene al lado: ");
                                    int look = sc.nextInt();
                                    ((Supervisor) tiendas.get(i).getEmpleados().get(look)).getCajerosSupervisando().add(x);
                                } else if (op2 == 2) {
                                    int salarioPromedio, metaPromedio;
                                    System.out.print("Ingrese el salario promedio: ");
                                    salarioPromedio = sc.nextInt();
                                    System.out.print("Ingrese la meta promedio: ");
                                    metaPromedio = sc.nextInt();
                                    Supervisor y = new Supervisor(salarioPromedio, metaPromedio, nombre, apellido, salario, nacionalidad, username, password);
                                    tiendas.get(i).getEmpleados().add(y);
                                } else if (op2 == 3) {
                                    int productos, creditos;
                                    System.out.print("Ingrese la cantidad de productos que vendio: ");
                                    productos = sc.nextInt();
                                    System.out.print("Ingrese el promdeio de credito de los clientes: ");
                                    creditos = sc.nextInt();
                                }
                            } else if (op == 3) {
                                String nombre, apellido, nacionalidad;
                                int salario, credito;
                                System.out.print("Ingrese el nombre: ");
                                nombre = sc.next();
                                System.out.print("Ingrese el apellido: ");
                                apellido = sc.next();
                                System.out.print("Ingrese la nacionalidad: ");
                                nacionalidad = sc.next();
                                System.out.print("Ingrese el salario: ");
                                salario = sc.nextInt();
                                System.out.print("Ingrese el credito: ");
                                credito = sc.nextInt();
                                Cliente x = new Cliente(nombre, apellido, salario, nacionalidad, credito);
                                for (int j = 0; j < tiendas.get(i).getArticulos().size(); j++) {
                                    System.out.println(j + " - " + tiendas.get(i).getArticulos().get(i));
                                }
                                char s = 'n';
                                while (s == 'n') {
                                    System.out.println("1. Agregar articulo\n"
                                            + "2. Salir");
                                    System.out.print("Ingrese su opcion: ");
                                    int g = sc.nextInt();
                                    if (g == 1) {
                                        System.out.print("Ingrese la posicion del articulo que desea agregar: ");
                                        int f = sc.nextInt();
                                        x.getArticulosComprado().add(tiendas.get(i).getArticulos().get(f));
                                    } else {
                                        System.out.print("Seguro que desea salir? s/n: ");
                                        s = sc.next().charAt(0);

                                    }
                                }
                                tiendas.get(i).getClientes().add(x);
                                System.out.print("Ingrese si tuvo un asesor financiero s/n: ");
                                char b = sc.next().charAt(0);
                                if (b == 's' || b == 'S') {
                                    for (int j = 0; j < tiendas.get(i).getEmpleados().size(); j++) {
                                        if (tiendas.get(i).getEmpleados().get(j) instanceof Asesor) {
                                            System.out.println(j + " - " + tiendas.get(i).getEmpleados().get(j));
                                        }
                                    }
                                    System.out.print("Ingrese el numero que su asesor tiene: ");
                                    int p = sc.nextInt();
                                    ((Asesor) tiendas.get(i).getEmpleados().get(p)).getClientesAtendido().add(x);
                                }
                            } else {
                                System.out.println("OPCION NO VALIDA");
                            }
                        }
                    }
                    /////////
                    /////////
                    /////////
                } else if (opcionM == 3) {
                    System.out.println("");
                    //
                    // LO HARIA MAS GRANDE CON MAS OPCIONES PERO NO TUVE TIEMPO
                    //
                    System.out.print("Ingrese el identificador de la tienda que desea modificar: ");
                    String search = sc.next();
                    for (int i = 0; i < tiendas.size(); i++) {
                        if (tiendas.get(i).getIdentificador().equals(search)) {
                            String ubicacion, productoMasVendido;
                            int empleadosMax, cantidadCajas, cantidadArticulos;
                            System.out.print("Ingrese la ubicacion: ");
                            ubicacion = sc.next();
                            System.out.print("Ingrese el producto mas vendido: ");
                            productoMasVendido = sc.next();
                            System.out.print("Ingrese la cantidad maxima de empleados: ");
                            empleadosMax = sc.nextInt();
                            System.out.print("Ingrese la cantidad de cajas registradoras: ");
                            cantidadCajas = sc.nextInt();
                            System.out.print("Ingrese la cantidad maxima de articulos: ");
                            cantidadArticulos = sc.nextInt();
                            tiendas.get(i).setCantidadArticulo(cantidadArticulos);
                            tiendas.get(i).setCantidadCajas(cantidadCajas);
                            tiendas.get(i).setEmpleadosMax(empleadosMax);
                            tiendas.get(i).setProductoMasVendido(productoMasVendido);
                            tiendas.get(i).setUbicacion(ubicacion);
                        }
                    }
                    /////////
                    /////////
                    /////////
                } else if (opcionM == 4) {
                    System.out.println("");
                    for (int i = 0; i < tiendas.size(); i++) {
                        System.out.println("");
                        System.out.println(tiendas.get(i));
                    }
                    /////////
                    /////////
                    /////////
                } else if (opcionM == 5) {
                    System.out.println("");
                    System.out.print("Ingrese el identificador de la tienda que desea eliminar: ");
                    String search = sc.next();
                    boolean found = false;
                    for (int i = 0; i < tiendas.size(); i++) {
                        if (tiendas.get(i).getIdentificador().equals(search)) {
                            tiendas.remove(i);
                            found = true;
                            System.out.println("SE HA ELIMINADO EXITOSAMENTE");
                        }
                    }
                    if (found == false) {
                        System.out.println("LA TIENDA NO FUE ENCONTRADA");
                    }
                    /////////
                    /////////
                    /////////
                } else if (opcionM == 6) {
                    System.out.println("");
                    System.out.println("");
                    System.out.print("Ingrese el identificador de la tienda que pertenece: ");
                    String search = sc.next();
                    for (int i = 0; i < tiendas.size(); i++) {
                        if (tiendas.get(i).getIdentificador().equals(search)) {
                            String passI, userI;
                            System.out.print("Ingrese su usuario: ");
                            userI = sc.next();
                            System.out.print("Ingrese su contraseña: ");
                            passI = sc.next();
                            for (int j = 0; j < tiendas.get(i).getEmpleados().size(); j++) {
                                if (tiendas.get(i).getEmpleados().get(j).getUsername().equals(userI) && tiendas.get(i).getEmpleados().get(i).getPassword().equals(userI)) {
                                    Empleado e = tiendas.get(i).getEmpleados().get(j);
                                    if (e instanceof Asesor) {
                                        int opc = 1;
                                        while (opc != 9) {
                                            System.out.println("1. Crear cajero");
                                            System.out.println("2. Eliminar cajero");
                                            System.out.println("3. Modificar cajero");
                                            System.out.println("4. Listar cajeros");
                                            System.out.println("5. Crear supervisor");
                                            System.out.println("6. Eliminar supervisor");
                                            System.out.println("7. Modificar supervisor");
                                            System.out.println("8. Listar supervisores");
                                            System.out.println("9. Salir del Menu");
                                            System.out.print("Ingrese su opcion: ");
                                            int oc = sc.nextInt();
                                            if (oc == 1) {

                                            } else if (oc == 2) {

                                            } else if (oc == 3) {

                                            } else if (oc == 4) {

                                            } else if (oc == 5) {

                                            } else if (oc == 6) {

                                            } else if (oc == 7) {

                                            } else if (oc == 8) {

                                            }
                                        }
                                    } else if (e instanceof Cajero) {
                                        int opc = 1;
                                        while (opc != 5) {
                                            System.out.println("1. Ver mi informacion");
                                            System.out.println("2. Modificar mi informacion");
                                            System.out.println("3. Listar Cajeros");
                                            System.out.println("4. Listar Supervisores");
                                            System.out.println("5. Salir");
                                            System.out.print("Ingrese su opcion: ");
                                            int v = sc.nextInt();
                                            if (v == 1) {
                                                System.out.println(tiendas.get(i).getEmpleados().get(j));
                                            } else if (v == 2) {
                                                String nombre, apellido, nacionalidad;
                                                int salario, credito;
                                                System.out.print("Ingrese el nombre: ");
                                                nombre = sc.next();
                                                System.out.print("Ingrese el apellido: ");
                                                apellido = sc.next();
                                                System.out.print("Ingrese la nacionalidad: ");
                                                nacionalidad = sc.next();
                                                System.out.print("Ingrese el salario: ");
                                                salario = sc.nextInt();
                                                System.out.print("Ingrese el credito: ");
                                                credito = sc.nextInt();
                                                int productos, creditos;
                                                System.out.print("Ingrese la cantidad de productos que vendio: ");
                                                productos = sc.nextInt();
                                                System.out.print("Ingrese el promdeio de credito de los clientes: ");
                                                creditos = sc.nextInt();
                                                ((Asesor) tiendas.get(i).getEmpleados().get(j)).setApellido(apellido);
                                                ((Asesor) tiendas.get(i).getEmpleados().get(j)).setCreditos(creditos);
                                                ((Asesor) tiendas.get(i).getEmpleados().get(j)).setNacionalidad(nacionalidad);
                                                ((Asesor) tiendas.get(i).getEmpleados().get(j)).setNombre(nombre);
                                                ((Asesor) tiendas.get(i).getEmpleados().get(j)).setProductos(productos);
                                                ((Asesor) tiendas.get(i).getEmpleados().get(j)).setSalario(salario);
                                            } else if (v == 3) {
                                                for (int k = 0; k < tiendas.get(i).getEmpleados().size(); k++) {
                                                    Empleado x = tiendas.get(i).getEmpleados().get(k);
                                                    if (x instanceof Cajero) {
                                                        System.out.println(x);
                                                    }
                                                }
                                            } else if (v == 4) {
                                                for (int k = 0; k < tiendas.get(i).getEmpleados().size(); k++) {
                                                    Empleado x = tiendas.get(i).getEmpleados().get(k);
                                                    if (x instanceof Supervisor) {
                                                        System.out.println(x);
                                                    }
                                                }
                                            }
                                        }
                                    } else if (e instanceof Supervisor) {
                                        int opc = 1;
                                        while (opc != 3) {
                                            System.out.println("1. Ver mi informacion");
                                            System.out.println("2. Ver productos de la tienda");
                                            System.out.println("3. Salir");
                                            System.out.print("Ingrese su opcion: ");
                                            int v = sc.nextInt();
                                            if (v == 1) {
                                                System.out.println(tiendas.get(i).getEmpleados().get(j));
                                            } else if (v == 2) {
                                                for (int k = 0; k < tiendas.get(i).getArticulos().size(); k++) {
                                                    System.out.println(tiendas.get(i).getArticulos().get(k));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    /////////
                    /////////
                    /////////
                } else if (opcionM == 7) {
                    System.out.println("SALIENDO DEL PROGRAMA....");
                } else {
                    System.out.println("OPCION INVALIDA");
                }
                System.out.println("");
            }
        }
    }

    public static boolean buscar(String serie, ArrayList<Tienda> tiendas) {
        boolean found = false;
        for (int i = 0; i < tiendas.size(); i++) {
            if (tiendas.get(i).getIdentificador().equals(serie)) {
                found = true;
            }
        }
        if (found == true) {
            return true;
        } else {
            return false;
        }
    }

}
