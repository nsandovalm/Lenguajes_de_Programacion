
import Entidades.ContactoT1;
import Entidades.ContactoT2;
import Entidades.Persona;
import Entidades.Agenda;
import Entidades.EventoT1;
import Entidades.EventoT2;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nsandoval
 */
public class Main {
    public static void main(String[] args){
       Agenda agendaPersonal = new Agenda(); 
       
       System.out.println("***AGREGANDO CONTACTOS***");
        agendaPersonal.agregarContacto(new ContactoT1("Carmen", 23, true, "Santa Clara", "11111111", "carmen@gmail.com" ));
        agendaPersonal.agregarContacto(new ContactoT1("Pablo", 27, true, "Ciudad Quesada", "2222222", "pablo@gmail.com" ));
        agendaPersonal.agregarContacto(new ContactoT2("Ana", 25, true, "Florencia","888888", "anaCD","ana97"));
        System.out.println("***IMPRIMIENDO CONTACTOS***");
        agendaPersonal.imprimirContactos();
        System.out.println("");
        System.out.println("***AGREGANDO EVENTOS***");
        agendaPersonal.agregarEvento(new EventoT1(100,"Santa","21/12/2022","Ciudad Quesada","Exhibicion Carros"));
        agendaPersonal.agregarEvento(new EventoT2(20,"QUT","21/11/2022","San Ramon","Covencion QUT"));
        agendaPersonal.agregarEvento(new EventoT1(150,"Mar","09/12/2022","Guanacaste","Exhibicion Barcos"));
        
        System.out.println("***IMPRIMIENDO EVENTOS***");
        agendaPersonal.imprimirEvento();
    }
}
