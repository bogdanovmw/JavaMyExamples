package org.example.MyWitcher.solid.lsp.exp1;

public class ClientTestProgram {
    public static void main(String[] args) {
        TorMediaPlayer torMediaPlayer = new TorMediaPlayer();
        torMediaPlayer.playAudio();
        torMediaPlayer.playVideo();

        VlcMediaPlayer vlcMediaPlayer = new VlcMediaPlayer();
        vlcMediaPlayer.playAudio();
        vlcMediaPlayer.playVideo();

        WinampMediaPlayer winampMediaPlayer = new WinampMediaPlayer();
        winampMediaPlayer.playAudio();
    }


}
