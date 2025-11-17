package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_VertexAISearchDataStoreSpec extends VertexAISearchDataStoreSpec {

  private final Optional<String> dataStore;

  private final Optional<String> filter;

  private AutoValue_VertexAISearchDataStoreSpec(
      Optional<String> dataStore,
      Optional<String> filter) {
    this.dataStore = dataStore;
    this.filter = filter;
  }

  @JsonProperty("dataStore")
  @Override
  public Optional<String> dataStore() {
    return dataStore;
  }

  @JsonProperty("filter")
  @Override
  public Optional<String> filter() {
    return filter;
  }

  @Override
  public String toString() {
    return "VertexAISearchDataStoreSpec{"
        + "dataStore=" + dataStore + ", "
        + "filter=" + filter
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VertexAISearchDataStoreSpec) {
      VertexAISearchDataStoreSpec that = (VertexAISearchDataStoreSpec) o;
      return this.dataStore.equals(that.dataStore())
          && this.filter.equals(that.filter());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= dataStore.hashCode();
    h$ *= 1000003;
    h$ ^= filter.hashCode();
    return h$;
  }

  @Override
  public VertexAISearchDataStoreSpec.Builder toBuilder() {
    return new AutoValue_VertexAISearchDataStoreSpec.Builder(this);
  }

  static final class Builder extends VertexAISearchDataStoreSpec.Builder {
    private Optional<String> dataStore = Optional.empty();
    private Optional<String> filter = Optional.empty();
    Builder() {
    }
    Builder(VertexAISearchDataStoreSpec source) {
      this.dataStore = source.dataStore();
      this.filter = source.filter();
    }
    @Override
    public VertexAISearchDataStoreSpec.Builder dataStore(String dataStore) {
      this.dataStore = Optional.of(dataStore);
      return this;
    }
    @Override
    VertexAISearchDataStoreSpec.Builder dataStore(Optional<String> dataStore) {
      if (dataStore == null) {
        throw new NullPointerException("Null dataStore");
      }
      this.dataStore = dataStore;
      return this;
    }
    @Override
    public VertexAISearchDataStoreSpec.Builder filter(String filter) {
      this.filter = Optional.of(filter);
      return this;
    }
    @Override
    VertexAISearchDataStoreSpec.Builder filter(Optional<String> filter) {
      if (filter == null) {
        throw new NullPointerException("Null filter");
      }
      this.filter = filter;
      return this;
    }
    @Override
    public VertexAISearchDataStoreSpec build() {
      return new AutoValue_VertexAISearchDataStoreSpec(
          this.dataStore,
          this.filter);
    }
  }

}
