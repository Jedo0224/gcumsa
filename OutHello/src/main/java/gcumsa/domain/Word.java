package gcumsa.domain;

import gcumsa.OutHelloApplication;
import gcumsa.domain.World;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Word_table")
@Data
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        World world = new World(this);
        world.publishAfterCommit();
    }

    public static WordRepository repository() {
        WordRepository wordRepository = OutHelloApplication.applicationContext.getBean(
            WordRepository.class
        );
        return wordRepository;
    }
}
