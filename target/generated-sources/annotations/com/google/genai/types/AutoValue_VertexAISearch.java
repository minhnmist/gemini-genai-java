package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_VertexAISearch extends VertexAISearch {

  private final Optional<List<VertexAISearchDataStoreSpec>> dataStoreSpecs;

  private final Optional<String> datastore;

  private final Optional<String> engine;

  private final Optional<String> filter;

  private final Optional<Integer> maxResults;

  private AutoValue_VertexAISearch(
      Optional<List<VertexAISearchDataStoreSpec>> dataStoreSpecs,
      Optional<String> datastore,
      Optional<String> engine,
      Optional<String> filter,
      Optional<Integer> maxResults) {
    this.dataStoreSpecs = dataStoreSpecs;
    this.datastore = datastore;
    this.engine = engine;
    this.filter = filter;
    this.maxResults = maxResults;
  }

  @JsonProperty("dataStoreSpecs")
  @Override
  public Optional<List<VertexAISearchDataStoreSpec>> dataStoreSpecs() {
    return dataStoreSpecs;
  }

  @JsonProperty("datastore")
  @Override
  public Optional<String> datastore() {
    return datastore;
  }

  @JsonProperty("engine")
  @Override
  public Optional<String> engine() {
    return engine;
  }

  @JsonProperty("filter")
  @Override
  public Optional<String> filter() {
    return filter;
  }

  @JsonProperty("maxResults")
  @Override
  public Optional<Integer> maxResults() {
    return maxResults;
  }

  @Override
  public String toString() {
    return "VertexAISearch{"
        + "dataStoreSpecs=" + dataStoreSpecs + ", "
        + "datastore=" + datastore + ", "
        + "engine=" + engine + ", "
        + "filter=" + filter + ", "
        + "maxResults=" + maxResults
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VertexAISearch) {
      VertexAISearch that = (VertexAISearch) o;
      return this.dataStoreSpecs.equals(that.dataStoreSpecs())
          && this.datastore.equals(that.datastore())
          && this.engine.equals(that.engine())
          && this.filter.equals(that.filter())
          && this.maxResults.equals(that.maxResults());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= dataStoreSpecs.hashCode();
    h$ *= 1000003;
    h$ ^= datastore.hashCode();
    h$ *= 1000003;
    h$ ^= engine.hashCode();
    h$ *= 1000003;
    h$ ^= filter.hashCode();
    h$ *= 1000003;
    h$ ^= maxResults.hashCode();
    return h$;
  }

  @Override
  public VertexAISearch.Builder toBuilder() {
    return new AutoValue_VertexAISearch.Builder(this);
  }

  static final class Builder extends VertexAISearch.Builder {
    private Optional<List<VertexAISearchDataStoreSpec>> dataStoreSpecs = Optional.empty();
    private Optional<String> datastore = Optional.empty();
    private Optional<String> engine = Optional.empty();
    private Optional<String> filter = Optional.empty();
    private Optional<Integer> maxResults = Optional.empty();
    Builder() {
    }
    Builder(VertexAISearch source) {
      this.dataStoreSpecs = source.dataStoreSpecs();
      this.datastore = source.datastore();
      this.engine = source.engine();
      this.filter = source.filter();
      this.maxResults = source.maxResults();
    }
    @Override
    public VertexAISearch.Builder dataStoreSpecs(List<VertexAISearchDataStoreSpec> dataStoreSpecs) {
      this.dataStoreSpecs = Optional.of(dataStoreSpecs);
      return this;
    }
    @Override
    VertexAISearch.Builder dataStoreSpecs(Optional<List<VertexAISearchDataStoreSpec>> dataStoreSpecs) {
      if (dataStoreSpecs == null) {
        throw new NullPointerException("Null dataStoreSpecs");
      }
      this.dataStoreSpecs = dataStoreSpecs;
      return this;
    }
    @Override
    public VertexAISearch.Builder datastore(String datastore) {
      this.datastore = Optional.of(datastore);
      return this;
    }
    @Override
    VertexAISearch.Builder datastore(Optional<String> datastore) {
      if (datastore == null) {
        throw new NullPointerException("Null datastore");
      }
      this.datastore = datastore;
      return this;
    }
    @Override
    public VertexAISearch.Builder engine(String engine) {
      this.engine = Optional.of(engine);
      return this;
    }
    @Override
    VertexAISearch.Builder engine(Optional<String> engine) {
      if (engine == null) {
        throw new NullPointerException("Null engine");
      }
      this.engine = engine;
      return this;
    }
    @Override
    public VertexAISearch.Builder filter(String filter) {
      this.filter = Optional.of(filter);
      return this;
    }
    @Override
    VertexAISearch.Builder filter(Optional<String> filter) {
      if (filter == null) {
        throw new NullPointerException("Null filter");
      }
      this.filter = filter;
      return this;
    }
    @Override
    public VertexAISearch.Builder maxResults(Integer maxResults) {
      this.maxResults = Optional.of(maxResults);
      return this;
    }
    @Override
    VertexAISearch.Builder maxResults(Optional<Integer> maxResults) {
      if (maxResults == null) {
        throw new NullPointerException("Null maxResults");
      }
      this.maxResults = maxResults;
      return this;
    }
    @Override
    public VertexAISearch build() {
      return new AutoValue_VertexAISearch(
          this.dataStoreSpecs,
          this.datastore,
          this.engine,
          this.filter,
          this.maxResults);
    }
  }

}
