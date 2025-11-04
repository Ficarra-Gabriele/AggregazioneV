/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainaggregazione;

/**
 *
 * @author ficarra.gabriele
 */
class Brano {
    private String titolo;
    private String artista;
    private int durataSecondi;
    
    public Brano(String titolo, String artista,int durataSecondi){
        this.artista = artista;
        this.durataSecondi = durataSecondi;
        this.titolo = titolo;
    }
    
    
    
    @Override
    public String toString() {
    return titolo + artista + durataSecondi;
    }
}
