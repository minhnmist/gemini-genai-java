package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RagRetrievalConfigRankingLlmRanker extends RagRetrievalConfigRankingLlmRanker {

  private final Optional<String> modelName;

  private AutoValue_RagRetrievalConfigRankingLlmRanker(
      Optional<String> modelName) {
    this.modelName = modelName;
  }

  @JsonProperty("modelName")
  @Override
  public Optional<String> modelName() {
    return modelName;
  }

  @Override
  public String toString() {
    return "RagRetrievalConfigRankingLlmRanker{"
        + "modelName=" + modelName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RagRetrievalConfigRankingLlmRanker) {
      RagRetrievalConfigRankingLlmRanker that = (RagRetrievalConfigRankingLlmRanker) o;
      return this.modelName.equals(that.modelName());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= modelName.hashCode();
    return h$;
  }

  @Override
  public RagRetrievalConfigRankingLlmRanker.Builder toBuilder() {
    return new AutoValue_RagRetrievalConfigRankingLlmRanker.Builder(this);
  }

  static final class Builder extends RagRetrievalConfigRankingLlmRanker.Builder {
    private Optional<String> modelName = Optional.empty();
    Builder() {
    }
    Builder(RagRetrievalConfigRankingLlmRanker source) {
      this.modelName = source.modelName();
    }
    @Override
    public RagRetrievalConfigRankingLlmRanker.Builder modelName(String modelName) {
      this.modelName = Optional.of(modelName);
      return this;
    }
    @Override
    RagRetrievalConfigRankingLlmRanker.Builder modelName(Optional<String> modelName) {
      if (modelName == null) {
        throw new NullPointerException("Null modelName");
      }
      this.modelName = modelName;
      return this;
    }
    @Override
    public RagRetrievalConfigRankingLlmRanker build() {
      return new AutoValue_RagRetrievalConfigRankingLlmRanker(
          this.modelName);
    }
  }

}
