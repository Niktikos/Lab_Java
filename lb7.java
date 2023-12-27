import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Comment {
    private String text;
    private int likes;
    private int dislikes;

    public Comment(String text, int likes, int dislikes) {
        this.text = text;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public int getLikes() {
        return likes;
    }
}

class Video {
    private String title;
    private String url;
    private int views;
    private int likes;
    private int dislikes;
    private List<Comment> comments;

    public Video(String title, String url, int views, int likes, int dislikes, List<Comment> comments) {
        this.title = title;
        this.url = url;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public String getTitle() {
        return title;
    }

    public List<Comment> getComments() {
        return comments;
    }
}

class VideoBlog {
    private String blogger;
    private List<Video> videos;

    public VideoBlog(String blogger, List<Video> videos) {
        this.blogger = blogger;
        this.videos = videos;
    }

    public Iterator<Video> getVideoIterator() {
        return videos.iterator();
    }

    public List<Video> videosWithMostDislikes() {
        List<Video> result = new ArrayList<>();
        int maxDislikes = 0;

        for (Video video : videos) {
            if (video.getDislikes() > maxDislikes) {
                maxDislikes = video.getDislikes();
                result.clear();
                result.add(video);
            } else if (video.getDislikes() == maxDislikes) {
                result.add(video);
            }
        }

        return result;
    }

    public boolean hasCommentWithMoreLikesThanVideo() {
        for (Video video : videos) {
            for (Comment comment : video.getComments()) {
                if (comment.getLikes() > video.getLikes()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getTotalViews() {
        int totalViews = 0;

        Iterator<Video> videoIterator = getVideoIterator();
        while (videoIterator.hasNext()) {
            Video video = videoIterator.next();
            totalViews += video.getViews();
        }

        return totalViews;
    }
}

public class lb7 {
    public static void main(String[] args) {
        // Створення об'єктів та виклик методів
        List<Comment> comments1 = new ArrayList<>();
        comments1.add(new Comment("Good video!", 10, 2));
        comments1.add(new Comment("Not bad.", 5, 1));
        Video video1 = new Video("Java Basics", "https://www.youtube.com/watch?v=abc123", 1000, 50, 5, comments1);

        List<Comment> comments2 = new ArrayList<>();
        comments2.add(new Comment("Awesome tutorial!", 20, 1));
        comments2.add(new Comment("I didn't understand anything.", 2, 15));
        Video video2 = new Video("Java Advanced", "https://www.youtube.com/watch?v=def456", 500, 30, 10, comments2);

        List<Video> videos = new ArrayList<>();
        videos.add(video1);
        videos.add(video2);

        VideoBlog videoBlog = new VideoBlog("JavaCoder", videos);

        // 1) Знайти загальну сумарну кількість переглядів усіх відео разом
        int totalViews = videoBlog.getTotalViews();
        System.out.println("Total Views: " + totalViews);

        // 2) Визначити, чи є коментар, що набрав лайків більше, ніж відео, до якого він дописаний
        boolean hasCommentWithMoreLikes = videoBlog.hasCommentWithMoreLikesThanVideo();
        System.out.println("Has comment with more likes than its video: " + hasCommentWithMoreLikes);

        // 3) Визначити відео, що набрало найбільшу кількість дізлайків
        List<Video> videosWithMostDislikes = videoBlog.videosWithMostDislikes();
        System.out.println("Videos with most dislikes: " + videosWithMostDislikes);
    }
}
