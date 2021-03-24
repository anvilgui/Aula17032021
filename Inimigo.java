public class Inimigo {
    
    private String nome;
    private int vida;
    private short dano;
    private int defesa;
    private char sexo;
    private byte level;

    public Inimigo() {

    }

    public Inimigo(String nome, int vida, short dano, int defesa, char sexo, byte level ) {

        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.defesa = defesa;
        this.sexo = sexo;
        this.level = level;
        
        
    }

    public void atacar(Jogador jogador) {
        String ataque = this.nome + "o " + jogador.getNome() + " perde " + this.dano + " de vida.";
        System.out.println(ataque);
        jogador.perderVida(this.dano);
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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

    public int getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

}