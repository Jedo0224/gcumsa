package gcumsa.domain;

import gcumsa.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "words", path = "words")
public interface WordRepository
    extends PagingAndSortingRepository<Word, Long> {}
