package org.bochman.microservices.e2e.repository.search;

import org.bochman.microservices.e2e.domain.Blog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Blog entity.
 */
public interface BlogSearchRepository extends ElasticsearchRepository<Blog, Long> {
}
