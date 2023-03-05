package ru.netology.searchticket.repository;

import ru.netology.searchticket.data.Ticket;

public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];

    public void add(Ticket ticket) {                          //добавление
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];

        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }


    public Ticket[] findAll() {             //получение всех сохраненных
        return tickets;
    }


}

