public class filme {

    public static void main(String[] args) {
        System.out.println("Bem vindos ao TecFlix");
        System.out.println("Filme: A espera de um Milagre");

        int anoDeLancemento = 1999;
        System.out.println("Ano de lançamento " + anoDeLancemento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 4.7;
        // Média calculada pelas notas do Luiz, Rafel e Renan
        double media = (7.7 + 8.5 + 10) / 3;
        System.out.println("A média que o Segundo Tec deu " + media);

        String sinopse;

        sinopse = """ 
               Sinopse: À Espera de um Milagre se passa em 1935, na Penitenciária de Cold Mountain.
                 A trama acompanha Paul Edgecomb, chefe de guarda do corredor da morte.
                  A vida na prisão muda com a chegada de John Coffey, um gigante negro condenado pelo assassinato brutal de duas meninas, que possui um dom misterioso e milagroso.
                  E foi lançado em: 
                 """ + anoDeLancemento;
                  System.out.println(sinopse);
    }
}