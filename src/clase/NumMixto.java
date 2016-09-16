/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Administrador
 */
public class NumMixto {

    private int Numerador;
    private int Denominador;

    public NumMixto(int Numerador, int Denominador) throws DenominadorCeroException {

        this.Numerador = Numerador;
        this.Denominador = Denominador;
        if (Denominador == 0) {
            if (Denominador == 0) {
                throw new DenominadorCeroException();

            }

        }
    }
 
    public int getNumerador() {
        return Numerador;
    }

    public void setNumerador(int Numerador) {
        this.Numerador = Numerador;
    }

    public int getDenominador() {
        return Denominador;
    }

    public void setDenominador(int Denominador) {
        this.Denominador = Denominador;
    }

    public NumMixto Sumar(NumMixto M2) throws DenominadorCeroException {
        NumMixto M;
        int Numerador,Denominador;
        
        Numerador = (this.Numerador* M2.Denominador)+(this.Denominador* M2.Numerador);
        Denominador = this.Denominador* M2.Denominador;
   
        M= new NumMixto(Numerador,Denominador);
        return M;

    }

    public NumMixto restar(NumMixto M2) throws DenominadorCeroException {
         NumMixto M;
        int Num,Den;
        
        Num = (this.Numerador* M2.Denominador)-(this.Denominador* M2.Numerador);
        Den = this.Denominador* M2.Denominador;
   
        M= new NumMixto(Num,Den);
        return M;
    }

    public NumMixto multiplicar(NumMixto M2) throws DenominadorCeroException {
          NumMixto M;
        int Num,Den;
        
        Num = (this.Numerador*M2.Numerador);
        Den = this.Denominador* M2.Denominador;
   
        M= new NumMixto(Num,Den);
        return M;
    }

    public NumMixto dividir(NumMixto M2) throws DenominadorCeroException {
          NumMixto M;
        int Num,Den;
        
        Num = this.Numerador* M2.Denominador;
        Den = this.Denominador* M2.Numerador;
   
        M= new NumMixto(Num,Den);
        return M;
    }

}
