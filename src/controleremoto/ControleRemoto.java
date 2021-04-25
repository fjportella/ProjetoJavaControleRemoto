/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleremoto;

/**
 *
 * @author Fernando
 */
public class ControleRemoto {

    public boolean ligatv;
    private int numcanal;
    public int numvolume;
    public String statusliga;
    public String statusvol;
    private int precan;
    private String source;
    private String result;

    //Métodos Normais
    public void aumcanal() {
        if (this.getNumcanal() < 999) {
            numcanal++;
        }
    }

    public void dimcanal() {
        if (this.getNumcanal() > 0) {
            numcanal--;
        }
    }

    public void aumvolume() {
        if (this.getNumvolume() < 100) {
            numvolume++;
        }
    }

    public void dimvolume() {
        if (this.getNumvolume() > 0) {
            numvolume--;
        }
    }

    public void mudo() {
        this.statusvol = "MUDO";
    }

    public void ligadesl() {
        if (this.getLigatv() == false) {
            this.setLigatv(true);
            this.statusliga = "TV Ligada";
        } else {

            this.setLigatv(false);
            this.statusliga = "TV Desligada";

            this.numcanal = 0;
            this.numvolume = 0;
            this.statusvol = "";
            this.precan = 0;
            this.source = "";
            this.result = "";

        }

    }

    public void source() {
        this.source = "TV Screem Mirror HDMI1 HDMI2 USB1 USB2 ";

    }

    public void luzbotao() {

        this.setResult("Luz do Controle Ligada!");

    }

    public void smarthub() {
        this.setResult("Abrindo Smart Hub!");
    }

    public void menu() {
        this.setResult("Abrindo Menu!");
    }

    public void guia() {
        this.setResult("Abrindo Guia!");
    }

    public void tools() {
        this.setResult("Abrindo Ferramentas!");
    }

    public void info() {
        this.setResult("Abrindo Informações!");
    }

    public void func_a() {
        this.setResult("Acionando Função A!");
    }

    public void func_b() {
        this.setResult("Acionando Função B!");
    }

    public void func_c() {
        this.setResult("Acionando Função C!");
    }

    public void func_d() {
        this.setResult("Acionando Função D!");
    }

    public void futebol() {
        this.setResult("Acionando Função Futebol!");
    }

    public void status() {
        this.setResult("Abrindo Status!");
    }

    public void more() {
        this.setResult("Abrindo Função Mais!");
    }

    public void manual() {
        this.setResult("Abrindo Manual da TV!");
    }

    public void pip() {
        this.setResult("Abrindo Função PIP!");
    }

    public void lstserv() {
        this.setResult("Abrindo Lista de Serviços!");
    }

    public void retroc() {
        this.setResult("Retrocedendo Vídeo!");
    }

    public void pausa() {
        this.setResult("Vídeo Pausado!");
    }

    public void avanc() {
        this.setResult("Avançando Vídeo!");
    }

    public void tresd() {
        this.setResult("Vídeo em 3D!");
    }

    public void play() {
        this.setResult("Iniciando Vídeo!");
    }

    public void stop() {
        this.setResult("Vídeo Parado!");
    }

    public void retornar() {
        this.setResult("Retornar para a Opção Anterior!");
    }

    public void sair() {
        this.setResult("Executa Função Sair!");
    }

    public void canaisdig() {
        this.setResult("Mostra Mais Canais Digitais!");
    }

    public void botaodir() {
        this.setResult("Percorre Opções à Direita!");
    }

    public void botaoesq() {
        this.setResult("Percorre Opções à Esquerda!");
    }

    public void botaoacima() {
        this.setResult("<html>Percorre Opções para Cima! Ou então pressione "
                + "Lista de Canais para percorrer entre os canais!</html>");
    }

    public void botaobaixo() {
        this.setResult("<html>Percorre Opções para Baixo! Ou então pressione "
                + "Lista de Canais para percorrer entre os canais!</html>");
    }

    public void botaoenter() {
        this.setResult("<html>Botão Enter! Ou então pressione "
                + "Lista de Canais para selecionar um canais!</html>");
    }

    //Método Contrutor
    public ControleRemoto() {
        this.ligatv = false;
        this.statusliga = "TV Desligada";

    }

    //Métodos Especiais
    public boolean getLigatv() {
        return ligatv;
    }

    public void setLigatv(boolean ligatv) {
        this.ligatv = ligatv;
    }

    public int getNumcanal() {
        return numcanal;
    }

    public void setNumcanal(int numcanal) {
        this.numcanal = numcanal;
    }

    public int getNumvolume() {
        return numvolume;
    }

    public void setNumvolume(int numvolume) {
        this.numvolume = numvolume;
    }

    public String getStatusliga() {
        return statusliga;
    }

    public void setStatusliga(String statusliga) {
        this.statusliga = statusliga;
    }

    public String getStatusvol() {
        return statusvol;
    }

    public void setStatusvol(String statusvol) {
        this.statusvol = statusvol;
    }

    public int getPrecan() {
        return precan;
    }

    public void setPrecan(int precan) {
        this.precan = precan;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
