package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RagRetrievalConfigRankingRankService extends RagRetrievalConfigRankingRankService {

  private final Optional<String> modelName;

  private AutoValue_RagRetrievalConfigRankingRankService(
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
    return "RagRetrievalConfigRankingRankService{"
        + "modelName=" + modelName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RagRetrievalConfigRankingRankService) {
      RagRetrievalConfigRankingRankService that = (RagRetrievalConfigRankingRankService) o;
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
  public RagRetrievalConfigRankingRankService.Builder toBuilder() {
    return new AutoValue_RagRetrievalConfigRankingRankService.Builder(this);
  }

  static final class Builder extends RagRetrievalConfigRankingRankService.Builder {
    private Optional<String> modelName = Optional.empty();
    Builder() {
    }
    Builder(RagRetrievalConfigRankingRankService source) {
      this.modelName = source.modelName();
    }
    @Override
    public RagRetrievalConfigRankingRankService.Builder modelName(String modelName) {
      this.modelName = Optional.of(modelName);
      return this;
    }
    @Override
    RagRetrievalConfigRankingRankService.Builder modelName(Optional<String> modelName) {
      if (modelName == null) {
        throw new NullPointerException("Null modelName");
      }
      this.modelName = modelName;
      return this;
    }
    @Override
    public RagRetrievalConfigRankingRankService build() {
      return new AutoValue_RagRetrievalConfigRankingRankService(
          this.modelName);
    }
  }

}
