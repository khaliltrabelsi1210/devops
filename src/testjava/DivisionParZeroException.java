/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

/**
 *
 * @author 21655
 */
public class DivisionParZeroException extends RuntimeException {
    public DivisionParZeroException() {
        super("Division par zéro n'est pas autorisée !");
    }
}
