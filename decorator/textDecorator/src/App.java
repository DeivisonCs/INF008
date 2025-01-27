import decorator.CountLineDecorator;
import decorator.NumLinesDecorator;
import decorator.TitleDecorator;
import model.Lyric;
import model.Text;

public class App {
    public static void main(String[] args) throws Exception {
        // Text text = new Lyric();

        // while(text.hasNext())
        //     System.out.println(text.read());


        Text lyrics_w_count = new CountLineDecorator(new Lyric());

        while(lyrics_w_count.hasNext())
            System.out.println(lyrics_w_count.read());
            

        Text lyrics_w_title = new TitleDecorator(new Lyric(), "My Lyrics");

        while(lyrics_w_title.hasNext())
            System.out.println(lyrics_w_title.read());


        Text lyrics_title_lyrics = new TitleDecorator(new CountLineDecorator(new Lyric()), "My Lyrics");

        while(lyrics_title_lyrics.hasNext())
            System.out.println(lyrics_title_lyrics.read());

            
        Text lyrics_max_line = new NumLinesDecorator((new Lyric()));

        while(lyrics_max_line.hasNext())
            System.out.println(lyrics_max_line.read());

        Text all_decorators = 
            new NumLinesDecorator(
            new CountLineDecorator(
            new TitleDecorator(new Lyric(), "My Lyrics")));

        while(all_decorators.hasNext())
            System.out.println(all_decorators.read());
    }
}
