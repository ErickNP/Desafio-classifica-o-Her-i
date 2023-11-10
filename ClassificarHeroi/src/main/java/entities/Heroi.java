package entities;

public class Heroi {

    private String nome;
    private Integer xp;

    public Heroi() {
    }

    public Heroi(String nome, Integer xp) {
        this.nome = nome;
        this.xp = xp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public String posicaoRank(Integer xp) {

        if (xp <= 1000) {

            return "Ferro";

        } else if (xp >= 1001 && xp <= 2000) {

            return "Bronze";

        } else if (xp > 2001 && xp <= 5000) {

            return "Prata";

        } else if (xp > 6001 && xp <= 7000) {

            return "Ouro";

        } else if (xp > 7001 && xp <= 8000) {

            return "Platina";

        } else if (xp > 8001 && xp <= 9000) {

            return "Ascendente";

        } else if (xp > 9001 && xp <= 10000) {

            return "Imortal";

        } else {

            return "Radiante";
        }
    }

    public String imprimir() {
        return "- O Herói de nome " + this.nome
                + " está no nível de " + posicaoRank(xp)
                + "\n";
    }
}
