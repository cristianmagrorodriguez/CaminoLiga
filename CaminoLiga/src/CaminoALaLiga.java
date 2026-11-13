
import java.util.Scanner;

public class CaminoALaLiga {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Equipos disponibles
        String[] equipos = {
            "Real Madrid", 
            "Barcelona", 
            "Liverpool",
            "Manchester City",
             "PSG",
              "Roma",
            "Juventus",
             "Atletico de Madrid"
        };

        // Jugadores de cada equipo, cada {...,...}corresponde a un equipo.

        String[][] jugadores = {

            {"Courtois", "Lunin", "Guler", "Cucurella",
             "Rudiger", "Militao", "Diomande", "Mendy",
             "Fran Garcia", "Valverde", "Bellingham",
             "Camavinga", "Tchouameni", "Modric",
             "Ceballos", "Vinicius", "Mbappe",
             "Rodrygo", "Brahim Diaz", "Endrick"},

            {"Ter Stegen", "Inaki Pena", "Szczesny",
             "Kounde", "Araujo", "Cubarsi", "Christensen",
             "Balde", "Eric Garcia", "Gerard Martin",
             "Pedri", "Gavi", "De Jong", "Fermin Lopez",
             "Casado", "Raphinha", "Lewandowski",
             "Lamine Yamal", "Ferran Torres", "Dani Olmo"},

            {"Alisson", "Kelleher", "Alexander-Arnold",
             "Bradley", "Van Dijk", "Konate", "Gomez",
             "Robertson", "Tsimikas", "Mac Allister",
             "Szoboszlai", "Gravenberch", "Jones",
             "Endo", "Elliott", "Salah", "Luis Diaz",
             "Darwin Nunez", "Gakpo", "Jota"},

            {"Ederson", "Ortega", "Walker", "Lewis",
             "Dias", "Gvardiol", "Akanji", "Stones",
             "Ake", "Rodri", "De Bruyne",
             "Bernardo Silva", "Kovacic", "Gundogan",
             "Foden", "Haaland", "Doku", "Grealish",
             "Savinho", "Nunes"},

            {"Donnarumma", "Safonov", "Hakimi",
             "Marquinhos", "Pacho", "Lucas Hernandez",
             "Nuno Mendes", "Beraldo", "Zague",
             "Vitinha", "Joao Neves", "Fabian Ruiz",
             "Warren Zaire-Emery", "Mayulu", "Dembele",
             "Barcola", "Kvaratskhelia", "Goncalo Ramos",
             "Kolo Muani", "Asensio"},

            {"Svilar", "Ryan", "Mancini", "Ndicka",
             "Hummels", "Angelino", "Celik", "Hermoso",
             "Saud Abdulhamid", "Cristante", "Paredes",
             "Pellegrini", "Pisilli", "Le Fee",
             "Bove", "Dybala", "Dovbyk",
             "El Shaarawy", "Baldanzi", "Sule"},

            {"Di Gregorio", "Perin", "Pinsoglio",
             "Kalulu", "Bremer", "Gatti", "Danilo",
             "Cambiaso", "Savona", "Locatelli",
             "Thuram", "Koopmeiners", "Douglas Luiz",
             "McKennie", "Fagioli", "Yildiz",
             "Vlahovic", "Conceicao", "Weah", "Milik"},

            {"Oblak", "Musso", "Molina", "Gimenez",
             "Le Normand", "Witsel", "Reinildo",
             "Azpilicueta", "Lenglet", "De Paul",
             "Koke", "Llorente", "Barrios",
             "Gallagher", "Lemar", "Griezmann",
             "Julian Alvarez", "Sorloth", "Correa",
             "Riquelme"}
        };
        //CONSTANTES
        final int NUM_TITULARES=11;
        // Variables
        int equipo;
        int opcion;
        int[] puntos = new int[equipos.length];
        int[] partidos = new int[equipos.length];
        String[] titulares = new String[NUM_TITULARES];
        boolean[] elegidos = new boolean[jugadores[0].length];

        
        System.out.println("================================");
        System.out.println("       CAMINO A LA LIGA");
        System.out.println("================================");
        System.out.println("¡BIENVENIDO AL JUEGO!");
        System.out.println();
        System.out.println("Pulsa ENTER para continuar...");
        sc.nextLine();

        // Elección de equipo
        System.out.println("ELIGE TU EQUIPO:");
        System.out.println("================================");
        //recorremos y mostramos el numero de cada equipo
        for (int i = 0; i < equipos.length; i++) {
            System.out.println((i + 1) + ". " + equipos[i]);
        }

        System.out.print("Elige un equipo de los mostrados marcando su número(1-8) y despues pulsa ENTER: ");
        equipo = sc.nextInt() - 1;

        //Filtro para obligar que se eliga un número del 1 al 8, si no se elige muestra dicho error
        while (equipo < 0 || equipo > 7) {
            System.out.print("Número incorrecto. Elige (1-8) y despues pulsa ENTER: ");
            equipo = sc.nextInt() - 1;
        }

        sc.nextLine();

        
        System.out.println("Bienvenido a tu nuevo club: " + equipos[equipo]+(" .Suerte en la temporada,las expectativas son muy altas."));
        // Menu

        do {

            System.out.println();
            System.out.println("========= MENU =========");
            
            System.out.println("========================");
            System.out.println("1. Ver Plantilla");
            System.out.println("2. Elegir equipo titular");
            System.out.println("3. Jugar partido");
            System.out.println("4. Clasificación");
            System.out.println("5. Salir del juego");
            System.out.println("========================");

            System.out.print("Elige una opción:(1-5) y después pulsa ENTER: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {

                // Ver jugadores del equipo seleccionado, recorre la matriz 
                case 1:

                    for (int i = 0; i < jugadores[equipo].length; i++) {
                    System.out.println((i + 1) + "-" + jugadores[equipo][i]);
                    }
                    break;

                
                case 2:
                    //Mostramos los jugadores disponibles con su número asociado
                    for (int i = 0; i <jugadores[equipo].length; i++) {
                        System.out.println((i + 1) + ". " + jugadores[equipo][i]);
                         System.out.println("========================");
                         elegidos[i] = false;
                    }

        

                    

                    for (int i = 0; i < titulares.length; i++) {

                        System.out.print("Elige jugador " + (i + 1) + ": ");
                        int numero = sc.nextInt();
                        //Filtro para que el numero marcado esté entre el rango 1 y 20, no valen negativos,0 o mayores de 20 puesto solo tenemos 20 jugadores
                        while (numero < 1 || numero > jugadores[equipo].length || elegidos[numero - 1]) {

                        System.out.print("Jugador incorrecto o repetido. Elige otro: ");
                        numero = sc.nextInt();
                        }
                        //para reconocer elemento seleccionado
                        elegidos[numero - 1] = true;
                        titulares[i] = jugadores[equipo][numero - 1];
                    }
                    //Mostramos al acabar la selección los 11 jugadores elegidos
                    System.out.println("TU EQUIPO TITULAR:");

                    for (int i = 0; i < NUM_TITULARES; i++) {
                        System.out.println(titulares[i]);
                    }

                    break;

                // Jugar partido
                case 3:

                    // Comprobar si hay 11 titulares
                    if (titulares[0] == null) {

                        System.out.println("Primero debes elegir tus once jugadores del equipo titular.");

                    } else {
                        //selección del rival,se multiplica por equipos.length por si en un futuro se añaden mas equipos/jugadores. Si no seria *8 
                        int rival = (int)(Math.random() *equipos.length);
                        //por si el math.random saca el numero de tu equipo, para que no de error, vuelve a salir(para no jugar contra tu mismo)
                        while (rival == equipo) {
                            rival = (int)(Math.random() * equipos.length);
                        }
                        //con math.random se elige un número de goles a cada equipo(MÁX 4 goles)
                        int goles1 = (int)(Math.random() * 5);
                        int goles2 = (int)(Math.random() * 5);

                        System.out.println();
                        System.out.println("TU EQUIPO: " + equipos[equipo]);
                        System.out.println("RIVAL: " + equipos[rival]);

                        System.out.println("Pulsa ENTER para ver el resultado...");
                        
                        sc.nextLine();

                        System.out.println();
                        System.out.println("RESULTADO:");
                        //Marcador del partido
                        System.out.println(equipos[equipo] + " " +goles1 + " - " + goles2 + " " +equipos[rival]);

                        //aumentar numero de partidos en la clasificación
                        partidos[equipo]++;
                        partidos[rival]++;

                        if (goles1 > goles2) {//si el equipo1 mete mas goles que el equipo2 gana y suma 3 puntos

                            puntos[equipo] += 3;
                            puntos[rival] +=0;
                            System.out.println("¡HAS GANADO! +3 PUNTOS");

                        } else if (goles1 == goles2) {//si el equipo1 mete los mismos goles que el equipo2 se suma 1 punto

                            puntos[equipo]++;
                            puntos[rival]++;
                            System.out.println("EMPATE. +1 PUNTO");

                        } else {//si el equipo1 mete menos goles que el equipo2 no gana nada, 0 puntos
                            puntos[rival]+=3;
                            System.out.println("HAS PERDIDO. 0 PUNTOS");

                        }
                    }

                    break;

                // Clasificación
                case 4:

                    System.out.println("====== CLASIFICACIÓN ======");

                    for (int i = 0; i < equipos.length; i++) {
                        System.out.printf("%-20s  Partidos: %2d Puntos: %2d%n", equipos[i], partidos[i], puntos[i]);
                       
                    }
                  
                    break;

                // SALIR
                case 5:

                    System.out.println("Gracias por jugar a CAMINO A LA LIGA.");
                    System.out.println("¡Esperamos que te lo hayas pasado bien!");

                    break;

                default:

                    System.out.println("Opción incorrecta.");

            }

            if (opcion != 5) {
                System.out.println();
                System.out.println("Pulsa ENTER para volver al menu...");
                sc.nextLine();
                
            }

        } while (opcion != 5);

        sc.close();

    }
}

