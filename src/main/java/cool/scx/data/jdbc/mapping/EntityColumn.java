package cool.scx.data.jdbc.mapping;

import cool.scx.jdbc.mapping.Column;
import dev.scx.reflect.FieldInfo;

public interface EntityColumn extends Column {

    FieldInfo javaField();

}
