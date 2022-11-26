package relogio;

/*
Crie as classes Relogio e Ponteiro e escreva um método main() para treinar a chamada aos
métodos e atributos.
Atributos da classe Relogio:

  *ponteiroHora (tipo Ponteiro)
  *ponteiroMinuto (tipo Ponteiro)
  *ponteiroSegundo (tipo Ponteiro)
Métodos da classe Relogio:

acertarRelogio(int, int, int): Acerta o relógio, posicionando adequadamente
cada ponteiro do relógio. Os parâmetros passados são hora, minuto e segundo.


  *lerHora(): retorna a hora atual do relógio.
  *lerMinuto(): retorna o minuto atual do relógio.
  *lerSegundo(): retorna o segundo atual do relógio.
Atributos da classe Ponteiro:

posicao(int): indica em qual posição está o ponteiro (1, 2, 3, 4, etc.)

Dica 1: Os ponteiros podem assumir as posições 1, 2, 3, 4 e assim por diante. Se um ponteiro
dos minutos está na posição 3, significa que o método lerMinuto() deve retornar 15, que é o
minuto correspondente a esta posição. O mesmo vale para o ponteiro dos segundos.

Dica 2: No método acertarRelogio(), você deve passar a hora, minuto e segundo. Suponha
que o horário fornecido seja 3 horas, 25 minutos e 50 segundos. O ponteiro das horas deve ser
posicionado no 3; o dos minutos no 5; e o dos segundos no 10.

 */

public class Relogio {
    Ponteiro ponteiroHora = new Ponteiro();
    Ponteiro ponteiroMinuto = new Ponteiro();
    Ponteiro ponteiroSegundo = new Ponteiro();

    void acertarRelogio(int hora, int minuto, int segundo){
        this.ponteiroHora.posicao = hora;
        this.ponteiroMinuto.posicao = minuto;
        this.ponteiroSegundo.posicao = segundo;
    }

    int lerHora(){
        int hora = 0;
        if(this.ponteiroHora.posicao == 1){
            hora = 1;
        }else if(this.ponteiroHora.posicao == 2){
            hora = 2;
        }else if(this.ponteiroHora.posicao == 3){
            hora = 3;
        }else if(this.ponteiroHora.posicao == 4){
            hora = 4;
        }else if(this.ponteiroHora.posicao == 5){
            hora = 5;
        }else if(this.ponteiroHora.posicao == 6){
            hora = 6;
        }else if(this.ponteiroHora.posicao == 7){
            hora = 7;
        }else if(this.ponteiroHora.posicao == 8){
            hora = 8;
        }else if(this.ponteiroHora.posicao == 9) {
            hora = 9;
        }else if(this.ponteiroHora.posicao == 10){
            hora = 10;
        }else if(this.ponteiroHora.posicao == 11){
            hora = 11;
        }else if(this.ponteiroHora.posicao == 12){
            hora = 12;
        }
        return hora;

    }

   int lerMinuto(){
        int minuto = 0;
        if(this.ponteiroMinuto.posicao == 1){
            minuto = 5;
        }else if(this.ponteiroMinuto.posicao == 2){
            minuto = 10;
        }else if(this.ponteiroMinuto.posicao == 3){
            minuto = 15;
        }else if(this.ponteiroMinuto.posicao == 4){
            minuto = 20;
        }else if(this.ponteiroMinuto.posicao == 5){
            minuto = 25;
        }else if(this.ponteiroMinuto.posicao == 6){
            minuto = 30;
        }else if(this.ponteiroMinuto.posicao == 7){
            minuto = 35;
        }else if(this.ponteiroMinuto.posicao == 8){
            minuto = 40;
       }else if(this.ponteiroMinuto.posicao == 9) {
            minuto = 45;
        }else if(this.ponteiroMinuto.posicao == 10){
            minuto = 50;
        }else if(this.ponteiroMinuto.posicao == 11){
            minuto = 55;
        }else if(this.ponteiroMinuto.posicao == 12){
            minuto = 0;
        }
        return minuto;
    }

    int lerSegundo(){
        int segundo = 0;
        if(this.ponteiroSegundo.posicao == 1){
            segundo = 5;
        }else if(this.ponteiroSegundo.posicao == 2){
            segundo = 10;
        }else if(this.ponteiroSegundo.posicao == 3){
            segundo = 15;
        }else if(this.ponteiroSegundo.posicao == 4){
            segundo = 20;
        }else if(this.ponteiroSegundo.posicao == 5){
            segundo = 25;
        }else if(this.ponteiroSegundo.posicao == 6){
            segundo = 30;
        }else if(this.ponteiroSegundo.posicao == 7){
            segundo = 35;
        }else if(this.ponteiroSegundo.posicao == 8){
            segundo = 40;
        }else if(this.ponteiroSegundo.posicao == 9) {
            segundo = 45;
        }else if(this.ponteiroSegundo.posicao == 10){
            segundo = 50;
        }else if(this.ponteiroSegundo.posicao == 11){
            segundo = 55;
        }else if(this.ponteiroSegundo.posicao == 12){
            segundo = 0;
        }
        return segundo;

    }

    public static void main(String[] args){

        Relogio relogioAnalogico = new Relogio();
        relogioAnalogico.acertarRelogio(3, 5,10);

        int hora = relogioAnalogico.lerHora();
        int minuto = relogioAnalogico.lerMinuto();
        int segundo = relogioAnalogico.lerSegundo();

        System.out.printf("%d:%d:%d", hora, minuto, segundo);
    }

}
