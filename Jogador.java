public class Jogador {

  private int vida;
  private String nome;
  private short dano;
  private int defesa;
  private long usuario;
  
  public Jogador() {

  }

  public Jogador(int vida, String nome, short dano, int defesa, long usuario) {
    this.vida = vida;
    this.nome = nome;
    this.dano = dano;
    this.defesa = defesa;
    this.usuario = usuario;
  }

  public void atacar(Inimigo inimigo) {
    System.out.println("O " + this.nome + " ataca o " + inimigo.getNome() + " e o inimigo perde " + this.dano + " de vida.");
    inimigo.perderVida(this.dano);
  }
  
  public void perderVida(int pontos) {
    int dano = pontos - this.defesa;
    this.vida -= dano > 0 ? dano : 0;
    if (this.vida <= 0) {
      System.out.println("O " + this.nome + " morreu.");
    } else if (this.vida > 0) {
      System.out.println("O " + this.nome + " perdeu " + dano + " de vida.");
    }
  }
  
  public int getVida() {
    return vida;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getDano() {
    return dano;
  }

  public void setDano(short dano) {
    this.dano = dano;
  }

  public int getDefesa() {
      return defesa;
  }

  public void setDefesa(int defesa) {
      this.defesa = defesa;
  }
  
  public long getUsuario() {
    return usuario;
  }

  public void setUsuario(long usuario) {
    this.usuario = usuario;
  }
}