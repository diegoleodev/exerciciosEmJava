package cursojavaloiane.ExerciciosAulas16e17;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        /* . Faça um programa que leia e valide as seguintes informações:
            a. Nome: maior que 3 caracteres;
            b. Idade: entre 0 e 150;
            c. Salário: maior que zero;
            d. Sexo: 'f' ou 'm';
            e. Estado Civil: 's', 'c', 'v', 'd'; */

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, genero = "", estadoCivil, estadoCivilMomento="";
        int idade;
        double salario;

        do{
            System.out.print("Nome: ");
            nome = scan.nextLine();
            if (nome.length() > 3){
                infoValida = true;
            }else{
                System.out.println("ERRO: O nome não ter menos que 3 caracteres. Tente Novamente");
            }
        }while (!infoValida);

        infoValida = false;

        do{
            System.out.print("Idade: ");
            idade = scan.nextInt();
            if (idade >= 0 && idade <= 150){
                infoValida = true;
            }else{
                System.out.println("ERRO: A idade não pode ultrapassar 150 anos. Tente Novamente");
            }
        }while (!infoValida);

        infoValida = false;

        do{
            System.out.print("Salário: ");
            salario = scan.nextDouble();
            if (salario > 0){
                infoValida = true;
            }else{
                System.out.println("ERRO: O salário não pode ser menor que 0. Tente Novamente");
            }
        }while (!infoValida);

        infoValida = false;

        do{
            System.out.print("sexo: ");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida = true;
                if (sexo.equalsIgnoreCase("f")){
                    genero = "Feminino";
                }
                if (sexo.equalsIgnoreCase("m")){
                    genero = "Masculino";
                }
            }else{
                System.out.println("ERRO: O sexo não pode ser diferente de (f) ou (m). Tente Novamente");
            }
        }while (!infoValida);

        infoValida = false;

        do{
            System.out.print("Estado civil: ");
            estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v")
                    || estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
                if (estadoCivil.equalsIgnoreCase("s")){
                    estadoCivilMomento = "Solteiro(a)";
                }
                if (estadoCivil.equalsIgnoreCase("c")){
                    estadoCivilMomento = "Casado(a)";
                }
                if (estadoCivil.equalsIgnoreCase("v")){
                    estadoCivilMomento = "Viuvo(a)";
                }
                if (estadoCivil.equalsIgnoreCase("d")){
                    estadoCivilMomento = "Divorciado(a)";
                }
            }else{
                System.out.println("ERRO: O Estado civil não pode ser diferente de (s); (c); (v) ou (d). Tente Novamente");
            }
        }while (!infoValida);

        System.out.println("-------------------------------------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade+" anos");
        System.out.println("Salário: R$"+ String.format("%.0f", salario));
        System.out.println("Sexo: "+ genero);
        System.out.println("Estado Civil: "+ estadoCivilMomento);


    }
}
