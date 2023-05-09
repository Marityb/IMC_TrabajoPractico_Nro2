import java.text.DecimalFormat;
// import java.util.Scanner;

public class Imc2 {

    // private static final Scanner SCANNER = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        //  System.out.println("***DESCUBRE TU INDICE DE MASA CORPORAL***");
    
        DecimalFormat df=new DecimalFormat("###,###.#");

        /*
         System.out.println("ingresa tu peso:");
         double peso = SCANNER.nextDouble();

         System.out.println("ingresa tu altura:");
         double altura = SCANNER.nextDouble();

         double alturaAlCuadrado = Math.pow(altura, 2);
         double imc = peso / alturaAlCuadrado;

         System.out.println("Tu indice de masa coerporal es: " + df.format(imc));
         * 
         */
       
        if(args.length==2){
            double peso=Double.parseDouble(args[0]);
            double altura=Double.parseDouble(args[1]);
            double imc=calcularMasaCorp(peso, altura);
            System.out.println("IndiceMasaCorporal: " +df.format(imc) +" "+ obtenerEstado(imc));
        }
       
    }

    private static Double calcularMasaCorp(double peso,double altura){
        
        double masaCorporal = peso/(altura*altura);
        
        return masaCorporal;
    }

    private static String obtenerEstado(double imc){
        if(imc>=1 && imc<=15)      return "***Tu estado es de Delgadez muy severa";
        if(imc>=15 && imc<15.9)   return "***Tu estado es de Delgadez severa";
        if(imc>=16 && imc<=18.4)     return "***Tu estado es de Delgadez.";
        if(imc>=18.5 && imc <= 24.9)  return "***Estás en el peso correcto";
        if (imc >= 25 && imc <= 29.9)  return "***Tu estado es de Sobrepeso";
        if (imc >= 30 && imc <= 34.9)  return "***Tu estado es de Obesidad moderada";
        if (imc >= 35 && imc <= 39.9) return "***Tu estado es de Obesidad severa";
        if (imc >= 40) return "***Tu estado es: Obesidad Mórbida";
        return "";
    }

    }
 

        
        
    
    