import java.util.Set;

public interface PreferencesService {
    Set<Preference> get(String userId);
}

