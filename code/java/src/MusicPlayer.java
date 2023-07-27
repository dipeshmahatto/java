
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MusicPlayer implements ActionListener {
    JFrame jf = new JFrame();
    JButton b0, b1, b2, b3, b4;
    JTextField textField = new JTextField();
    JTextField textField1 = new JTextField();

    Clip clip;
    boolean isPlaying = false;

    MusicPlayer() {
        jf.setSize(400, 400);
        jf.setVisible(true);
        jf.setLayout(null);

        b0 = new JButton();
        b0.setText("Select");
        b0.setBounds(0, 50, 400, 40);
        b0.addActionListener(this);

        textField.setBounds(0, 100, 400, 40);
        textField.setEditable(false);

        textField1.setBounds(0, 150, 400, 40);
        textField1.setEditable(false);


        b1 = new JButton("Play");
        b1.setBounds(0, 310, 130, 50);
        b1.addActionListener(this);

        b2 = new JButton("Pause");
        b2.setBounds(130, 310, 130, 50);
        b2.addActionListener(this);

//        b3 = new JButton("Next");
//        b3.setBounds(180, 310, 90, 50);
//        b3.addActionListener(this);

        b4 = new JButton("Close");
        b4.setBounds(260, 310, 130, 50);
        b4.addActionListener(this);

        jf.add(textField);
        jf.add(textField1);
        jf.add(b0);
        jf.add(b1);
        jf.add(b2);
//        jf.add(b3);
        jf.add(b4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                String filePath = chooser.getSelectedFile().getAbsolutePath();
                textField.setText(filePath);
                textField1.setText("Music is select successfully");
                textField1.setBackground(Color.green);
            }
        } else if (e.getSource() == b1) {
            String filePath = textField.getText();
            if (!filePath.isEmpty()) {
                if (!isPlaying) {
                    playMusic(filePath);
                    isPlaying = true;
                    textField1.setText("Music is playing");
                } else {
                    textField1.setText("Music is already playing.");
                }
            } else {
                textField1.setText("Please select a music file first.");
                textField1.setBackground(Color.red);
            }
        } else if (e.getSource() == b2) {
            pauseMusic();
        }
//        else if (e.getSource() == b3) {
//            playNextTrack();
//        }
        else if (e.getSource() == b4) {
            closePlayer();
        }
    }

    private void playMusic(String filePath) {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(filePath));
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            textField1.setText("Error playing the music file !!!");
            textField1.setBackground(Color.red);
        }
    }

    private void pauseMusic() {
        if (isPlaying) {
            clip.stop();
            isPlaying = false;
            textField1.setText("Music is Paused");
        } else {
            textField1.setText("Already Paused !!!");
        }
    }
//
//    private void playNextTrack() {
//        pauseMusic();
//        String filePath = textField.getText();
//        if (!filePath.isEmpty()) {
//            playMusic(filePath);
//            isPlaying = true;
//        } else {
//            textField1.setText("Please select a music file first.");
//        }
//    }

    private void closePlayer() {
        pauseMusic();
        jf.dispose();
    }

    public static void main(String[] args) {
        new MusicPlayer();
    }
}
