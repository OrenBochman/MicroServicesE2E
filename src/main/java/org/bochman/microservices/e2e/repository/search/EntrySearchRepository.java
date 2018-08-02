package org.bochman.microservices.e2e.repository.search;

import org.bochman.microservices.e2e.domain.Entry;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Entry entity.
 */
public interface EntrySearchRepository extends ElasticsearchRepository<Entry, Long> {
}
