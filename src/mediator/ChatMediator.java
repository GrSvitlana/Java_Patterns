package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Chat{
    List<Collegue> list = new ArrayList<>();

    @Override
    public void sendMessage(String message, Collegue me) {
        list.forEach(collegue -> {
            if(collegue != me ) {
                collegue.printMessage(message);
            }
        });
    }

    @Override
    public void addCollegue(Collegue collegue) {
        list.add(collegue);
    }
}