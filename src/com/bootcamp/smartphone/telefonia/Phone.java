package com.bootcamp.smartphone.telefonia;

public interface Phone {

    void ligar(String numeroTelefone);
    
    void receberLigacao(String numeroTelefone);
    
    void enviarSMS(String numeroTelefone, String mensagem);
    
    void receberSMS(String numeroTelefone, String mensagem);
    
}
