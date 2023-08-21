package cursojavaloiane.Exerciciosaulas14e15;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        /*  Faça um Programa que leia um número inteiro menor que 1000 e
            imprima a quantidade de centenas, dezenas e unidades do mesmo.
                Observando os termos no plural a colocação do "e", da vírgula
                entre outros. Exemplo:
                326 = 3 centenas, 2 dezenas e 6 unidades
                12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
                310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16 */
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número menor que 1000: ");
        String numeroString = scan.nextLine();
        int numeroInteiro = Integer.parseInt((numeroString));

        if (numeroInteiro >= 1000){
            System.out.println("Número inválido para esta operação.");
        }else {
            if (numeroInteiro < 100) {
                if (numeroInteiro < 10) {
                    int unidades = Integer.parseInt(numeroString.substring(0, 1));
                    if (unidades == 1) {
                        System.out.println(unidades + " unidade.");
                    } else {
                        System.out.println(unidades + " unidades.");
                    }
                } else {
                    int dezenas = Integer.parseInt(numeroString.substring(0, 1));
                    int unidades = Integer.parseInt(numeroString.substring(1, 2));
                    if (unidades == 0) {
                        if (unidades == 1 || unidades == 0) {
                            System.out.println(dezenas + " dezena.");
                        } else {
                            System.out.println(dezenas + " dezenas.");
                        }
                    } else {
                        if (dezenas == 1) {
                            if (unidades == 1) {
                                System.out.println(dezenas + " dezena e " + unidades + " unidade.");
                            } else {
                                System.out.println(dezenas + " dezena e " + unidades + " unidades.");
                            }
                        } else {
                            if (unidades == 1) {
                                System.out.println(dezenas + " dezenas e " + unidades + " unidade.");
                            } else {
                                System.out.println(dezenas + " dezenas e " + unidades + " unidades.");
                            }

                        }

                    }

                }
            } else {
                int centenas = Integer.parseInt(numeroString.substring(0, 1));
                int dezenas = Integer.parseInt(numeroString.substring(1, 2));
                int unidades = Integer.parseInt(numeroString.substring(2, 3));

                if (dezenas == 0 && unidades == 00) {
                    if (centenas == 1) {
                        System.out.println(centenas + " centena.");
                    } else {
                        System.out.println(centenas + " centenas.");
                    }

                } else if (unidades == 0) {
                    if (dezenas == 1 && centenas == 1) {
                        System.out.println(centenas + " centena e " + dezenas + " dezena.");
                    } else {
                        if (dezenas == 1) {
                            System.out.println(centenas + " centenas e " + dezenas + " dezena.");
                        } else {
                            System.out.println(centenas + " centenas e " + dezenas + " dezenas.");
                        }
                    }
                } else if (dezenas == 0) {
                    if (unidades == 1 && centenas == 1) {
                        System.out.println(centenas + " centena e " + unidades + " unidade.");
                    } else {
                        if (unidades == 1) {
                            System.out.println(centenas + " centenas e " + unidades + " unidade.");
                        } else {
                            System.out.println(centenas + " centenas e " + unidades + " unidades.");
                        }
                    }
                } else {
                    if (unidades == 1 && dezenas == 1 && centenas == 1) {
                        System.out.println(centenas + " centena, " + dezenas + " dezena e " + unidades + " unidade.");

                    } else if (unidades == 1 & centenas == 1) {
                        System.out.println(centenas + " centena, " + dezenas + " dezenas e " + unidades + " unidade.");
                    } else if (unidades == 1 && dezenas == 1) {
                        System.out.println(centenas + " centenas, " + dezenas + " dezena e " + unidades + " unidade.");
                    } else {
                        if (dezenas == 1) {
                            System.out.println(centenas + " centenas, " + dezenas + " dezena e " + unidades + " unidades.");
                        } else if (unidades == 1) {
                            System.out.println(centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidade.");
                        } else if (centenas == 1) {
                            System.out.println(centenas + " centena, " + dezenas + " dezenas e " + unidades + " unidades.");
                        } else {
                            System.out.println(centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades.");
                        }
                    }
                }
            }
        }
    }
}

