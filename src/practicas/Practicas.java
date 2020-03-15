
package practicas;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.Color;
import java.awt.Label;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;


public class Practicas {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
         
        /* 
          1) Realizar una aplicación que acepte un conjunto de palabras y determine
            a)Palabra de mayor longitud y cuantos caracteres posee.
            b)Palabra de menor longitud y cuantos caracteres posee 
            
            La cantidad de palabras lo establece  el usuario
        */
        
        /*
        String palabra, palabraMayor, palabraMenor;
        int cantidad=0, compara, mayorCaracter, menorCaracter;
        boolean validacion = true;
        
        while(validacion == true){
            try{
                System.out.print("¿Cuantas palabras ingresará?: ");
                cantidad = entrada.nextInt();
                validacion = false;
                if (cantidad <= 0) {
                    System.err.println("La cantidad debe ser mayor y diferente de cero \nIntente nuevamente..");
                    validacion = true;
                }
            }catch (Exception  e){
                System.err.println("SOLO NUMEROS ENTEROS!!");
                entrada.nextLine();
            }
        }
        
        System.out.print("Ingrese una palabra: ");
        palabra = entrada.next();
        
        palabraMayor = palabra;
        palabraMenor = palabra;
        mayorCaracter = palabra.length();
        menorCaracter = palabra.length();
        
        for (int x = 1; x < cantidad ; ++x) {
            
            System.out.print("Ingrese una palabra: ");
            palabra = entrada.next();
            compara = palabra.length();
            if (compara > mayorCaracter) {
                mayorCaracter = compara;
                palabraMayor = palabra;
                
            }else if (compara < menorCaracter){
                menorCaracter = compara;
                palabraMenor = palabra;
                
            } 
        }
        System.out.println("Palabra mayor "+palabraMayor+" con "+mayorCaracter+" caracteres");
        System.out.println("Palabra menor "+palabraMenor+" con "+menorCaracter+" caracteres"); 
        */
        
        //-----------------------------------------------   
        
        /*
        2) Realizar una aplicación que acepte un conjunto de números enteros y determine:
        
            a) Mayor negativo.
            b) Menor positivo.
        - La cantidad de enteros lo establece el usuario.
        - Validar el ingreso de enteros. 
        */
        
        /* PD: BORRAR ESTA ANULACION DEL TEXTO
        int cantidad=0, num=0, mayorNegativo=0, menorPositivo=0, caso=0;
        boolean entra = true, entra2 = true, validacion = true;
        
        while (validacion == true) {
            try{
                System.out.print("¿Cuantos numeros va ingresar?: ");
                cantidad = entrada.nextInt();
                validacion = false;
                if (cantidad <= 0) {
                    System.err.println("SOLO NUMEROS ENTEROS MAYOR A CERO!");
                    validacion = true;
                }                
            }catch (Exception e){
                System.err.println("SOLO NUMEROS ENTEROS!!!");
                System.err.println("Tipo de error: "+e);
                entrada.nextLine();
            }
        }
        
       
        for (int x = 1; x <= cantidad; ++x) {
            
            validacion = true;
            while(validacion == true){
                try{
                    System.out.print("Ingrese numero "+x+" de "+cantidad+" : ");
                    num = entrada.nextInt();
                    validacion = false;
                }catch(Exception e){
                    System.err.println("SOLO ENTEROS!!!!");
                    System.err.println("Tipo error: "+e);
                    entrada.next();
                }
            }
            if (num < 0) {  //Si el numero es negativo, entrará y se comparará con los negativos
                caso = 3;
                if (entra == true) {
                    mayorNegativo = num;
                    entra = false;
                }
                if (num > mayorNegativo ) {
                    mayorNegativo = num;
                }
                
            }else if (num > 0) {  //Si el numero es positivo, entrará y se comparará con los positivos
                caso = 3;
                if (entra2 == true) {
                    menorPositivo = num;   
                    entra2 = false;
                }
                if (num < menorPositivo) {
                    menorPositivo = num;     
                }
            }
        }
        if (menorPositivo == 0) {  //No se ingresaron numeros positivos
            caso = 1;      
        }else if (mayorNegativo == 0) {  //No se ingresaron numeros negativo
            caso = 2;    
        }
        
        switch (caso){
            
            case 1 : 
                System.out.println("No se ingresaron numeros positivos.");
                System.out.println("Mayor negativo = "+mayorNegativo);
                break;
                
            case 2 :
                System.out.println("No se ingresaron numeros negativos.");
                System.out.println("Menor positivo = "+menorPositivo);
                break;
            
            case 3 :
                System.out.println("Menor positivo = "+menorPositivo);
                System.out.println("Mayor negativo = "+mayorNegativo);
                break;
                    
        }
        */
        
        //-----------------------------------------------   
        
        /*
        3) Realizar una aplicación que acepte un conjunto de notas y determine:
            a) Nota menor.
            b) Nota mayor.
            c) Promedio de notas.
        
            - La cantidad de notas la fija el usuario.
            - El promedio se muestra con un decimal.
            - Se valida el ingreso de datos del usuario.
        */
        /*
        int cant=0, x=1;
        float nota=0, notaMenor=0, notaMayor=0;
        float promedio = 0;
        boolean validacion = true;
        
        while (validacion == true) { 
            try{
                System.out.print("¿Cuantas notas va ingresar?: ");
                cant = entrada.nextInt();
                validacion = false;
                if (cant <= 0) {
                    System.err.println("SOLO NUMEROS ENTEROS MAYOR A CERO!");
                    validacion = true;
                } 
            }catch (Exception e){
                System.err.println("SOLO NUMEROS ENTEROS");
                entrada.nextLine();
                
            }
        }

        
        while(x <= cant){
            try{
                validacion = true;
                while(validacion == true){
                    System.out.print("Ingrese nota "+x+" de "+cant+" con un decimal: ");
                    nota = entrada.nextFloat();
                    validacion = false;
                    if (nota < 1 || nota > 7) {
                        System.err.println("Las notas NO deben ser negativas, igual a cero o mayores a 7... \nIntente nuevamente.");
                        validacion = true;
                    }
                }
                promedio = promedio+nota;
                if (x==1) {
                    notaMayor = nota;
                    notaMenor = nota;
                }
                if (nota > notaMayor) {
                    notaMayor = nota;
                
                }else if (nota < notaMenor) {
                    notaMenor = nota;
                }
                x=x+1;
            }catch(Exception e){
                System.err.println("Por favor ingrese las notas con coma  ->  ,  <-");
                System.err.println("Tipo de error: "+e);
                entrada.next();
                 
            }    
        }
       
        System.out.println("Nota menor: "+notaMenor);
        System.out.println("Nota mayor: "+notaMayor);
        System.out.printf("promedio %.1f%n ",promedio/cant);
        */

        //-----------------------------------------------   
        
        /* 
       4) Realizar una aplicación que acepte los parámetros de una ecuación
          de segundo grado y determine:
            a) La ecuación tiene o no solución en los reales.
            b) Si tiene solución, cuantas y cuáles.
            - Se valida el ingreso de parámetros.        
        */
       
        /*
        int a=0, b=0, c=0,caso=0;
        boolean validacion = true;
        double x1=0,x2=0, discriminante=0;
        
        System.out.println("Recuerde tener la ecuación igualada a cero. \nEjemplo: 2x^2 + 32x - 2312 = 0");
        //Le informo al usuario que debe tener la ecuacion despejada para proseguir.
       
        while(validacion == true){
            try{   //Con el try me aseguro que solo ingrese NUMEROS ENTEROS, de ser de lo contrario se le insistirá
                System.out.print("Ingrese el coeficiente cuadratico: "); //Ingresa entero junto a la incognita al cuadrado
                a = entrada.nextInt();
                System.out.print("Ingrese el coeficiente lineal: "); //Ingresa el valor junto a la incognita lineal
                b = entrada.nextInt();
                System.out.print("Ingrese la constante: ");  //Ingrresa el valor de la constante
                c = entrada.nextInt();
                validacion = false;
                
            }catch (Exception e){  //De no haber ingresado un numero entero, pasará a la excepcion y se le pedirá nuevamente el num
                System.err.println("¡SOLO SE ADMITE EL USO DE NUMEROS ENTEROS! \nIntente nuevamente...");
                entrada.next();
            }
        }
        
        discriminante = Math.pow(b, 2)-(4*a*c);  //Determino el discriminante para determinar la cantidad de soluciones
        
        if (discriminante > 0) {
            System.out.println("Tiene dos soluciones reales posibles \nSolución:");
            caso = 1;
            
        }else if (discriminante == 0) {
            System.out.println("Tiene una sola solución real posible \nSolución:");
            caso = 2;
            
        }else if (discriminante < 0) {
            System.err.println("El discrimante es negativo por ende NO tiene solución en los reales. \nDiscriminante: "+discriminante);
            
        } 
        
        switch (caso){
            
            case 1 : 
                x1 = ((b*(-1)) + Math.pow(discriminante, 0.5)) / (2*a);
                x2 = ((b*(-1)) - Math.pow(discriminante, 0.5)) / (2*a);
                System.out.println("X1 = "+x1);
                System.out.println("X2 = "+x2);
                break;
            case 2:
                x1 = ((b*(-1)) + Math.pow(discriminante, 0.5)) / (2*a);
                System.out.println("X1 = "+x1);
                break;             
        }
        */

        //-----------------------------------------------
        
        /*
        5) Realizar una aplicación que simule los lanzamientos de un dado de seis caras.
        El usuario establece el número de lanzamientos del dado
        */
        /*
        int cantidad=0;
        double dado, resultado=0;
        boolean validacion = true;
        
        while(validacion == true){   //PLUS , VALIDO QUE LA CANTIDAD DE VECES A LANZAR EL DADO SEA UN NUMERO!!!
            try{
                System.out.print("¿Cuantas veces va lanzar el dado?: ");
                cantidad = entrada.nextInt();
                validacion = false;
                if (cantidad <= 0) {
                    System.err.println("La cantidad de veces a lanzar el dado no puede ser menor o igual a cero \nIntente nuevamente");
                    validacion = true;
                }
       
            }catch (Exception e){   //EL USUARIO INGRESÓ ALGO NO VALIDO
                System.err.println("SOLO SE ADMITEN NUMEROS ENTEROS!");
                System.err.println("Tipo error: "+e);
                entrada.nextLine();
            }
        }
        for (int x = 1; x <= cantidad; ++x) {   //CICLO LANZAMIENTO CANTIDAD DE VECES
            
            dado = (int)(Math.random()*6)+1;   //Lo trunco x int, para que se redondee al entero aprox
            System.out.println("El lanzamiento ["+x+" de "+cantidad+"] obtuvo el numero: "+dado);  //Muestro el resultado 
            resultado = resultado + dado; 
        }
        
        System.out.println("La suma de los numeros obtenidos fue de: "+resultado);  //PLUS MUESTRO LA SUMA TOTAL DE TODOS LOS LANZAMIENTOS
        */
        
        //-----------------------------------------------
        
        /*
        6) Realizar una aplicación que determine cuáles y cantidad de números perfectos que
        se encuentren en un determinado intervalo numérico que ingrese un usuario.
        - Se valida el ingreso del intervalo.
            Definición: Un número es perfecto cuando la suma de sus divisores, excepto él mismo
            es igual al número. Ejemplo 6 es perfecto.        
        */        
        /*
        int suma, intervaloMenor=0, intervaloMayor=0, cantidad=0; 
        boolean validacion = true;
        
        while(validacion == true){
            try{
                System.out.print("¿Desde que numero inicia su intervalo?: ");
                intervaloMenor = entrada.nextInt();
                System.out.print("¿En que numero finaliza su intervalo?: ");
                intervaloMayor = entrada.nextInt();
                validacion = false;
                
                if (intervaloMenor >= intervaloMayor) {
                    System.err.println("El inicio no puede ser menor al numero donde finaliza \nIntente de nuevo");
                    validacion = true;
                    
                }else if (intervaloMenor <= 0 || intervaloMayor <= 0) {
                    System.err.println("Solo se admiten numeros mayores y diferentes de cero \nIntente de nuevo..");
                    validacion = true;
                }
            }catch (Exception b){
                System.err.println("SOLO SE ADMITEN NUMEROS ENTEROS! \nIntente nuevamente");
                entrada.nextLine();
            }    
        }
        
        //Verifico si el nro donde comienza es menor o ya llegó hasta su fin
        while (intervaloMenor <= intervaloMayor){ 
            suma = 0;  //reseteo la suma para volver a usarla
            for (int x = 1; x < intervaloMenor; ++x) { //calculo si es perfecto o no
                if (intervaloMenor%x == 0) {
                    suma = suma + x;
                }
            }
            //Si la suma es igual al numero eso quiere decir que es perfecto, y sumo cuantos numeros entran en el if
            if (suma == intervaloMenor) {    
                System.out.println("El numero "+intervaloMenor+" es perfecto");
                ++cantidad;
            }
        ++intervaloMenor;  //aumento el inicio del intervalo 
        }
        System.out.println("La cantidad de numeros perfectos es: "+cantidad);
        */       
        
        
        //-----------------------------------------------
        
        
        //Ejercicio 1= Realizar una aplicacion java que obtenga la salida: 1,2,3,4,5,6,7,8,9,10,_
        /*
        int x=1;
        while (x<=10){
            System.out.print(x+",");
            ++x;
        }
        */
        
        /*Ejercicio 2= Realizar una aplicacion que obtenga la salida: 20,19,18,...,2,1,_
        
        int y=20;
        while (y>=1){
            System.out.print(y +",");
            --y
        }
        */
        
        /* Ejercicio 3:
        
        int num = 1;
        while (num<=10){
            System.out.println(num);
            ++num
        }
        */
        
        /*Ejercicio 4:
        
        int fila1 = 1;
        int fila2 = 20;
        while (fila1<=20 && fila2>=1){
            System.out.println(fila1 + "     " + fila2);
            fila1 = fila1+1
            fila2 = fila2-1
        }
        */
        
        //Ejercicio 5:
        
        /*int filaNum = 1;
        while (filaNum <= 20){
            System.out.print(filaNum + "    ");
            ++filaNum;
            if (filaNum % 2 == 0) {
                System.out.println("A");
            }else{
                System.out.println("B");
                
            }
        }*/
        
        /*int num;
        num = 1;
        char a='A';
        char b='B';
        
        while (num <= 20){
            char letter = (num%2==0)?b:a;
            System.out.println(num+"     "+letter);
            ++num;
        }*/
        
        /*Usos del for
        
        for (int i = 1; i <= 3; ++i) {
            System.out.print(i);    
        }*/
        
        //Transformar a ciclo for()
        
        /*int a=0;
        int i=1;
        while (i<=10){
            a = a+i;
            ++i;
        }
        System.out.println(a);
        */
        
        /*
        int a=0;
        for (int i=1; i <= 10; ++i) {
            a = a+i;  
        }
        System.out.println(a);
        */
        
        
        //Realizar app que acepte la entrada de 5 notas parciales y determine su promedio. Utilizar for
        
        /*
        int cant;
        System.out.print("¿Cuantas notas va ingresar?: ");
        cant = entrada.nextInt();
        float n;
        float promedio = 0;
        for (int x = 1; x <= cant; ++x) {
            System.out.print("Ingrese nota: ");
            n = entrada.nextFloat();
            promedio = promedio+n;
        }
        promedio = promedio/cant;
        System.out.printf("promedio%.1f%n",promedio);
        */
        
        
        //Realizar app que acepte 10 numeros enteros.Luego mostrar en la salida el primero y el ultimo
        /*
        int cant = 10;
        int n;
        int primero=0;
        int ultimo=0;
        for (int i = 1; i <= 10; ++i) {
            System.out.print("Ingrese numero: ");
            n = entrada.nextInt();
            if (i==1) {
                primero = n;
            }
            if (i==10){
                ultimo = n;
            }
        }
        System.out.print("El primer numero es: "+ primero + " y el ultimo numero es: " + ultimo);
        */
        
        
        //Realizar una app que acepte 10 numero entero  y determinar el menor y el mayor
        
        /*
        int nMenor=0;
        int nMayor=0;
        int n=0;
        int cant;
        System.out.print("¿Cuantos numeros va ingresar?: ");
        cant = entrada.nextInt();
        for (int x = 1; x <= cant; ++x) {
            System.out.print("Ingrese numero "+x+" de "+cant+":");
            n = entrada.nextInt();
            if (n>nMayor) {
                nMayor = n;
            }
            if (n<nMenor){
                nMenor = n; 
            }
     
        }
        System.out.println("El numero menor es: "+nMenor+" y el numero mayor es :"+nMayor);
        */
        
        //Realizar una app que obtenga la suma de los primeros 100 primeros multiplos de 7
        
        /*
        int suma = 0;
        for (int x = 1; x <= 100; ++x) {
            if (x%7==0) {
                suma = suma + x;   
            }
        }
        System.out.println("La suma de los 100 primeros multiplos de 7 es: "+suma);
        */
        
        //Ejercicio anterior pero general.
        /*
        int suma2=0;
        int cant;
        int mult;
        System.out.print("¿Cuantos numeros desea sumar?: ");
        cant = entrada.nextInt();
        System.out.print("¿De cual multiplo los sumará?: ");
        mult = entrada.nextInt();
        for (int x = 1; x <= cant; ++x) {
            if (x%mult==0) {
                suma2 = suma2 + x;  
            }
        }
        System.out.println("La suma de los "+cant+" multiplos de "+mult+" es: "+suma2);
        */
        
        
        
        //Realizar una app que acepte el lado de un cuadrado (real) y determine Area, Perimetro, Diagonal
        /*
        double lado,area,perimetro,diagonal;
        System.out.println("Realizar una app que acepte el lado de un cuadrado (real) y determine Area, Perimetro, Diagonal \n");
        System.out.print("Ingrese un lado: ");
        lado = entrada.nextDouble();     
        area = Math.pow(lado, 2);
        perimetro = (lado+lado+lado+lado);
        diagonal = Math.pow(lado,0.5);
        
        System.out.println("El area del cuadrado es: "+area);
        System.out.println("El perimetro es: "+perimetro);
        System.out.println("Su diagonal es: "+diagonal);
        */
        
        
        //Realizar una app que acepte los lados de un rectangulo y determine area, perimetro, diagonal
        /*
        double area,base,altura,perimetro,diagonal;
        System.out.println("Realizar una app que acepte los lados de un rectangulo y determine area, perimetro, diagonal \n");
        System.out.print("Ingrese su base: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = entrada.nextDouble();
        
        area = (base*altura);
        perimetro = (base*2)+(altura*2);
        diagonal = Math.pow(base, 2) + Math.pow(altura, 2);
        diagonal = Math.pow(diagonal, 0.5);
        
        System.out.println("El area del rectangulo es: "+area);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        System.out.println("La diagonal del rectangulo es: "+diagonal);
        */
        
        //Realizar app que acepte radio de un circulo (real) y determine: Area, perimetro, diametro
        /*
        double perimetro,radio,area,diametro;
        System.out.println("Realizar app que acepte radio de un circulo (real) y determine: Area, perimetro, diametro \n");
        System.out.println("Introduce el rádio del círculo: ");
        radio = entrada.nextDouble();
        
        area = Math.PI*(Math.pow(radio, 2));
        perimetro = 2*Math.PI*radio;
        diametro = radio*2;
        
        System.out.println("El area del circulo es: "+area);
        System.out.println("El perímetro es de: "+perimetro);
        System.out.println("El diametro es de :"+diametro);
        */
        
        //Realizar una app qque permita calcular las raices de una ecuacion de 2°grado. Si no es posible el calculo enviar un mensaje
        /* Falta!!!
        double a,b,c,x1,x2;
        System.out.println("Realizar una app qque permita calcular las raices de una ecuacion de 2°grado. Si no es posible el calculo enviar un mensaje \n");
        JOptionPane.showMessageDialog(null, "¡Recuerde que debe tener la ecuacion igualada a cero antes de seguir!");
        System.out.print("Ingrese el numero de la variable al cuadrado: ");
        a = entrada.nextDouble();
        System.out.print("Ingrese el numero de la variable lineal, de no tener es cero: ");
        b = entrada.nextDouble();
        System.out.print("Ingrese el termino independiente: ");
        c = entrada.nextDouble();
        
        x1 = (-b+Math.pow(Math.pow(b, 2)-(4*a*c),2))/2*a;
        x2 = (-b-Math.pow(Math.pow(b, 2)-(4*a*c),2))/2*a;
        
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        */
        
        
        //Ejemplo uso del Switch.. Tambien se usa JOPtion y Interger.parseInt
        
        /*
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del 1 al 7"));
        switch (num){
           
           case 1 : JOptionPane.showMessageDialog(null,"El dia es lunes");
                    break;
           case 2 : JOptionPane.showMessageDialog(null, "El dia es martes");
                    break;
           case 3 : JOptionPane.showMessageDialog(null,"El dia es miercoles");
                    break;
           case 4 : JOptionPane.showMessageDialog(null,"El dia es jueves");
                    break;
           case 5 :JOptionPane.showMessageDialog(null,"El dia es viernes");
                    break;
           case 6 : JOptionPane.showMessageDialog(null,"El dia es sabado");
                    break;
           case 7 : JOptionPane.showMessageDialog(null,"El dia es domingo");
                    break;
           default : JOptionPane.showMessageDialog(null,"el numero ingresado no está entre 1-7");
                    break;
        }
        */
        
        
        //Como leer solo un caracter
        /*
        char letra;
        System.out.print("Ingrese una letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("El caracter ingresado es: " + letra);
        */
        
        
        //Realizar una aplicacion java que acople un numero entero por teclado y determine si es par o impar
        /*
        int num;
        System.out.print("Ingrese numero: ");
        num = entrada.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
               
        
        //Realizar app que acepte numero entero y muestra siempre positivo o cero (valor absoluto)
        int num2;
        int absoluto;
        System.out.print("Ingrese numero: ");
        num2 = entrada.nextInt();
        if (num2 > 0) {
           absoluto = num2; 
        }else{
            absoluto = -1*num2;  
        }
        System.out.println("El valor absoluto de " + num2 + " es: " + absoluto);  
        
        //Realizar app que acepte numero entero y determine si es positivo, negativo o neutro
        int num3;
        System.out.print("Ingrese numero: ");
        num3 = entrada.nextInt();
        if (num3 > 0) {
            System.out.println("El numero: " + num3 + " es positivo");
        }else if (num3 < 0){
            System.out.println("El numero: " + num3 + " es negativo");
        }else if (num3 == 0) {
            System.out.println("El numero: " + num3 + " es neutro");
            
        }
            
        //Realizar una app java que acepte 2 numero entero y determine cual es el mayor
        int num4;
        int num5;
        System.out.print("Ingrese numero: ");
        num4 = entrada.nextInt();
        System.out.print("Ingrese otro numero: ");
        num5 = entrada.nextInt();
        if (num4 > num5) {
            System.out.println("El numero " + num4 + " es mayor a " + num5);
        }else if (num4 < num5) {
            System.out.println("El numero " + num5 + " es mayor a " + num4);
        }else if (num4 == num5) {
            System.out.println("Ambos numeros " + num4 + " y " + num5 + " son iguales");
        }
        */
        //Realizar una aplicacion java que acepte numero entero y determine su utlima cifra ej 5324 --> 4
        /*
        int num6;
        System.out.print("Ingrese numero: ");
        num6 = entrada.nextInt();
        System.out.println("La ultima cifra es: "+ num6%10);
        */
         

        
        //Realizar una app java que valide el ingreso de un numero entero (leer desde teclado) (Realizarlo hasta que lo ingrese correctamente)
    
        /*
        int num=0;
        boolean validacion = true;
       
        while(validacion == true){ 
            
            try{
                System.out.print("Ingrese un numero: ");
                num = entrada.nextInt();
                System.out.println("El numero ingresado es: "+num);
                validacion = false;
            }
             catch(Exception e){
                System.out.println("El numero ingresado "+num+" no es de tipo entero.");
                System.out.println("Error tipo: "+e);
                validacion = true;
                entrada.next();
            }
        }
        */        
        
        //-----------------------------------------------
        
       /* 
       //USO DEL SWITCH EJEMPLO
       int num;
       num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del 1 al 7"));
       switch (num){
           
           case 1 : JOptionPane.showMessageDialog(null,"El dia es lunes");
                    break;
           case 2 : JOptionPane.showMessageDialog(null, "El dia es martes");
                    break;
           case 3 : JOptionPane.showMessageDialog(null,"El dia es miercoles");
                    break;
           case 4 : JOptionPane.showMessageDialog(null,"El dia es jueves");
                    break;
           case 5 :JOptionPane.showMessageDialog(null,"El dia es viernes");
                    break;
           case 6 : JOptionPane.showMessageDialog(null,"El dia es sabado");
                    break;
           case 7 : JOptionPane.showMessageDialog(null,"El dia es domingo");
                    break;
           default : JOptionPane.showMessageDialog(null,"el numero ingresado no está entre 1-7");
                    break;
       
       }
       */
       
       /*
        int total=0;
        for (int x = 1; x <= 7; ++x) {
            if (x==1) {
               total = 500;
            }
            total = total + (total*5);
        }
        System.out.println("El valor total a pagar durante los 7 meses es: "+total);
        */
        
        /*
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println(nombre.charAt(1));
       */
        
        
        
        //Realizar una app que acepte una palabra (teclado) y determine cuantas letras posee
        
        /*
        String palabra;
        int cantidad;
        System.out.print("Ingrese una palabra: ");
        palabra = entrada.nextLine();
        cantidad = palabra.length();
        System.out.println("La cantidad de palabras de "+palabra+" es de: "+cantidad+" caracteres");
        */
        
        //Realizar una pp que acepte una palabra y determine su primer y ultimo carácter
        
        /*
        char primer;
        char ultimo;
        String palabra;
        System.out.print("Ingrese una palabra: ");
        palabra = entrada.nextLine();
        primer = palabra.charAt(0);
        ultimo = palabra.charAt(palabra.length()-1);
        System.out.println("El primer caracter es: "+primer+" y el ultimo caracter es: "+ultimo);
        */
        
        //Realizar una app que acepte 2 palabras y determine la de mayor longitud
        
        /*
        String primera,segunda;
        int n1,n2;
        
        System.out.print("Ingrese la primera palabra: ");
        primera = entrada.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        segunda = entrada.nextLine();
        
        n1 = primera.length();
        n2 = segunda.length();
        if (n1==n2){
            System.out.println("Las palabras contienen la misma cantidad de caracteres");   
        }
        if(n1>n2){
            System.out.println("La palabra "+primera+" es mayor");
        }else if(n1<n2){
            System.out.println("La palabra "+segunda+" es mayor");
        }
        */
        
        
        //Confirmacion contraseña
        /*
        String contra,contra1;
        boolean confirma;
        int x=0;
        
        while(x<3){
            System.out.print("Ingrese su contraseña: ");
            contra = entrada.nextLine();
            System.out.print("Confirme su contraseña: ");
            contra1 = entrada.nextLine();
            confirma = contra.equals(contra1);
            if (confirma==true) {
                 System.out.println("Bienvenido");
                 break;
            }else{
                System.err.println("Las contraseñas no coinciden.");
                ++x;
                System.out.println("Intentelo nuevamente, lleva "+x+" de 3 intentos");
                
            }
        }
        */
        
        /*
        String palabra, palabraMayor = null, palabraMenor = null;
        int cantidad, compara = 0, mayorCaracter = 0, menorCaracter = 0;
        
        System.out.print("¿Cuantas palabras ingresará?: ");
        cantidad = entrada.nextInt();
        System.out.print("Ingrese una palabra: ");
        palabra = entrada.next();
        
        palabraMayor = palabra;
        palabraMenor = palabra;
        mayorCaracter = palabra.length();
        menorCaracter = palabra.length();
        
        for (int x = 1; x < cantidad ; ++x) {
            
            System.out.print("Ingrese una palabra: ");
            palabra = entrada.next();
            compara = palabra.length();
            if (compara > mayorCaracter) {
                mayorCaracter = compara;
                palabraMayor = palabra;
                
            }else if (compara < menorCaracter){
                menorCaracter = compara;
                palabraMenor = palabra;
                
            }
            
        }
        System.out.println("Palabra mayor "+palabraMayor+" con "+mayorCaracter+" caracteres");
        System.out.println("Palabra menor "+palabraMenor+" con "+menorCaracter+" caracteres");
        */
        
        
        //Programa que imprima las letras de un nombre
        /*
        char letra;
        String nombre;
        
        System.out.print("Ingrese un nombre: ");
        nombre = entrada.nextLine();
        char a [] = new char[nombre.length()];
        for (int x = 0; x < nombre.length(); x++) {
            a [x] = nombre.charAt(x);
            
        }
        System.out.println("Las letras son: "+Arrays.toString(a));
        */
        
        
        
    }
    
}
