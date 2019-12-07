package Negocio;

public class Lista {
    private Nodo L;
    private int n;
    
    public Lista(){
        L = null;
        n = 0;
    }
    
    public void añadirNuevoNodo(int datax,int costox){ 
        Nodo Ant = null;
        Nodo p   = L;
        
        while (p != null && datax >= p.getData()){
            Ant = p;
            p = p.getLink();
        }
        
        Nodo nuevo;
        if (Ant == null){  
            nuevo = new Nodo(datax,costox);
            nuevo.setLink(L);
            L = nuevo;
            n++;
        }
        else
            {    
                 nuevo = new Nodo(datax,costox);
                Ant.setLink(nuevo);
                nuevo.setLink(p);
                n++;
            }
    }
    
    public void del(int datax,int costox){     //Elimina x de la Lista, si existe.
        Nodo Ant = null;
        Nodo p   = L;
        
        while (p != null && datax > p.getData()){
            Ant = p;
            p = p.getLink();
        }
        
        if (p != null && p.getData() == datax && p.getCosto()==costox){  //x existe en la Lista 
            if (Ant == null)
                L = L.getLink();    //x era el primero de la Lista
            else
                Ant.setLink(p.getLink());
            
            p.setLink(null);
            n--;    
        }
    }
    
    public boolean existe(int x){
        Nodo p = L;
        
        while (p != null && x > p.getData()){
            p = p.getLink();
        }
        
        return (p != null && p.getData() == x);
    }
    
    public int get(int k){  //Devuelve el k-ésimo elemento de la lista k=0, 1, ..., length()-1 
        Nodo p=L;
        int i=0;
        while (p != null){
            if (i==k)
                return p.getData();
            
            p = p.getLink();
            i++;
        }
        
        System.err.println("Lista.get: Fuera de rango");
        return -1;
    }
    
    public int getCosto(int k){  //Devuelve el k-ésimo elemento de la lista k=0, 1, ..., length()-1 
        Nodo p=L;
        int i=0;
        while (p != null){
            if (i==k)
                return p.getCosto();
            p = p.getLink();
            i++;
        }
        
        System.err.println("Lista.get: Fuera de rango");
        return -1;
    }
    
    public int length(){
        return n;
    }
    
    
    @Override
    public String toString(){ 
        String S = "[";
        String coma="";
        Nodo p  = L;
        while (p != null){
            S += coma + p.getData()+"|"+p.getCosto();
            coma=", ";
            p = p.getLink();
        }
       return S+"]";
    }
    
//    public static void main(String[] args){
//        Lista A=new Lista();
//        A.add(1, 10);
//        A.add(2, 15);
//        A.add(1, 50);
//        System.out.println(A.toString());
//    }
}
