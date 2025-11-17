package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateEmbeddingsBatchJobParameters extends CreateEmbeddingsBatchJobParameters {

  private final Optional<String> model;

  private final Optional<EmbeddingsBatchJobSource> src;

  private final Optional<CreateEmbeddingsBatchJobConfig> config;

  private AutoValue_CreateEmbeddingsBatchJobParameters(
      Optional<String> model,
      Optional<EmbeddingsBatchJobSource> src,
      Optional<CreateEmbeddingsBatchJobConfig> config) {
    this.model = model;
    this.src = src;
    this.config = config;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
  }

  @JsonProperty("src")
  @Override
  public Optional<EmbeddingsBatchJobSource> src() {
    return src;
  }

  @JsonProperty("config")
  @Override
  public Optional<CreateEmbeddingsBatchJobConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "CreateEmbeddingsBatchJobParameters{"
        + "model=" + model + ", "
        + "src=" + src + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateEmbeddingsBatchJobParameters) {
      CreateEmbeddingsBatchJobParameters that = (CreateEmbeddingsBatchJobParameters) o;
      return this.model.equals(that.model())
          && this.src.equals(that.src())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= model.hashCode();
    h$ *= 1000003;
    h$ ^= src.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public CreateEmbeddingsBatchJobParameters.Builder toBuilder() {
    return new AutoValue_CreateEmbeddingsBatchJobParameters.Builder(this);
  }

  static final class Builder extends CreateEmbeddingsBatchJobParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<EmbeddingsBatchJobSource> src = Optional.empty();
    private Optional<CreateEmbeddingsBatchJobConfig> config = Optional.empty();
    Builder() {
    }
    Builder(CreateEmbeddingsBatchJobParameters source) {
      this.model = source.model();
      this.src = source.src();
      this.config = source.config();
    }
    @Override
    public CreateEmbeddingsBatchJobParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    CreateEmbeddingsBatchJobParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public CreateEmbeddingsBatchJobParameters.Builder src(EmbeddingsBatchJobSource src) {
      this.src = Optional.of(src);
      return this;
    }
    @Override
    CreateEmbeddingsBatchJobParameters.Builder src(Optional<EmbeddingsBatchJobSource> src) {
      if (src == null) {
        throw new NullPointerException("Null src");
      }
      this.src = src;
      return this;
    }
    @Override
    public CreateEmbeddingsBatchJobParameters.Builder config(CreateEmbeddingsBatchJobConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    CreateEmbeddingsBatchJobParameters.Builder config(Optional<CreateEmbeddingsBatchJobConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public CreateEmbeddingsBatchJobParameters build() {
      return new AutoValue_CreateEmbeddingsBatchJobParameters(
          this.model,
          this.src,
          this.config);
    }
  }

}
