import java.lang.reflect.Field;

public class JsonSerializer {
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\":")
                    .append("\"").append(field.get(obj)).append("\",");
        }
        if (json.length() > 1) json.setLength(json.length() - 1);
        json.append("}");
        return json.toString();
    }
}
