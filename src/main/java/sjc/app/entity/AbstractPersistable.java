package sjc.app.entity;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractPersistable implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
