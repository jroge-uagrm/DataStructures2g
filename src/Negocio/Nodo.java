package Negocio;

public class Nodo {     //Nodo que usa la class Lista

    public int Data;
    public int Costo;
    public Nodo Link;

    public Nodo() {
        Link = null;
    }

    public Nodo(int Data,int Costo) {
        this.Costo = Costo;
        this.Data = Data;
        this.Link = null;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public Nodo getLink() {
        return Link;
    }

    public void setLink(Nodo Link) {
        this.Link = Link;
    }
}
