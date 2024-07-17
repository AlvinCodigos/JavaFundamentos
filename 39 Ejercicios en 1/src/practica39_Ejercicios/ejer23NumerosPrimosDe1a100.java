package practica39_Ejercicios;

public class ejer23NumerosPrimosDe1a100 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            int cont=0;
            for (int e=1;e<=i;e++){
                if(i%e==0)
                cont++;
            }
            if (cont==2)
            System.out.println(i);
        }
       }
}
