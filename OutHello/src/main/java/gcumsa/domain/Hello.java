package gcumsa.domain;

import gcumsa.domain.*;
import gcumsa.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Hello extends AbstractEvent {

    private Long id;
    private String hello;
}
