package gcumsa.domain;

import gcumsa.domain.*;
import gcumsa.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class World extends AbstractEvent {

    private Long id;

    public World(Word aggregate) {
        super(aggregate);
    }

    public World() {
        super();
    }
}
