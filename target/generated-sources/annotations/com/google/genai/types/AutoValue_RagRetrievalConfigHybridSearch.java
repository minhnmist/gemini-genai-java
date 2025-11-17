package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RagRetrievalConfigHybridSearch extends RagRetrievalConfigHybridSearch {

  private final Optional<Float> alpha;

  private AutoValue_RagRetrievalConfigHybridSearch(
      Optional<Float> alpha) {
    this.alpha = alpha;
  }

  @JsonProperty("alpha")
  @Override
  public Optional<Float> alpha() {
    return alpha;
  }

  @Override
  public String toString() {
    return "RagRetrievalConfigHybridSearch{"
        + "alpha=" + alpha
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RagRetrievalConfigHybridSearch) {
      RagRetrievalConfigHybridSearch that = (RagRetrievalConfigHybridSearch) o;
      return this.alpha.equals(that.alpha());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= alpha.hashCode();
    return h$;
  }

  @Override
  public RagRetrievalConfigHybridSearch.Builder toBuilder() {
    return new AutoValue_RagRetrievalConfigHybridSearch.Builder(this);
  }

  static final class Builder extends RagRetrievalConfigHybridSearch.Builder {
    private Optional<Float> alpha = Optional.empty();
    Builder() {
    }
    Builder(RagRetrievalConfigHybridSearch source) {
      this.alpha = source.alpha();
    }
    @Override
    public RagRetrievalConfigHybridSearch.Builder alpha(Float alpha) {
      this.alpha = Optional.of(alpha);
      return this;
    }
    @Override
    RagRetrievalConfigHybridSearch.Builder alpha(Optional<Float> alpha) {
      if (alpha == null) {
        throw new NullPointerException("Null alpha");
      }
      this.alpha = alpha;
      return this;
    }
    @Override
    public RagRetrievalConfigHybridSearch build() {
      return new AutoValue_RagRetrievalConfigHybridSearch(
          this.alpha);
    }
  }

}
