/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocpd;
import java.util.Calendar;
/**
 *
 * @author Mauricio
 */
public class Evento {
    /*
    aqui, descobrir os tipos corretos para cada campo do objeto,
    implementar(ou não!) metodos para o tratamento das entradas
    (que são do tipo string).
    
    Lembrando que essa classe não funciona sozinha, é para ser extendida
    para algo do tipo arquivo.
    */
    private String info;
    private String valor;
    private boolean tipo;
    
    private int anoRegistro;//ano da inserção
    private byte mesRegistro;//mes da inserção
    private byte diaRegistro;//dia da inserção
    private byte horaRegistro;//hora da inserção
    private byte minutoRegistro;//minutos da inserção
    
    private int anoVencimento;//ano do vencimento
    private byte mesVencimento;//mes do vencimento
    private byte diaVencimento;//dia do vencimento

    
    //construtor da classe, o mais trivial possivel HUE
    Evento(String info, String valor, boolean tipo){
        this.info = info;
        this.valor = valor;
        this.tipo = tipo;
        
    this.anoRegistro = Calendar.getInstance().get(Calendar.YEAR);
    this.mesRegistro = (byte)Calendar.getInstance().get(Calendar.MONTH);
    this.diaRegistro = (byte)Calendar.getInstance().get(Calendar.DATE);
    this.horaRegistro = (byte)Calendar.getInstance().get(Calendar.HOUR);
    this.minutoRegistro = (byte)Calendar.getInstance().get(Calendar.MINUTE);
    
    //this.anoVencimento =;
    //this.mesVencimento =;
    //this.diaVencimento =;
                                                                
    } 

  
}
