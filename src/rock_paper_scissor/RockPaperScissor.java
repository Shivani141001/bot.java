package rock_paper_scissor;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class RockPaperScissor {

        public void PlayRockPaperScissor () {
            String url = "https://www.afiniti.com/corporate/rock-paper-scissors";
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI(url));
                } catch (IOException | URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            } else {
                Runtime runtime = Runtime.getRuntime();
                try {
                    runtime.exec("xdg-open " + url);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


