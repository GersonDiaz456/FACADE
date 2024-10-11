/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

class ComputadoraFacade {
    private CPU cpu;
    private Memoria memoria;
    private DiscoDuro discoDuro;

    public ComputadoraFacade() {
        cpu = new CPU();
        memoria = new Memoria();
        discoDuro = new DiscoDuro();
    }

    public void iniciarComputadora() {
        cpu.iniciar();
        memoria.cargar();
        discoDuro.leerDatos();
        System.out.println("Computadora iniciada");
    }
}