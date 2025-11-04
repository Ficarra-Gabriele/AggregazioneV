/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainaggregazione;

import java.util.ArrayList;

/**
 *
 * @author ficarra.gabriele
 */
class Playlist {
    private String nome;
    private String proprietario;
    ArrayList brani = new ArrayList<Brano>();
    private Brano brano;
    
    public Playlist(String nome, String proprietario, String titolo, String artista, int durataSecondi ){
        this.nome = nome;
        this.proprietario = proprietario;
        this.brano = new Brano(titolo, artista, durataSecondi);
    }
    
    void aggiungi(Brano brano){
        brani.add(brano);
    }
    
    public Brano getBrani(){
        return brano;
    }
    
    @Override
    public String toString() {
    return nome + proprietario + brano ;
    }
}
