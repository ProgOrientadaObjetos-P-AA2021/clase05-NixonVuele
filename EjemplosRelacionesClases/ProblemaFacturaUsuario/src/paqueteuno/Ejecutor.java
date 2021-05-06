/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import paqutedos.Usuario;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Crear el objeto Usuario
        Usuario usuario = new Usuario();
        usuario.establecerNombre("Jose");
        usuario.establecerApellido("Riofrio");
        usuario.establecerIdentificacion("2324234");
        // Crear el objeto FacturaTelefonica
        FacturaTelefonica factura = new FacturaTelefonica("12321312", 15.3,
                0.6, usuario);

        factura.calcularValorFactura();

        System.out.printf("Factura de Teléfono\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Número de teléfono: %s\n"
                + "Minutos mensuales: %.2f\n"
                + "Valor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n",
                factura.obtenerUsuario().obtenerNombre(),
                factura.obtenerUsuario().obtenerApellido(),
                factura.obtenerUsuario().obtenerIdentificacion(),
                factura.obtenerNumeroTelefono(),
                factura.obtenerMinutosMes(),
                factura.obtenerValorMinuto(),
                factura.obtenerValorFactura());
    }
}
