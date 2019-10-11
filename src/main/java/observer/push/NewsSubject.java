package observer.push;

import observer.push.NewsPaperObserver;

public interface NewsSubject {
    void addObserver(NewsPaperObserver observer);
    void removeObserver(NewsPaperObserver observer);
    void updateContent(String content);
    void notificationObserver();
}
