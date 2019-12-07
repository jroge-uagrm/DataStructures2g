package Negocio;

public class TagMultiGraph {

    private static int MAXVALUE = Integer.MAX_VALUE;
    private static int MAXVERTEX = 50;

    public Lista V[];
    public String nombres[];
    public int puntosX[];
    public int puntosY[];
    public boolean marcados[];
    public float pesos[];
    private int n;

    public TagMultiGraph() {
        V = new Lista[MAXVERTEX];
        nombres = new String[MAXVERTEX];
        puntosX = new int[MAXVERTEX];
        puntosY = new int[MAXVERTEX];
        marcados = new boolean[MAXVERTEX];
        n = -1;
    }

    public void addVertice(String nuevoNombre, int nuevaPosX, int nuevaPosY) {
        if (n == MAXVERTEX) {
            System.err.println("Demasiados Vertices");
            return;
        }
        n++;
        V[n] = new Lista();
        nombres[n] = nuevoNombre;
        puntosX[n] = nuevaPosX;
        puntosY[n] = nuevaPosY;
    }

    public int cantVertice() {
        return n + 1;
    }

    public void addArista(int u, int v, int costo) {
        V[u].añadirNuevoNodo(v, costo);
    }

    public float shortestPath(int a, int z) {
        pesos = new float[n + 1];
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = Float.MAX_VALUE;
        }
        pesos[a] = 0;
        desmarcarTodos();
        while (!marcado(z)) {
            int u = getMenorVerticeSinMarcar();
            marcar(u);
            for (int i = 0; i < V[u].length(); i++) {
                if (!marcado(V[u].get(i))) {
                    float p = pesos[u] + costo(u, V[u].get(i));
                    if (p < pesos[V[u].get(i)]) {
                        pesos[V[u].get(i)] = p;
                    }
                }
            }
        }
        return pesos[z];
    }

    private float costo(int a, int b) {
        return V[a].getCosto(b);
    }

    private int getMenorVerticeSinMarcar() {
        float menor = Float.MAX_VALUE;
        int menorI = n;
        for (int i = 0; i <= n; i++) {
            if (!marcados[i] && pesos[i] < menor) {
                menor = pesos[i];
                menorI = i;
            }
        }
        return menorI;
    }

    private void marcar(int u) {
        marcados[u] = true;
    }

    private boolean marcado(int z) {
        return marcados[z];
    }

    private void desmarcarTodos() {
        for (int i = 0; i < marcados.length; i++) {
            marcados[i] = false;
        }
    }

    @Override
    public String toString() {
        String cadenaFinal = "";
        for (int i = 0; i <= n; i++) {
            cadenaFinal += "[" + nombres[i] + " " + Integer.toString(i) + "]->" + V[i].toString() + "\n";
        }
        return cadenaFinal;
    }

    public int getNumero(String ciudadSeleccionada) {
        for (int i = 0; i <= n; i++) {
            if (nombres[i].equals(ciudadSeleccionada)) {
                return i;
            }
        }
        return -1;
    }
}
