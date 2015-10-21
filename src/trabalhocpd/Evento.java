/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocpd;

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
    private String data;
    private String valor;
    private char tipo;
    private String hora;
    
    //construtor da classe, o mais trivial possivel HUE
    Evento(String info, String data, String valor, char tipo, String hora){
        this.info = info;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.hora = hora;
    } 

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @return the tipo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

}
