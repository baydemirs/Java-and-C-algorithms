import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Activity> activities = List.of(
                new Activity("A", 1, 4),
                new Activity("B", 3, 5),
                new Activity("C", 0, 6),
                new Activity("D", 5, 7),
                new Activity("E", 8, 9),
                new Activity("F", 5, 9));

        System.out.println("Secilen etkinlikler: " + selectActivities(activities));
    }

    record Activity(String name, int start, int end) {
        Activity {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Etkinlik adi bos olamaz.");
            }
            if (start < 0 || end <= start) {
                throw new IllegalArgumentException("Etkinlik zaman araligi gecersiz.");
            }
        }
    }

    static List<Activity> selectActivities(List<Activity> activities) {
        if (activities == null) {
            throw new IllegalArgumentException("Etkinlik listesi null olamaz.");
        }
        List<Activity> sorted = new ArrayList<>(activities);
        if (sorted.stream().anyMatch(activity -> activity == null)) {
            throw new IllegalArgumentException("Etkinlik null olamaz.");
        }
        sorted.sort(Comparator.comparingInt(Activity::end));

        List<Activity> selected = new ArrayList<>();
        int lastEnd = -1;
        for (Activity activity : sorted) {
            if (activity.start() >= lastEnd) {
                selected.add(activity);
                lastEnd = activity.end();
            }
        }
        return List.copyOf(selected);
    }
}

