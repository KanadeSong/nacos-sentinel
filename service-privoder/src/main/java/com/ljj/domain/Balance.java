package com.ljj.domain;

/**
 * @Description: TODO
 * @Author 李佳杰
 * @Date 2019/12/21
 * @Version V1.0
 **/
public class Balance {
    private int id;
    private int diamond;
    private int ticket;
    private String message;

    public Balance() {
    }

    public int getId() {
        return id;
    }

    public Balance(int id, int diamond, int ticket) {
        this(id, diamond, ticket, "OK");
    }

    public Balance(int id, int diamond, int ticket, String message) {
        this.id = id;
        this.diamond = diamond;
        this.ticket = ticket;
        this.message = message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
