class Main {
    public static void main(String[] args) {
          
      Jogador jogador1 = new Jogador(100, "Sir Alonne", 10, 15, 21232123123);
          
      Inimigo inimigo1 = new Inimigo("Vendrick", 100, 2, 5, "Masculino", 2);
      Inimigo inimigo2 = new Inimigo("Smelter Demon", 100, 5, 8, "Feminino", 2);
          
      Luta luta = new Luta(jogador1, inimigo1, inimigo2);
          
      System.out.println("Vendrick e Sir Alone se enfrentam");
      luta.enfrentar();
      System.out.println("Agora Smelter Demon aparace para derrotar Sir Alonne!!");
    }
  }