using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace ConsoleApp2
{
    public class Repeticao
    {
        static void Main(string[] args)
        {

            /*Escreva um programa que solicite ao usuário um número inteiro e exiba a tabuada desse número de 1 a 10 usando um laço for.*/

            Console.WriteLine("Digite o número que deseja ver na tabuada");
                 int num1 = int.Parse(Console.ReadLine());
            for (int i =0; i < 11; i ++)
             {
                 Console.WriteLine($"{num1} x {i} = {num1 * i}");
             }

            /*Crie um programa que solicite ao usuário um número inteiro positivo e 
             * calcule a soma de todos os números inteiros de 1 até esse número utilizando um laço while*/

            
            Console.WriteLine("Digite um número");
            int num2 = int.Parse(Console.ReadLine());
             int repetir = 0;
             while (repetir <= num2)
            {
              Console.WriteLine($"A soma entre {num2} e {repetir} é igual a {repetir + num2}");
              repetir++;
            }
            


            /*Faça um programa que exiba uma contagem regressiva de 10 até 0 usando um laço for ou while. 
             * Após a contagem, o programa deve exibir a mensagem: "Feliz Ano Novo!".
             */

            int contagem = 10;

            for (int i=0; i<=10; i++)
            {
                Console.WriteLine(contagem);
                contagem--;
            }
            Console.WriteLine("Feliz Ano Novo!");

            /*Escreva um programa que peça ao usuário para digitar uma senha e continue solicitando até que ele insira a senha correta ("12345").
             * Utilize um laço do-while*/

            string senha = "12345";
            string senhaDigitada;
            do
            {
                Console.WriteLine("Digite a senha");
                senhaDigitada = Console.ReadLine();

                if (senhaDigitada == senha)
                {
                    Console.WriteLine("Senha Correta");
                }
                else
                {
                    Console.WriteLine("Senha Incorreta");
                }

            } while (senhaDigitada != senha);

        }
    }
}
