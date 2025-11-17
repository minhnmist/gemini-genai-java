package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ExternalApiElasticSearchParams extends ExternalApiElasticSearchParams {

  private final Optional<String> index;

  private final Optional<Integer> numHits;

  private final Optional<String> searchTemplate;

  private AutoValue_ExternalApiElasticSearchParams(
      Optional<String> index,
      Optional<Integer> numHits,
      Optional<String> searchTemplate) {
    this.index = index;
    this.numHits = numHits;
    this.searchTemplate = searchTemplate;
  }

  @JsonProperty("index")
  @Override
  public Optional<String> index() {
    return index;
  }

  @JsonProperty("numHits")
  @Override
  public Optional<Integer> numHits() {
    return numHits;
  }

  @JsonProperty("searchTemplate")
  @Override
  public Optional<String> searchTemplate() {
    return searchTemplate;
  }

  @Override
  public String toString() {
    return "ExternalApiElasticSearchParams{"
        + "index=" + index + ", "
        + "numHits=" + numHits + ", "
        + "searchTemplate=" + searchTemplate
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ExternalApiElasticSearchParams) {
      ExternalApiElasticSearchParams that = (ExternalApiElasticSearchParams) o;
      return this.index.equals(that.index())
          && this.numHits.equals(that.numHits())
          && this.searchTemplate.equals(that.searchTemplate());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= index.hashCode();
    h$ *= 1000003;
    h$ ^= numHits.hashCode();
    h$ *= 1000003;
    h$ ^= searchTemplate.hashCode();
    return h$;
  }

  @Override
  public ExternalApiElasticSearchParams.Builder toBuilder() {
    return new AutoValue_ExternalApiElasticSearchParams.Builder(this);
  }

  static final class Builder extends ExternalApiElasticSearchParams.Builder {
    private Optional<String> index = Optional.empty();
    private Optional<Integer> numHits = Optional.empty();
    private Optional<String> searchTemplate = Optional.empty();
    Builder() {
    }
    Builder(ExternalApiElasticSearchParams source) {
      this.index = source.index();
      this.numHits = source.numHits();
      this.searchTemplate = source.searchTemplate();
    }
    @Override
    public ExternalApiElasticSearchParams.Builder index(String index) {
      this.index = Optional.of(index);
      return this;
    }
    @Override
    ExternalApiElasticSearchParams.Builder index(Optional<String> index) {
      if (index == null) {
        throw new NullPointerException("Null index");
      }
      this.index = index;
      return this;
    }
    @Override
    public ExternalApiElasticSearchParams.Builder numHits(Integer numHits) {
      this.numHits = Optional.of(numHits);
      return this;
    }
    @Override
    ExternalApiElasticSearchParams.Builder numHits(Optional<Integer> numHits) {
      if (numHits == null) {
        throw new NullPointerException("Null numHits");
      }
      this.numHits = numHits;
      return this;
    }
    @Override
    public ExternalApiElasticSearchParams.Builder searchTemplate(String searchTemplate) {
      this.searchTemplate = Optional.of(searchTemplate);
      return this;
    }
    @Override
    ExternalApiElasticSearchParams.Builder searchTemplate(Optional<String> searchTemplate) {
      if (searchTemplate == null) {
        throw new NullPointerException("Null searchTemplate");
      }
      this.searchTemplate = searchTemplate;
      return this;
    }
    @Override
    public ExternalApiElasticSearchParams build() {
      return new AutoValue_ExternalApiElasticSearchParams(
          this.index,
          this.numHits,
          this.searchTemplate);
    }
  }

}
