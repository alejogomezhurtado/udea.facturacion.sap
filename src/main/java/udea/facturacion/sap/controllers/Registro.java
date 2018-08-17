package udea.facturacion.sap.controllers;

import udea.facturacion.sap.infraestructura.Publicador;

public class Registro {

    private static Publicador publicador = new Publicador();

    public static void crear(String message){
        publicador.publicarMensaje("facturacion.contabilizada", "", message);
    }
}
